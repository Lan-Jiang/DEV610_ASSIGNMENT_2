public class ch4ex13_average {


    public static void main(String[] args) {
        int num1 = 500;
        int num2 = 300;
        double result = average(num1, num2);
        System.out.println("Average of " + num1 + " and " +num2 +" equals to " + result);
    }

    public static double average(int num1, int num2) {
        return (num1 + num2) / 2.0;
    }


}
