package JavaChallenges;

import java.util.Arrays;
import java.util.Scanner;

public class Challenge2_Anagram {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String word1 = scanner.nextLine();
        String word2 = scanner.nextLine();

        Anagram(word1, word2);

        scanner.close();

    }

    public static void Anagram(String word1, String word2) {

        char[] realWord1 = word1.toLowerCase().toCharArray();
        char[] realWord2 = word2.toLowerCase().toCharArray();

        Arrays.sort(realWord1);
        Arrays.sort(realWord2);
        if (word1.equals(word2)) {
            System.out.println("They are not anagrams");
        } else if (Arrays.equals(realWord1, realWord2)) {
            System.out.println("They are anagrams");
        } else {
            System.out.println("They are not anagrams");
        }
    }
}
