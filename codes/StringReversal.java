public class StringReversal {
    public static String reverse(String str) {
        StringBuilder sb = new StringBuilder(str);
        return sb.reverse().toString();
    }

    public static String reverseManual(String str) {
        char[] chars = str.toCharArray();
        int left = 0, right = chars.length - 1;
        while (left < right) {
            char temp = chars[left];
            chars[left] = chars[right];
            chars[right] = temp;
            left++;
            right--;
        }
        return new String(chars);
    }

    public static void main(String[] args) {
        String text = "Hello World";
        System.out.println("Original: " + text);
        System.out.println("Reversed (StringBuilder): " + reverse(text));
        System.out.println("Reversed (Manual): " + reverseManual(text));
    }
}
