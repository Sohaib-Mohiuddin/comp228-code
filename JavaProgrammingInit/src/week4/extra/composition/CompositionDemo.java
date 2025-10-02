package week4.extra.composition;

import week4.extra.composition.models.*;

public class CompositionDemo {
    public static void main(String[] args) {
        Employee e = new Employee(
                new Name("Ada", "Lovelace"),
                new Address("1 Computing Ln", "London", "UK")
        );

        System.out.println(e);
        e.moveTo(new Address("42 Algorithm Ave", "London", "UK"));
        System.out.println("After move: " + e);
    }
}
