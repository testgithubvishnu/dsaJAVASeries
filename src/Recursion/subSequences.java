package Recursion;

import java.util.ArrayList;
import java.util.Scanner;

public class subSequences {
    static ArrayList<String> getSSQ(String str)
    {
        ArrayList<String> res= new ArrayList<>();

        if(str.length()==0)
        {
            res.add("");
            return res;
        }

        char curr=str.charAt(0);
        ArrayList<String> smallAns=getSSQ(str.substring(1));

        for(String ss:smallAns)
        {
            res.add(ss);
            res.add(curr+ss);
        }
       return res;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter string:");

        String str=sc.nextLine();

        System.out.println("Subsequences of given string are:");
        ArrayList<String> ans=getSSQ(str);

        for(String ss:ans)
        {
            System.out.println(ss);
        }

    }
}
