import java.lang.Math;

public class ch5ex19_firstDigit {

    public static void main(String[] args) {
        System.out.println(firstDigit(3572));
        System.out.println(firstDigit(-942));
    }

    public static int firstDigit(int number) {
        number = Math.abs(number);

        while (number >= 10) {
            number = number / 10;
        }

        return number;
    }

}
