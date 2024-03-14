package strings;

import java.util.Scanner;

public class Toggle {
    public static void main(String[] args)
    {
        Scanner sc= new Scanner(System.in);
       // String str=sc.nextLine();
        System.out.println("Enter the string:");
       StringBuilder str= new StringBuilder(sc.nextLine());

        for(int i=0;i<str.length();i++)
        {
            boolean flag=true;
            char ch= str.charAt(i);
            int ascii=(int)ch;
            if(ascii>=97) flag=false;

            if(flag==true)
            {
                ascii+=32;
                char dh=(char)ascii;
                str.setCharAt(i,dh);
            }
            else {
                ascii-=32;
                char dh=(char)ascii;
                str.setCharAt(i,dh);
            }

        }
        System.out.println(str);
    }
}
