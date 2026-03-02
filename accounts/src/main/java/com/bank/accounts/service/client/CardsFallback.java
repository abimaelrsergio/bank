package com.bank.accounts.service.client;

import com.bank.accounts.dto.*;
import org.springframework.http.*;
import org.springframework.stereotype.*;

@Component
public class CardsFallback implements CardsFeignClient {

    @Override
    public ResponseEntity<CardsDto> fetchCardDetails(String correlationId, String mobileNumber) {
        return null;
    }

}
