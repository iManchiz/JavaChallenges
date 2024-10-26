package JavaChallenges;

public class Challenge12_DeletingCharacters {

    static int lengthStr2 = 0;
    static int lengthStr1 = 0;

    public static void main(String[] args) {

        String str1Native = "Me gusta JAVA y ademas pedro";
        String str2Native = "Me gusta Kotlin y ademas lucia";

        String[] str1 = str1Native.split(" ");
        String[] str2 = str2Native.split(" ");

        System.out.print("out1: ");

        for (int i = 0; i < str1.length; i++) {

            if (!str1[i].equalsIgnoreCase(str2[lengthStr2])) {
                System.out.print(str1[i] + " ");
            }
            if (lengthStr2 < str2.length - 1) {
                length2(lengthStr2);
            }
        }
        System.out.println("");
        System.out.print("out2: ");
        for (int i = 0; i < str2.length; i++) {

            if (!str2[i].equalsIgnoreCase(str1[lengthStr1])) {
                System.out.print(str2[i] + " ");
            }
            if (lengthStr1 < str1.length - 1) {
                length1(lengthStr1);
            }
        }

    }

    public static int length2(int x) {
        lengthStr2++;
        return lengthStr2;
    }

    public static int length1(int x) {
        lengthStr1++;
        return lengthStr1;
    }

}
