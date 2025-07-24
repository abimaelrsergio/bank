package com.bank.accounts.entity;

import jakarta.persistence.*;
import lombok.*;

import java.time.*;

@MappedSuperclass
@Getter
@Setter
@ToString
public class BaseEntity {

    @Column(updatable = false)
    private String createdBy;

    @Column(updatable = false)
    private LocalDateTime createdAt;

    @Column(insertable = false)
    private LocalDateTime updatedAt;

    @Column(insertable = false)
    private String updatedBy;

}
