package Queue;

import java.util.Stack;

public class queueUsingStack {
    public static  class queueByStack
    {
        Stack<Integer> st1= new Stack<>();
        Stack<Integer> st2= new Stack<>();

        // Push Efficient:
        public void add(int x)
        {
           st1.push(x);
        }

        public int peek()
        {
            while(st1.size()>0)
            {
                st2.push((st1.pop()));
            }
            int x=st2.peek();
            while(st2.size()>0)
            {
                st1.push((st2.pop()));
            }

            return x;
        }
        public int remove()
        {
            while(st1.size()>0)
            {
                st2.push((st1.pop()));
            }
            int x=st2.pop();
            while(st2.size()>0)
            {
                st1.push((st2.pop()));
            }

            return x;
        }
        public  void display()
        {
            System.out.println(st1);
        }

    }
    public static void main(String[] args) {
     queueByStack qs=new queueByStack();
     qs.add(10);
     qs.add(20);
     qs.add(30);
     qs.add(40);

       // System.out.println(qs.remove());
       // System.out.println(qs.peek());

        qs.display();
    }
}
