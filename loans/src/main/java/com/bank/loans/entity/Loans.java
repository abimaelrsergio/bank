package com.bank.loans.entity;

import jakarta.persistence.*;
import lombok.*;

@Getter
@Setter
@ToString
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Loans extends BaseEntity{

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "loan_id")
    private Long loanId;

    @Column(name = "mobile_number")
    private String mobileNumber;

    private String loanNumber;

    private String loanType;

    private int totalLoan;

    private int amountPaid;

    private int outstandingAmount;

}
