package Palindrome;

import java.util.Scanner;
class PalindromeService {
    public boolean check(String input) {
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
public class UseCasePalindromeCheckerApp{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        PalindromeService service = new PalindromeService();
        long startTime = System.nanoTime();
        boolean result = service.check(input);
        long endTime = System.nanoTime();
        long executionTime = endTime - startTime;
        System.out.println(input + " isPalindrome? : " + result);
        System.out.println("execution time: " + executionTime + " ns");
        sc.close();
    }
}