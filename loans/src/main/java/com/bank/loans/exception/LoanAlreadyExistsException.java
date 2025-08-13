package com.bank.loans.exception;

public class LoanAlreadyExistsException extends RuntimeException {

    public LoanAlreadyExistsException(String message) {
        super(message);
    }
}
