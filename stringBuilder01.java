public class stringBuilder01 {

    public static String toUpperCase(String str) {

        StringBuilder sb = new StringBuilder("");

        char ch = Character.toUpperCase(str.charAt(0));
        sb.append(ch);
        for (char i = 1; i < str.length(); i++) {
            if (str.charAt(i) == ' ' && i < str.length() - 1) {
                sb.append(str.charAt(i));
                i++;
                sb.append(Character.toUpperCase(str.charAt(i)));

            } else {
                sb.append(str.charAt(i));
            }
        }

        return sb.toString();
    }

    public static void main(String args[]) {
        // StringBuilder sb = new StringBuilder("");

        // for (char ch = 'a'; ch <= 'z'; ch++) {
        // sb.append(ch + " ");
        // }

        // System.out.println(sb);
        // }
        String str = "hello WORLD";
        System.out.println(toUpperCase(str));
    }
}
