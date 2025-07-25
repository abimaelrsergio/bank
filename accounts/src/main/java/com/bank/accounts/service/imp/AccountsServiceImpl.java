package com.bank.accounts.service.imp;

import com.bank.accounts.dto.*;
import com.bank.accounts.repository.*;
import com.bank.accounts.service.*;
import lombok.*;
import org.springframework.stereotype.*;

@Service
@AllArgsConstructor
public class AccountsServiceImpl implements IAccountsService {

    private AccountsRepository accountsRepository;
    private CustomerRepository customerRepository;

    /**
     * Add an account
     *
     * @param customerDto
     */
    @Override
    public void createAccount(CustomerDto customerDto) {

    }
}
