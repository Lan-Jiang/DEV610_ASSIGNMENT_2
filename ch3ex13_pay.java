public class ch3ex13_pay {

    public static void main(String[] args) {
        System.out.println(pay(5.50, 6));
        System.out.println(pay(4.00, 11));
        // System.out.println("The last digit is " + area(-947));
        // lastDigit(-947);

    }

    public static double pay(double salary, int h) {
        if (h<=8) {
            return h*salary;
        } else {
            return h*salary +(h-8)*salary*0.5;
        }
    }
}
