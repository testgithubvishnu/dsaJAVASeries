package Stack;

import java.util.Stack;

public class LLImplemenOfStack {
    static  class Node
    {
        int val;
        Node next;
        Node(int data)
        {
            this.val=data;
        }
    }

    public static class Stack
    {
        private  Node head=null;
       private int size=0;

       void push(int x)
       {
           Node temp=new Node(x);
           temp.next=head;
           head=temp;
           size++;
       }
       int pop()
       {
           if(head==null)
           {
               System.out.println("Stack is empty!");
               return -1;
           }
           int ans= head.val;
           head=head.next;
           size--;
           return ans;
       }
       int peek()
       {
           if(head==null)
           {
               System.out.println("Stack is empty!");
               return -1;
           }
        return head.val;
       }

       boolean isEmpty()
       {
        if(size==0)
        {
            System.out.println("Stack is Empty");
            return true;
        }
        return false;
       }


        int size()
        {
         return size;
        }

        void displayrev()
        {
            Node temp= head;
            while(temp!=null)
            {
                System.out.print(temp.val+" ");
                temp=temp.next;
            }
        }
        void displayrec(Node h)
        {
            if (h==null) return;
           displayrec(h.next);
            System.out.print(h.val+" ");
        }
        void display()
        {
            displayrec(head);
        }
    }

    public static void main(String[] args) {
        Stack st= new Stack();
        st.push(56);
        st.push(83);
        st.push(23);
        st.display();

//        System.out.println(st.peek());
//        System.out.println(st.pop());
//        st.display();
//
//        System.out.println(st.isEmpty());
    }
}
