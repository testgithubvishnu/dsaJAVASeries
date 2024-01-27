package Recursion;

import java.util.Scanner;

public class PalindromeString {

    //Method 1:
    static String reverseString(String str, int i) {

        if (i == str.length()) return "";
        return reverseString(str,i+1) + str.charAt(i);
    }


    //Method 2:
    static boolean isPalindrome(String s,int l,int r)
    {
        if(l>=r) return true;
        return (s.charAt(l)==s.charAt(r) && s.charAt(l+1)==s.charAt(r-1));
    }
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter string:");
        String original=sc.nextLine();

       String reverse=reverseString(original,0);
       if(original.equals(reverse)) System.out.println("String is Palindrome");
       else System.out.println("String is not palindrome");

        if(isPalindrome(original,0,original.length()-1)) System.out.println("String is Palindrome");
       else System.out.println("String is not palindrome");

    }
}
