public class ch3ex1 {
    public static void main(String[] args) {
        printNumber(15);
        printNumber(5);

    }

    public static void printNumber(int number) {
        for (int i=1; i<=number; i++) {
            System.out.print("[" + i + "]");
        }
    }

}
