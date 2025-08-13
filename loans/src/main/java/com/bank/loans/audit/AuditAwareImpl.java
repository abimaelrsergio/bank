package com.bank.loans.audit;

import org.springframework.data.domain.*;
import org.springframework.stereotype.*;

import java.util.*;

@Component("auditAwareImpl")
public class AuditAwareImpl implements AuditorAware<String> {

    /**
     * Returns the current audito of the application
     *
     * @return the current auditor
     */
    @Override
    public Optional<String> getCurrentAuditor() {
        return Optional.of("LOANS_MS");
    }
}
