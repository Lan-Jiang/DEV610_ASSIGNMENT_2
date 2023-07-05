import java.lang.Math;

public class ch3ex9_lastDigit {

    public static void main(String[] args) {
        System.out.println("The last digit is " + lastDigit(3572));
        System.out.println("The last digit is " + lastDigit(-947));
        //lastDigit(-947);

    }

    public static int lastDigit(int number) {
        return Math.abs(number % 10);
    }

}
