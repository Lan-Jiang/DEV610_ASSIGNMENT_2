public class ch4ex2_repl {
    public static void main(String[] args) {
        System.out.println(repl("hello", 3));
    }
    // https://www.baeldung.com/java-string-of-repeated-characters
    public static String repl(String str, int rep) {
        if (rep <= 0) {
            System.out.print("");
        }

        StringBuilder builder = new StringBuilder();
            for (int i = 0; i < rep; i++) {
                    builder.append(str);
            }

        return builder.toString();

    }

}
