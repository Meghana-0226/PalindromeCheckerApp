package Palindrome;

public class UseCasePalindromeCheckerApp {
    public static void main(String[] args) {
        String text= "madam";
        boolean ispalindrome = true;
        for (int i=0;i< text.length()/2;i++){
            if(text.charAt(i) != text.charAt(text.length() -1 -i)){
                ispalindrome= false;
                break;
            }
        }


        System.out.println("INPUT TEXT:" +text );
        System.out.println("is it a palindrome? :"+ ispalindrome);


    }
}