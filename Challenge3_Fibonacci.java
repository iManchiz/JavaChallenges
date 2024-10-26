package JavaChallenges;

public class Challenge3_Fibonacci {
    public static void main(String[] args) {
        
        int counter = 0;
        long firstNumber = 0;
        long secondNumber = 1;
        long result = firstNumber + secondNumber;

        while (counter <= 50) {

            System.out.println(result);
            firstNumber = secondNumber;
            secondNumber = result;
            result = firstNumber + secondNumber;

            counter++;
        }

    }   
}
