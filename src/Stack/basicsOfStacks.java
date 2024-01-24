package Stack;

import java.util.Stack;

public class basicsOfStacks {
    public static void main(String[] args) {
        Stack<Integer> st= new Stack<>();
        st.push(45);
        st.push(23);
        st.push(90);
        st.push(18);
        System.out.println(st.peek());

//        st.pop();
//        System.out.println(st.peek());

        System.out.println(st);
        System.out.println(st.size());
        System.out.println(st.isEmpty());

        while(st.size()>2)
        {
            st.pop();
        }
        System.out.println(st.peek());
    }
}
