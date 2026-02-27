package Palindrome;

import java.util.LinkedList;
public class UseCasePalindromeCheckerApp {
    public static void main(String[] args) {
        String input = "level";
        System.out.println("Input: " + input);
        LinkedList<Character> list = new LinkedList<>();
        for (char ch : input.toCharArray()) {
            list.add(ch);
        }
        boolean isPalindrome = true;
        while (list.size() > 1) {
            char first = list.removeFirst();
            char last = list.removeLast();
            if (first != last) {
                isPalindrome = false;
                break;
            }
        }
        System.out.println("isPalindrome : " + isPalindrome);
    }
}