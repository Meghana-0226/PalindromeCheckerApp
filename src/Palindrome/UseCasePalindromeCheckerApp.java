package Palindrome;

import java.util.*;
interface PalindromeStrategy {
    boolean check(String input);
}
class StackStrategy implements PalindromeStrategy {
    public boolean check(String input) {
        Stack<Character> stack = new Stack<>();
        for (char c : input.toCharArray()) {
            stack.push(c);
        }
        for (char c : input.toCharArray()) {
            if (c != stack.pop()) {
                return false;
            }
        }
        return true;
    }
}
class DequeStrategy implements PalindromeStrategy {
    public boolean check(String input) {
        Deque<Character> deque = new ArrayDeque<>();
        for (char c : input.toCharArray()) {
            deque.addLast(c);
        }
        while (deque.size() > 1) {
            if (deque.removeFirst() != deque.removeLast()) {
                return false;
            }
        }
        return true;
    }
}
class PalindromeChecker {
    private PalindromeStrategy strategy;
    public PalindromeChecker(PalindromeStrategy strategy) {
        this.strategy = strategy;
    }
    public boolean isPalindrome(String input) {
        return strategy.check(input);
    }
}
public class UseCasePalindromeCheckerApp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        PalindromeStrategy strategy = new StackStrategy();
        PalindromeChecker checker = new PalindromeChecker(strategy);
        boolean result = checker.isPalindrome(input);
        System.out.println("isPalindrome? : " + result);
        sc.close();
    }
}