package week3; // Name of package

// Importing classes or libraries
import java.util.Scanner;

public class LearningMethods {
    /**
     * This method takes two integer values and returns the addition
     * of both values
     * @param num1
     * @param num2
     * @return num1 + num2
     */
    public static int addNums(int num1, int num2) {
        return num1 + num2;
    }

    /**
     *
     * @param num1
     * @param num2
     * @return num1 * num2
     */
    public static int addNums(String num1, String num2) {
        int x = Integer.parseInt(num1);
        int y = Integer.parseInt(num2);

        return x + y;
    }

    public static int addNums(long num1, long num2) {
        return (int)(num1 + num2);
    }

    public static int addNums(double[] nums) {
        int sum = 0;
        for (double num : nums) {
            sum += (int)(num);
        }

        return sum;
    }
}
