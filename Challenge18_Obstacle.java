package JavaChallenges;

public class Challenge18_Obstacle {
    public static void main(String[] args) {
        
        String[] movement = {"run", "jump", "run", "jump"};
        String pista = "_|_|";

        System.out.println(function(movement, pista));
    }

    private static boolean function (String[] movement, String pista){

        char[] realPista = pista.toCharArray();
        int counter = 0;


        for (int i = 0; i < movement.length; i++) {
            
            if (movement[i].equals("run") && Character.toString(realPista[i]).equals("_")) {
                System.out.println("va");
            }
            else if (movement[i].equals("jump") && Character.toString(realPista[i]).equals("|")) {
                System.out.println("va");
            }
            else{
                counter++;
            }
    
        }

        if (counter > 0) {
            return false;
        }
        else{
            return true;
        }
    }   
}
