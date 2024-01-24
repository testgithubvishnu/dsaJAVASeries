package Hashmap;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Scanner;

// You are very strong
public class isomorphicStrings {
    public static boolean isIsomorphic(String s,String t)
    {
        HashSet<Character> st= new HashSet<>();
        HashMap<Character,Character> mp= new HashMap<>();
        for(int i=0;i<s.length();i++)
        {
            Character sCh=s.charAt(i);
            Character tCh=t.charAt(i);

            if(mp.containsKey(sCh))
            {
                if(mp.get(sCh)!=tCh)
                    return false;
            }
            //Linear time complexity:
          //  else if(mp.containsValue(tCh)){

            // Constant time complexity:
            else if (st.add(tCh)) {
            return  false;
            }
            else {
                mp.put(sCh,tCh);
                st.add(tCh);
            }
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);

        System.out.println("Enter first String:");
        String str1=sc.nextLine();

        System.out.println("Enter second String:");
        String str2=sc.nextLine();

        if(isIsomorphic(str1,str2))
        {
            System.out.println("Strings are isomorphic");
        }
        else {
            System.out.println("Strings are not isomorphic");
        }
    }
}
