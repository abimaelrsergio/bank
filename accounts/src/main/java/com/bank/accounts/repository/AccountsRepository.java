package com.bank.accounts.repository;

import com.bank.accounts.entity.*;
import org.springframework.data.jpa.repository.*;
import org.springframework.stereotype.*;

import java.util.*;

@Repository
public interface AccountsRepository extends JpaRepository<Accounts, Long> {

    /**
     * Find account by customer id
     * @param customerId the uniq identifier
     * @return An Account
     */
    Optional<Accounts> findByCustomerId(Long customerId);

    /**
     * Delete the Account by customer id
     *
     * @param customerId the uniq customer identifier
     */
    void deleteByCustomerId(Long customerId);
}
