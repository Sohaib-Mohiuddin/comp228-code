package week3;

import java.util.Arrays;
import java.util.Scanner;

public class LearningMethodsDriver {
    public static void main(String[] args) {
        String hello = "hello"; // Is this variable available in other methods?

        // Scenario 1: Add integer numbers together.
        Scanner scanner = new Scanner(System.in); // Utilizing Scanner to take user input
        double x = Math.round(scanner.nextDouble()); // First user input: type double
        double y = Math.round(scanner.nextDouble()); // Second user input: type double

        // Output of addNums method
        System.out.println("The method addNums ran and gave: " + LearningMethods.addNums((int) x, (int) y));

        // Scenario 2: take 2 string numbers, convert them, Multiply 2 numbers, convert them back, return them
        String xx = "354"; // First value: type String
        String yy = "225"; // Second value: type String

        // Formatted String output with placeholders
        System.out.printf("The addition of %s and %s is: %d%n%n", xx, yy, LearningMethods.addNums(xx, yy));

        // Scenario 3: take an array of double values and add them all together
        double[] listOfDoubles = {2.0, 3.0, 6.5, 9.9, 4.6, 2.9};
        System.out.printf("The addition of all values in %s is: %d", Arrays.toString(listOfDoubles), LearningMethods.addNums(listOfDoubles));

        scanner.close();
    }
}
