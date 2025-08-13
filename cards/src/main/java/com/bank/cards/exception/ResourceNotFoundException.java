package com.bank.cards.exception;

public class ResourceNotFoundException extends RuntimeException {
    public ResourceNotFoundException(String resourceName, String fileName, String fieldName){
        super(String.format("%s not found with the given input data %s : '%s'",resourceName, fileName, fieldName));
    }
}
