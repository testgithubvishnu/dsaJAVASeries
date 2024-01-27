package Recursion;

public class ReverseStringUsingRecursion {
    static void reverseString(String str, int i) {
        if (i == str.length()) return;

        reverseString(str,i+1);
        System.out.print(str.charAt(i));

    }

    public static void main(String[] args) {
        String str="akshata";
        reverseString(str,0);

    }
}
