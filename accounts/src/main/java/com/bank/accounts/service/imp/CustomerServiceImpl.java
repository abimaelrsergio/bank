package com.bank.accounts.service.imp;

import com.bank.accounts.dto.*;
import com.bank.accounts.exception.*;
import com.bank.accounts.mapper.*;
import com.bank.accounts.repository.*;
import com.bank.accounts.service.*;
import com.bank.accounts.service.client.*;
import lombok.*;
import org.springframework.http.*;
import org.springframework.stereotype.*;

@Service
@AllArgsConstructor
public class CustomerServiceImpl implements ICustomerService {

    private AccountsRepository accountsRepository;
    private CustomerRepository customerRepository;
    private CardsFeignClient cardsFeignClient;
    private LoansFeignClient loansFeignClient;

    /**
     * Retorna o customer Details preenchido com dados de Cards e Laans inclusive
     *
     * @param mobileNumber  - Input mobole number
     * @param correlationId
     * @return Customer Details based on the given mobile number
     */
    @Override
    public CustomerDetailsDto fetchCustomerDetails(String mobileNumber, String correlationId) {
        var customer = customerRepository.findByMobileNumber(mobileNumber).orElseThrow(
                () -> new ResourceNotFoundException("Customer", "mobileNumber", mobileNumber)
        );
        var account = accountsRepository.findByCustomerId(customer.getCustomerId()).orElseThrow(
                () -> new ResourceNotFoundException("Accounts", "customerId", customer.getCustomerId().toString())
        );
        ResponseEntity<LoansDto> loansDtoResponseEntity = loansFeignClient.fetchLoanDetails(correlationId, mobileNumber);
        ResponseEntity<CardsDto> cardsDtoResponseEntity = cardsFeignClient.fetchCardDetails(correlationId, mobileNumber);

        var customerDetailsDto = CustomerMapper.mapToCustomerDetailsDto(customer, new CustomerDetailsDto());
        var accountsDto = AccountsMapper.mapToAccountsDto(account, new AccountsDto());
        customerDetailsDto.setAccountsDto(accountsDto);
        customerDetailsDto.setLoansDto(loansDtoResponseEntity.getBody());
        customerDetailsDto.setCardsDto(cardsDtoResponseEntity.getBody());

        return customerDetailsDto;
    }
}
