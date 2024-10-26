package JavaChallenges;

import java.awt.image.BufferedImage;
import java.net.URI;
import javax.imageio.ImageIO;

public class Challenge6_AspectRatio {
    public static void main(String[] args) {
        try {
            BufferedImage image = ImageIO.read(new URI(
                    "https://images.unsplash.com/photo-1553702446-a39d6fbee6cb?q=80&w=2071&auto=format&fit=crop&ixlib=rb-4.0.3&ixid=M3wxMjA3fDB8MHxwaG90by1wYWdlfHx8fGVufDB8fHx8fA%3D%3D")
                    .toURL());

            int height = image.getHeight(), width = image.getWidth();
            System.out.println("Height: " + height);
            System.out.println("Width: " + width);

            System.out.println("Aspect Ratio: " + (width / gcd(width, height)) + ":" + (height / gcd(width, height)));

        } catch (Exception e) {

            System.out.println("Error: " + e.getMessage());
        }

    }

    private static int gcd(int a, int b) {

        while (b != 0) {
            int temp = b; // Value of b in temp
            b = a % b; // b = remainder of a / b
            a = temp; // a = value of b at start of loop
        }

        return a;

    }
}