package com.bank.cards.dto;

import io.swagger.v3.oas.annotations.media.*;
import jakarta.validation.constraints.*;
import lombok.*;

@Schema(
        name = "Cards",
        description = "Schema to hold Card information"
)
@Data
public class CardsDto {

    @Schema(description = "Mobile Number of Customer", example = "11995217378")
    @NotEmpty(message = "Mobile Number can not be a null or empty")
    @Pattern(regexp = "(^$|[0-9]{11})", message = "Mobile Number must be 11 digits")
    private String mobileNumber;

    @Schema(description = "Card Number of the customer", example = "100646930341")
    @NotEmpty(message = "Card Numver can not be a null or empty")
    @Pattern(regexp = "(^$|[0-9]{12})", message = "CardNumber must be 12 digits")
    private String cardNumber;

    @Schema(description = "Type of the card", example = "Credit card")
    @NotEmpty(message = "CardType can not be a null or empty")
    private String cardType;

    @Schema(description = "Total amount limit available against a card", example = "100000")
    @Positive(message = "Total card limit should be greater than zero")
    private int totalLimit;

    @Schema(description = "Total amount used by a Customer", example = "1000")
    @PositiveOrZero(message = "Total amount used should be equal or greater than zero")
    private int amountUsed;

    @Schema(description = "Total available amount against a card", example = "90000")
    @PositiveOrZero(message = "Total available amount should be equal or greater than zero")
    private int availableAmount;
}
