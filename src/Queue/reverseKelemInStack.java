package Queue;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class reverseKelemInStack {
    public static void main(String[] args) {

        int k=3;
        Queue<Integer> q = new LinkedList<>();
        q.add(4);
        q.add(5);
        q.add(6);
        q.add(7);
        q.add(8);

        System.out.println(q);
        Stack<Integer> st = new Stack<>();
        while (k>0) {
            st.push(q.remove());
            k--;
        }

        while(st.size()>0)
        {
            q.add(st.pop());
        }

        for(int i=0;i<2;i++)
        {
            q.add(q.remove());
        }
        System.out.println(q);
    }
}
