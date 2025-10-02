package week4.extra.enumKeyword.models;

import java.math.BigDecimal;

public enum Plan {
    BASIC(new BigDecimal("9.99")),
    PRO(new BigDecimal("19.99")),
    ENTERPRISE(new BigDecimal("49.99"));

    private final BigDecimal monthlyCost;

    Plan(BigDecimal monthlyCost) {
        this.monthlyCost = monthlyCost;
    }

    public BigDecimal monthlyCost() { return monthlyCost; }

    public String features() {
        return switch (this) {
            case BASIC -> "1 project, community support";
            case PRO -> "10 projects, email support";
            case ENTERPRISE -> "Unlimited projects, 24/7 support";
        };
    }
}
