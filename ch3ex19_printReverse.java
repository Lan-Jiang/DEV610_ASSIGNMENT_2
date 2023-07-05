public class ch3ex19_printReverse {

    public static void main(String[] args) {
        printReverse("hello there!");

    }

    public static void printReverse(String text) {
        for (int i = text.length() - 1; i>=0; i--) {
            System.out.print(text.charAt(i));
        }

    }
}
