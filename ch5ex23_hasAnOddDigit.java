import java.lang.Math;

public class ch5ex23_hasAnOddDigit {

    public static void main(String[] args) {
        System.out.println(hasAnOddDigit(4822116));
        System.out.println(hasAnOddDigit(2448));
    }

    public static Boolean hasAnOddDigit(int number) {
        number = Math.abs(number);

        while (number > 0) {
            if (number % 2 == 1)
                return true;
            number = number / 10;

        }

        return false;

    }

}
