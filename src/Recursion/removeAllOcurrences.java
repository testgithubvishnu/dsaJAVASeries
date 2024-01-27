package Recursion;

import java.util.Scanner;

public class removeAllOcurrences {
    static String removeChar(String str,int idx)
    {
        if(idx==str.length()) return "";
        removeChar(str,idx+1);

        if(str.charAt(idx)!='a')
        {
            return str.charAt(idx)+removeChar(str,idx+1);
        }
        else {
            return removeChar(str,idx+1);
        }
        
    }
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the String:");
        String str= sc.nextLine();

        System.out.println(removeChar(str,0));
    }


}
