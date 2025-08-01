package com.bank.accounts.audit;

import org.springframework.data.domain.*;
import org.springframework.stereotype.*;

import java.util.*;

@Component("auditAwareImpl")
public class AuditAwareImpl implements AuditorAware<String> {

    /**
     * Returns the current auditor of the application.
     *
     * @return The current auditor.
     */
    @Override
    public Optional<String> getCurrentAuditor() {
        return Optional.of("ACCOUNTS_MS");
    }
}
