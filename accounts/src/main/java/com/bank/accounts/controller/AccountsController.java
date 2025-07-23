package com.bank.accounts.controller;

import org.springframework.web.bind.annotation.*;

@RestController
public class AccountsController {

    @GetMapping("/sayHello")
    public String sayHello() {
        return "Hello World 2";
    }
}
