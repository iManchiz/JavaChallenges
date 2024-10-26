package JavaChallenges;

public class Challenge16_HowManyDays {
    public static void main(String[] args) {
        
        String date1 = "13/04/2023";
        String date2 = "10/08/2024";

        daysCalculation(date1, date2);
    }

    public static void daysCalculation(String date1, String date2){

        char[] realDate1 = date1.toCharArray();
        char[] realDate2 = date2.toCharArray();

        System.out.println(realDate1[3]);
    }
}
