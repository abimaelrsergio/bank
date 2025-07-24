package com.bank.accounts.repository;

import com.bank.accounts.entity.*;
import org.springframework.data.jpa.repository.*;
import org.springframework.stereotype.*;

@Repository
public interface CustomerRepository extends JpaRepository<Customer, Long> {
}
