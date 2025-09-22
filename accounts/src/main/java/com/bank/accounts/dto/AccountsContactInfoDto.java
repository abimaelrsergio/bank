package com.bank.accounts.dto;

import lombok.*;
import org.springframework.boot.context.properties.*;

import java.util.*;

@ConfigurationProperties(prefix = "accounts")
@Getter
@Setter
public class AccountsContactInfoDto{
    private String message;
    private Map<String, String> contactDetails;
    private List<String> onCallSupport;
}
