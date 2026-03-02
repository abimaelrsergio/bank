package com.bank.accounts.service.client;

import com.bank.accounts.dto.*;
import org.springframework.http.*;
import org.springframework.stereotype.*;

@Component
public class LoansFallback implements LoansFeignClient {

    @Override
    public ResponseEntity<LoansDto> fetchLoanDetails(String correlationId, String mobileNumber) {
        return null;
    }

}
