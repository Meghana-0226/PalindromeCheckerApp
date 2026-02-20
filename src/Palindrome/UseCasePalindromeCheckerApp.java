package Palindrome;

public class UseCasePalindromeCheckerApp {
    public static void main(String[] args) {
        String text = "madam";
        String reversed = new StringBuilder(text).reverse().toString();
        boolean isPalindrome;
        if (text.equalsIgnoreCase(reversed)) {
            isPalindrome = true;
        } else {
            isPalindrome = false;
        }
        System.out.println("Input text: " + text);
        System.out.println("is it a palindrome?: " + isPalindrome);
    }
}