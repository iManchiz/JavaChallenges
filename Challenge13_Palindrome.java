package JavaChallenges;

import java.util.Arrays;
import java.util.Scanner;

public class Challenge13_Palindrome {
    public static void main(String[] args) {

        System.out.print("Write a  text: ");
        Scanner scanner = new Scanner(System.in);
        String nativeText = scanner.nextLine().toLowerCase().trim().replaceAll("[ .]", "");
        char[] text = nativeText.toCharArray();
        palindrome(text);

        if (palindrome(text) == true) {
            System.out.println("True");
        } else {
            System.out.println("False");
        }
        scanner.close();

    }

    private static boolean palindrome(char[] text) {
        char[] array = new char[text.length];
        for (int i = 0; i < text.length; i++) {

            array[i] = text[text.length - 1 - i];

        }

        if (Arrays.equals(array, text)) {
            return true;
        } else {
            return false;
        }
    }
}
