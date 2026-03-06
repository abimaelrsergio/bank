package com.bank.loans.dto;

import lombok.*;
import org.springframework.boot.context.properties.*;

import java.util.*;

@ConfigurationProperties(prefix = "loans")
@Getter
@Setter
public class LoansContactInfoDto {
    private String message;
    private Map<String, String> contactDetails;
    private List<String> onCallSupport;
}
