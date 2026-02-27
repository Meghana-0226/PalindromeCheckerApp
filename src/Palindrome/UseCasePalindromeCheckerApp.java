package Palindrome;

import java.util.Scanner;
public class UseCasePalindromeCheckerApp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine().trim();
        String normalized = input.replaceAll("\\s+", "").toLowerCase();
        boolean isPalindrome = true;
        for (int i = 0; i < normalized.length() / 2; i++) {
            if (normalized.charAt(i) != normalized.charAt(normalized.length() - 1 - i)) {
                isPalindrome = false;
                break;
            }
        }
        System.out.println("isPalindrome?  : " + isPalindrome);
        sc.close();
    }
}