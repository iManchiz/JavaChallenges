package JavaChallenges;

public class Challenge14_Recursive {
    public static void main(String[] args) {
        
        int number = 3;

        int result = factorial(number);
        System.out.println(result);
    }

    private static int factorial (int x){


        if (x == 1 || x == 0) {
            return 1;
        }
        
        return x * factorial(x - 1);
    }
}
