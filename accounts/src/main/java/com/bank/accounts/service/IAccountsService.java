package com.bank.accounts.service;

import com.bank.accounts.dto.*;

public interface IAccountsService {

    /**
     * Add an account
     *
     * @param customerDto
     */
    void createAccount(CustomerDto customerDto);
}
