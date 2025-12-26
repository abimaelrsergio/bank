package com.bank.accounts.service.client;

import com.bank.accounts.dto.*;
import org.springframework.cloud.openfeign.*;
import org.springframework.http.*;
import org.springframework.web.bind.annotation.*;

@FeignClient("loans")
public interface LoansFeignClient {

    @GetMapping(value = "/api/v1/loans", consumes =   MediaType.APPLICATION_JSON_VALUE)
    ResponseEntity<LoansDto> fetchLoanDetails(@RequestHeader("bank-correlation-id") String correlationId, @RequestParam String mobileNumber);

}
