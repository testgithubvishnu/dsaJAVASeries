package Stack;

import strings.StringCompression;

import java.util.Scanner;
import java.util.Stack;

public class InsertAtAnyIndex {
    public static void main(String[] args) {
        Stack<Integer> st= new Stack<>();
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter size of Stack:");
        int size=sc.nextInt();

        System.out.println("Enter Array elements:");
        for (int i=0;i<size;i++)
        {
            int x=sc.nextInt();
            st.push(x);
        }
        System.out.println(st);

        System.out.println("Enter element to insert:");
        int element=sc.nextInt();

        System.out.println("Enter index at:");
        int index=sc.nextInt();

        Stack<Integer> ans= new Stack<>();
        while(st.size()>index)
        {
            ans.push(st.pop());
        }
        st.push(element);

        while(ans.size()>0)
        {
            st.push(ans.pop());
        }

        System.out.println(st);
    }
}
