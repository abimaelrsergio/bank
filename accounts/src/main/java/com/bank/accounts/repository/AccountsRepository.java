package com.bank.accounts.repository;

import org.springframework.data.jpa.repository.*;
import org.springframework.stereotype.*;

@Repository
public interface AccountsRepository extends JpaRepository<AccountsRepository, Long> {
}
