package week6;

import java.util.InputMismatchException;
import java.util.Scanner;

public class TryCatchExample {
    public static int quotient( int numerator, int denominator )
            throws ArithmeticException
    {
        return numerator / denominator; // possible division by zero
    } // end method quotient

    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in); // scanner for input
        boolean continueLoop = true; // determines if more input is needed

        do {
            try // read two numbers and calculate quotient
            {
                System.out.print("Please enter an integer numerator: ");
                String numeratorStr = scanner.next();
                int numerator = Integer.parseInt(numeratorStr);
                System.out.print("Please enter an integer denominator: ");
                int denominator = scanner.nextInt();

                int result = quotient(numerator, denominator);
                System.out.printf("\nResult: %d / %d = %d\n", numerator,
                        denominator, result);
                continueLoop = false; // input successful; end looping
            } // end try
            catch (InputMismatchException inputMismatchException) {
                System.err.printf("\nException: %s\n",
                        inputMismatchException);
                scanner.nextLine(); // discard input so user can try again
                System.out.println(
                        "You must enter integers. Please try again.\n");
            } // end catch
            catch (ArithmeticException arithmeticException) {
                System.err.printf("\nException: %s\n", arithmeticException);
                System.out.println(
                        "Zero is an invalid denominator. Please try again.\n");
            } // end catch
            catch (NumberFormatException numberFormatException) {
                System.err.printf("\nException: %s\n", numberFormatException);
                System.out.println(
                        "You must enter valid integers. Please try again.\n");
            }
            catch (Exception e) {
                System.err.printf("\nException: %s\n", e);
                System.out.println(
                        "An unexpected error occurred. Please try again.\n");
            } // end catch
        } while (continueLoop); // end do...while
    } // end main
} // end class DivideByZeroWithExceptionHandling
