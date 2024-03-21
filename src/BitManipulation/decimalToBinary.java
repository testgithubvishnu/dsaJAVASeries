package BitManipulation;

import java.util.Scanner;

public class decimalToBinary {
    static String reverse(String str)
    {
        String s="";
        for(int i=str.length()-1;i>=0;i--){
            s+=str.charAt(i);
        }
        return s;
    }

    static String toBinary(int x)
    {
        String ans="";
        while(x!=0)
        {
           if( x%2==1)
           {
               ans+='1';
           }else{
               ans+='0';
           }
            x=x/2;
        }
        return ans;
    }
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);

        System.out.println("Enter the number");
        int n=sc.nextInt();

       String binary= toBinary(n);
        System.out.println("Binary number equivalent:"+reverse(binary));
    }
}
