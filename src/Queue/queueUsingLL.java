package Queue;

public class queueUsingLL {
    public static  class Node
    {
        int data;
        Node next;
        Node(int data)
        {
            this.data=data;
        }
    }

    public  static class queue
    {
        Node head=null;
        Node tail=null;
        int size=0;

        public void add(int x)
        {
            Node temp = new Node(x);
           if(size==0) {
               head=tail=temp;
           }
           else {

               tail.next = temp;
               tail = temp;
           }
           size++;
        }
        public int remove()
        {
            if(size==0)
            {
                System.out.println("Queue is empty!");
                return -1;
            }
           int x= head.data;
           head=head.next;
           size--;

           return x;
        }
        public void display()
        {
           Node temp=head;
           while(temp!=null)
           {
               System.out.print(temp.data+" ");
               temp=temp.next;
           }
            System.out.println();
        }

        public  int peek()
        {
            if(size==0)
            {
                System.out.println("Queue is empty!");
                return -1;
            }
            return head.data;
        }

        public boolean isEmpty()
        {
        if(size==0)
        {
            return  true;
        }
        return  false;
        }

    }
    public static void main(String[] args) {
        queue q= new queue();
        q.add(10);
        q.add(20);
        q.add(30);
        q.add(40);
        q.add(50);
        q.display();

        q.remove();
        q.display();

        System.out.println(q.peek());
    }
}
