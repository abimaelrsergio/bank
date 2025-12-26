package com.bank.accounts.service.client;

import com.bank.accounts.dto.*;
import org.springframework.cloud.openfeign.*;
import org.springframework.http.*;
import org.springframework.web.bind.annotation.*;

@FeignClient("cards")
public interface CardsFeignClient {

    @GetMapping(value = "/api/v1/cards", consumes =  MediaType.APPLICATION_JSON_VALUE)
    ResponseEntity<CardsDto> fetchCardDetails(@RequestHeader("bank-correlation-id") String correlationId, @RequestParam String mobileNumber);
}
