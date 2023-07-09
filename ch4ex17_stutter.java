public class ch4ex17_stutter {

    public static void main(String[] args) {
        String text = "Hello!";
        System.out.println(stutter(text));
    }

    public static String stutter(String text) {
        StringBuilder builder = new StringBuilder();
            for (int i = 0; i < text.length(); i++) {
                    builder.append(text.charAt(i)).append(text.charAt(i));
            }

        return builder.toString();

    }

}
