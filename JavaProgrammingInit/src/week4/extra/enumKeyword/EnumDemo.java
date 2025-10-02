package week4.extra.enumKeyword;

import week4.extra.enumKeyword.models.Plan;

public class EnumDemo {
    public static void main(String[] args) {
        for (Plan p : Plan.values()) {
            System.out.printf("%s: $%s/mo -> %s%n",
                    p.name(), p.monthlyCost(), p.features());
        }

        // Use switch on enum
        Plan chosen = Plan.PRO;
        switch (chosen) {
            case BASIC -> System.out.println("Good starter choice!");
            case PRO -> System.out.println("Nice balance of power and price.");
            case ENTERPRISE -> System.out.println("Top tier—let's talk SLAs.");
        }
    }
}
