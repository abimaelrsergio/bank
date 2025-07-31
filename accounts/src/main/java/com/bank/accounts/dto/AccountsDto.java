package com.bank.accounts.dto;

import jakarta.validation.constraints.*;
import lombok.*;

@Data
public class AccountsDto {

    @NotEmpty
    @Pattern(regexp = "(^$|[0-9]{11})", message = "AccountNumber must be 11 digits")
    private Long accountNumber;

    @NotEmpty(message = "AccountType cannot be null or empty")
    private String accountType;

    @NotEmpty(message = "BranchAddress cannot be null or empty")
    private String branchAddress;
}
