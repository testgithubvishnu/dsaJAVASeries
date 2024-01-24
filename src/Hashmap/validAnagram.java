package Hashmap;

import java.util.HashMap;
import java.util.*;

public class validAnagram {
    //Approach 3:
    public static boolean findAnagram(String str1,String str2)
    {
        HashMap<Character,Integer> hm= makeFreqMap(str1);
        for(int i=0;i<str2.length();i++)
        {
           char ch=str2.charAt(i);
            if(!hm.containsKey(ch))
            {
              return  false;
            }
            int currFreq=hm.get(ch);
            hm.put(ch,currFreq-1);

            for( int j:hm.values())
            {
                if(j!=0) return false;
            }

        }
        return true;
    }

    //Approach 2:
    static HashMap<Character,Integer> makeFreqMap(String str)
    {
        HashMap<Character,Integer> hm= new HashMap<>();
        for(int i=0;i<str.length();i++)
        {
            char ch= str.charAt(i);
            if(!hm.containsKey(ch))
            {
                hm.put(ch,1);
            }
            else {
                int currFreq=hm.get(ch);
                hm.put(ch,currFreq+1);
            }
        }
        return hm;
    }
    public static  boolean  validAnagram(String str1,String str2)
    {
        if(str1.length()!=str2.length())
        {
            System.out.println("Not Anagram");
        }
        HashMap<Character,Integer> mp1= makeFreqMap(str1);
        HashMap<Character,Integer> mp2= makeFreqMap(str2);

        if(mp1.equals(mp2))
            return true;
        return  false;
    }
    //Approach 1:
    public static  String anagram(char[] arr1,char[] arr2)
    {
        Arrays.sort(arr1);
        Arrays.sort(arr2);
        if(arr1.length!=arr2.length)
        {
            System.out.println("Not Anagram");
        }
          if(arr1.equals(arr2))
                return " Anagram";

        return "Not Anagram";
    }
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);

        System.out.println("Enter first String:");
        String str1=sc.nextLine();

        System.out.println("Enter second String:");
        String str2=sc.nextLine();

        char[] arr1=str1.toCharArray();
        char[] arr2=str2.toCharArray();

        //Approach 1:
//       if(validAnagram(str1,str2))
//       {
//           System.out.println("Are Anagram");
//       }
//       else {
//           System.out.println("Not Anagram");
//       }

      // Approach 2:
        //System.out.println(anagram(arr1,arr2));

     // Approach 3:
          if( findAnagram(str1,str2))
          {
              System.out.println("Are Anagram");
          }
          else {
              System.out.println("Not Anagram");
          }
    }

}
