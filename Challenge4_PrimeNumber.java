package JavaChallenges;

public class Challenge4_PrimeNumber {
    public static void main(String[] args) {

        int cont = 0;
        for (int i = 1; i <= 100; i++) {
            for (int j = 1; j <= 100; j++) {
                if (i % j == 0) {
                    cont++;
                }
            }

            if (cont == 2) {
                System.out.println(i);
            }

            cont = 0;
        }
    }
}
