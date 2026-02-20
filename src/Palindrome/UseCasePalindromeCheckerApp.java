package Palindrome;

public class UseCasePalindromeCheckerApp {
    public static void main(String[] args) {
        String input = "radar";
        char [] chars = input.toCharArray();
        int start = 0;
        int end = chars.length-1;
        boolean ispalindrome = true;
        while (start < end)
        {if (chars[start] != chars[end]) {
            ispalindrome = false;
            break;
        }
            start++;
            end--;
        }
        System.out.println("INPUT TEXT: " + input);
        System.out.println("Is it a palindrome? : " + ispalindrome);
    }
}