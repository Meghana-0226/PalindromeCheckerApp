package Palindrome;

public class UseCasePalindromeCheckerApp {
    public static void main(String[] args) {
        String text = "madam";
        String reversed = "";
        for (int i = text.length() - 1; i >= 0; i--) {
            reversed = reversed + text.charAt(i);
        }
        boolean isPalindrome;
        if (text.equals(reversed)) {
            isPalindrome = true;
        } else {
            isPalindrome = false;
        }
        System.out.println("Input text: " + text);
        System.out.println("Reversed text: " + reversed);
        System.out.println("is it a palindrome?: " + isPalindrome);
    }
}