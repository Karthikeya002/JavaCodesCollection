public class PalindromeChecker {
    public static boolean isPalindrome(String str) {
        str = str.toLowerCase().replaceAll("[^a-z0-9]", "");
        int left = 0;
        int right = str.length() - 1;
        
        while (left < right) {
            if (str.charAt(left) != str.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }

    public static void main(String[] args) {
        String test1 = "A man a plan a canal Panama";
        String test2 = "Hello";
        System.out.println(test1 + " is palindrome: " + isPalindrome(test1));
        System.out.println(test2 + " is palindrome: " + isPalindrome(test2));
    }
}
