package JavaChallenges;

import java.util.Scanner;

public class Challenge8_CountWords {
    public static void main(String[] args) {

        System.out.print("Write a text: ");
        Scanner scanner = new Scanner(System.in);
        String text = scanner.nextLine();
        words(text);
        scanner.close();

    }

    public static void words(String text) {

        String[] text2 = text.split(" ");

        boolean WordCounted = false;

        int counter = 0;

        for (int i = 0; i < text2.length; i++) {
            for (int j = 0; j < text2.length; j++) {
                if (text2[i].equals(text2[j])) {
                    counter++;
                    WordCounted = false;
                }
                if (counter >= 2) {
                    WordCounted = true;
                }
                if (WordCounted) {
                    System.out.println("La palabra " + text2[i] + " aparece " + counter + " veces");
                    WordCounted = false;
                }
            }

            counter = 0;
        }

    }

}
