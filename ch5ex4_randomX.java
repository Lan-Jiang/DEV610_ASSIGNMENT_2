import java.util.Random;

public class ch5ex4_randomX {

    public static void main(String[] args) {
        randomX();
    }

    public static void randomX() {
        Random r = new Random();
        int lineLength = 0;
        while (lineLength < 16) {
            lineLength = (int) (r.nextInt(16)) + 5;
            for (int i = 0; i < lineLength; i++) {
                System.out.print("x");
            }
            System.out.println();
        }
    }
    // public static String randomX() {
    //     Random r = new Random();
    //     int n;
    //     StringBuilder builder = new StringBuilder();

    //     do {
    //         n = 5 + r.nextInt(16);
    //         System.out.println(n);
    //         for(int i = 0; i < n; i++)
    //             builder.append("x");

    //     } while(n < 16);

    //     return builder.toString();

    // }

}
