package JavaChallenges;

import java.util.Dictionary;
import java.util.Hashtable;
import java.util.Scanner;

public class Challenge10_MorseCode {
    public static void main(String[] args) {

        System.out.print("Write a text: ");
        Scanner scanner = new Scanner(System.in);
        String scannerText = scanner.nextLine().toLowerCase();
        scanner.close();

        Dictionary<String, String> morse = new Hashtable<>();

        morse.put("a", ".-");
        morse.put("b", "-...");
        morse.put("c", "-.-.");
        morse.put("d", "-..");
        morse.put("e", ".");
        morse.put("f", "..-.");
        morse.put("g", "--.");
        morse.put("h", "....");
        morse.put("i", "..");
        morse.put("j", ".---");
        morse.put("k", "-.-");
        morse.put("l", ".-..");
        morse.put("m", "--");
        morse.put("n", "-.");
        morse.put("o", "---");
        morse.put("p", ".--.");
        morse.put("q", "--.-");
        morse.put("r", ".-.");
        morse.put("s", "...");
        morse.put("t", "-");
        morse.put("u", "..-");
        morse.put("v", "...-");
        morse.put("w", ".--");
        morse.put("x", "-..-");
        morse.put("y", "-.--");
        morse.put("z", "--..");

        char[] text = scannerText.toCharArray();
        for (int i = 0; i < text.length; i++) {
            for (int j = 0; j <= 25; j++) {
                if (text[i] == 97+j) {
                    System.out.print(morse.get(String.valueOf(text[i]))+" ");
                }
            }
        }
    }
}
