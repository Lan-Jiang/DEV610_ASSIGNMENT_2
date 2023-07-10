public class ch5ex1_showTwos {


    public static void main(String[] args) {
        showTwos(7);
        showTwos(18);
        showTwos(68);
        showTwos(120);
    }

    public static void showTwos(int number) {
        System.out.print(number + " = ");

        while (number % 2 == 0) {
            System.out.print("2 * ");
            number /= 2;
        }

        System.out.println(number);
    }

}
