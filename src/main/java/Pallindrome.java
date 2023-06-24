//17. Check if the given string is palindrome or not. Palindrome means after reversing a string, it will be same.
//        Input: Civic
//        Output: true
//        Input: One
//        Output: false
public class Pallindrome {
    public static void main(String[] args) {
        String input1 = "Civic";
        String input2 = "One";

        boolean isPalindrome1 = isPalindrome(input1);
        boolean isPalindrome2 = isPalindrome(input2);

        System.out.println("Is \"" + input1 + "\" a palindrome? " + isPalindrome1);
        System.out.println("Is \"" + input2 + "\" a palindrome? " + isPalindrome2);
    }

    private static boolean isPalindrome(String str) {
        str = str.toLowerCase();

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
}
