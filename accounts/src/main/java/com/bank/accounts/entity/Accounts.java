package com.bank.accounts.entity;

import jakarta.persistence.*;
import lombok.*;

@Getter
@Setter
@ToString
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Accounts extends BaseEntity {

    @Id
    @Column(name = "accounts_number")
    private Long accountNumber;

    @Column(name = "customer_id")
    private Long customerId;

    @Column(name = "accountType")
    private String accountType;

    @Column(name = "branch_address")
    private String branchAddress;
}
