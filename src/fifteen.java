public class fifteen {
    public static String reverse(String str) {
        StringBuilder sb = new StringBuilder(str);
        return sb.reverse().toString();
    }

    public static void main(String[] args) {
        String input = "hello";
        System.out.println("Reversed string: " + reverse(input));
    }
}

