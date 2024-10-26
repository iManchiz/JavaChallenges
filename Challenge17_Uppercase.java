package JavaChallenges;

import java.util.Scanner;

public class Challenge17_Uppercase {
    public static void main(String[] args) {
        
        System.out.print("Write a text: ");
        Scanner scanner = new Scanner(System.in);
        String text = scanner.nextLine();
        String[] textReal = text.split(" ");
        toUpper(textReal);

    }

    private static String toUpper (String[] string){

        for (int i = 0; i < string.length; i++) {
            String firstUpper = string[i].substring(0, 1).toUpperCase();
            System.out.println(firstUpper + string[i]);



        }

        return "hka";
    }
}
