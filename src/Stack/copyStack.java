package Stack;

import java.beans.Introspector;
import java.util.Scanner;
import java.util.Stack;

public class copyStack {
    public static void main(String[] args) {
        Stack<Integer> st= new Stack<>();
        Scanner sc= new Scanner(System.in);

        System.out.println("Enter elements:");
        for(int i=0;i<5;i++)
        {
            int x=sc.nextInt();
            st.push(x);
        }
        System.out.println(st);

        Stack<Integer> rt= new Stack<>();
        while(st.size()>0)
        {
            rt.push(st.pop());
        }
       // System.out.println(rt);

        Stack<Integer> temp= new Stack<>();
        while(rt.size()>0)
        {
            temp.push(rt.pop());
        }
        System.out.println(temp);
        System.out.println(st);
    }
}
