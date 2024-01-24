package strings;

import java.util.Scanner;

public class palindrome {
    public static boolean isPalindrome(String str) {
        int i = 0;
        int j = str.length() - 1;
        boolean flag = true;
        while (i < j) {
            if (str.charAt(i) != str.charAt(j)) return false;
            i++;
            j--;
        }
        return true;
    }

    public static void main(String[] args) {
      int count=0;
      Scanner sc= new Scanner(System.in);
      String str=sc.nextLine();

      for(int i=0;i<str.length();i++)
      {
          for(int j=i+1;j<=str.length();j++)
          {
            if(isPalindrome(str.substring(i,j))==true)
            {
                count++;
            }
          }
      }
      System.out.println("Number of palindromic strings are "+count);
    }
}

