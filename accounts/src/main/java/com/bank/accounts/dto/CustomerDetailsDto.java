package com.bank.accounts.dto;

import io.swagger.v3.oas.annotations.media.*;
import jakarta.validation.constraints.*;
import lombok.*;

@Schema(
        name = "CustomerDetails",
        description = "Schema to hold Customer, Cards and loans information"
)
@Data
public class CustomerDetailsDto {

    @Schema(description = "Name of the customer", example = "Abimael Sergio")
    @NotEmpty(message = "Name cannot be null or empty")
    @Size(min = 5, max = 30, message = "The length of the customer name should be between 5 and 30")
    private String name;

    @Schema(description = "Email address of the customer", example = "abimaelr.sergio@gmail.com")
    @NotEmpty(message = "Email address cannot be a null or empty")
    @Email(message = "Email address should be a valid value")
    private String email;

    @Schema(description = "Mobile Number of the customer", example = "11995217378")
    @Pattern(regexp = "(^$|[0-9]{11})", message = "Mobile number must be 11 digits")
    private String mobileNumber;

    @Schema(description = "Account details of the Customer")
    private AccountsDto accountsDto;

    @Schema(description = "Cards details of the Customer")
    private CardsDto cardsDto;

    @Schema(description = "Loans details of the Customer")
    private LoansDto loansDto;

}
