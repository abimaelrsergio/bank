package com.bank.cards.audit;

import org.springframework.data.domain.*;
import org.springframework.stereotype.*;

import java.util.*;

@Component("auditAwareImpl")
public class AuditAwareImpl implements AuditorAware<String> {

    /**
     * Returns the current auditor of the application
     *
     * @return current auditor
     */
    @Override
    public Optional<String> getCurrentAuditor() {
        return Optional.of("CARDS_MS");
    }
}
