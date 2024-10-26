package JavaChallenges;

import java.util.ArrayList;
import java.util.Scanner;

public class Challenge9_DecimalToBinary {
    public static void main(String[] args) {

        ArrayList<Integer> array = new ArrayList<>();

        System.out.print("Write a number: ");
        Scanner scanner = new Scanner(System.in);

        int number = scanner.nextInt();
        int counter = 0;

        scanner.close();

        while (number > 0) {
            int remainder = number % 2;
            number /= 2;
            array.add(remainder);
            counter += 1;
        }

        for (int i = 0; i < counter;i++) {
            System.out.print(array.get((counter-1)-i));
        }
    }
}
