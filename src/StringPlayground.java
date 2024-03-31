public class StringPlayground {
    public static int countParentheses(String s) {
        int count = 0;
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (c == '(') {
                count++;
            } else if (c == ')') {
                count--;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        String s = "((3 + 7) * 2)";
        String s2 = "(3 + 7) * 2)";
        String s3 = "((3 + 7 * 2)";

        System.out.println("Count of parentheses for s: " + countParentheses(s));
        System.out.println("Count of parentheses for s2: " + countParentheses(s2));
        System.out.println("Count of parentheses for s3: " + countParentheses(s3));
    }
}