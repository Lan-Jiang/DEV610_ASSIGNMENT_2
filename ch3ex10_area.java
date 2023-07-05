import java.lang.Math;

public class ch3ex10_area {

    public static void main(String[] args) {
        System.out.println("The area is " + area(2));
        // System.out.println("The last digit is " + area(-947));
        // lastDigit(-947);

    }

    public static double area(double radius) {
        return Math.PI * (radius * radius);
    }


}
