package com.bank.accounts.service;

import com.bank.accounts.dto.*;

public interface ICustomerService {

    /**
     * Retorna o customer Details preenchido com dados de Cards e Laans inclusive
     *
     * @param mobileNumber  - Input mobole number
     * @param correlationId
     * @return Customer Details based on the given mobile number
     */
    CustomerDetailsDto fetchCustomerDetails(String mobileNumber, String correlationId);

}
