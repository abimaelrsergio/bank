package com.bank.accounts.dto;

import io.swagger.v3.oas.annotations.media.*;
import jakarta.validation.constraints.*;
import lombok.*;

@Schema(
        name = "Accounts",
        description = "Schema to hold Account information"
)
@Data
public class AccountsDto {

    @Schema(description = "Account number of Bank account", example = "1234567890")
    @NotEmpty
    @Pattern(regexp = "(^$|[0-9]{11})", message = "AccountNumber must be 11 digits")
    private Long accountNumber;

    @Schema(description = "Account type of Bank account", example = "Savings")
    @NotEmpty(message = "AccountType cannot be null or empty")
    private String accountType;

    @Schema(description = "Bank branch address", example = "Rua Urbano Contesine, 6 parque Selecta, São Bernardo do Campo - SP")
    @NotEmpty(message = "BranchAddress cannot be null or empty")
    private String branchAddress;
}
