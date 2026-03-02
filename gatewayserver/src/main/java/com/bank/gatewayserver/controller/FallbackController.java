package com.bank.gatewayserver.controller;

import org.springframework.web.bind.annotation.*;
import reactor.core.publisher.*;

@RestController
public class FallbackController {

    @RequestMapping("/contactSupport")
    public Mono<String> contactSupport(){
        return Mono.just("Ocorreu um erro. Por favor, aguarde algum tempo ou entre em contato com o suporte");
    }

}
