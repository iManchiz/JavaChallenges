package JavaChallenges;

import java.util.Scanner;
import java.lang.Math;

public class Challenge15_ArmstrongNumber {
    public static void main(String[] args) {

        System.out.print("Write a number: ");
        Scanner scanner = new Scanner(System.in);
        String number = scanner.nextLine();

        char[] numberReal = number.toCharArray();

        if (armstrongNumber(numberReal).equals(number)) {
            System.out.println("Is a Armstrong number");
        } else {
            System.outº.println("Is not a Armstrong number");
        }

    }

    private static String armstrongNumber(char[] array) {

        int result = 0;
        int finalResult = 0;
        String toString;

        for (int i = 0; i < array.length; i++) {

            result = (array[i] - '0') * (array[i] - '0') * (array[i] - '0');
            finalResult += result;

        }

        toString = Integer.toString(finalResult);

        System.out.println(finalResult);
        return toString;

    }
}
