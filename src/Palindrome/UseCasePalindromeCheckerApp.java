package Palindrome;

import java.util.Scanner;
class PalindromeChecker {
    public boolean CheckPalindrome(String input) {
        int start = 0;
        int end = input.length() - 1;
        while (start < end) {
            if (input.charAt(start) != input.charAt(end)) {
                return false;
            }
            start++;
            end--;
        }
        return true;
    }
}
public class UseCasePalindromeCheckerApp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        PalindromeChecker checker = new PalindromeChecker();
        boolean result = checker.CheckPalindrome(input);
        System.out.println("isPalindrome? : " + result);
        sc.close();
    }
}