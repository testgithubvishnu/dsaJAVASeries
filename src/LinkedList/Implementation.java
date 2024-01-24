package LinkedList;

public class Implementation {
    public  static  class Node
    {
        int data;
        Node next;
        Node(int data)
        {
            this.data=data;
        }
    }

    public static class linkedlist
    {
        Node head= null;
        Node tail=null;
        int size=0;
        void insertAtEnd(int val)
        {
            Node temp= new Node(val);

            if(head==null) {
            head=temp;
            //size++;

            }
            else {
                tail.next = temp;
                //tail = temp;
            }
            tail=temp;
            size++;
        }

        void display()
        {
            Node temp=head;
            while(temp!=null)
            {
                System.out.print(temp.data+" ");
                temp= temp.next;
            }
        }

        //
//        int size()
//        {
//            int count=0;
//            Node temp=head;
//            while(temp!=null)
//            {
//                count++;
//                temp=temp.next;
//            }
//            return  count;
//            //System.out.println(count);
//        }

        void insertAtBegin(int val)
        {
            Node temp=new Node(val);
            if(head==null) {
                head = temp;
                tail=temp;

            }
            else {
                temp.next = head;
                head = temp;
            }
            size++;

        }
        void insertAtIndex(int index,int val)
        {
            Node t= new Node(val);
            Node temp=head;

            if(index==size)
            {
                insertAtEnd(val);
                return;
            } else if (index==0) {
               insertAtBegin(val);
               return;
            } else if (index<0 || index>size) {
                System.out.println("Invalid Index!");
                return;

            }
            for (int i=1;i<=index-1;i++)
            {
               temp=temp.next;
             //  temp.next=t;
            }
            t.next=temp.next;
            temp.next=t;
            size++;

        }
        int getAt(int idx)
        {
            Node temp=head;
            for (int i=1;i<=idx;i++)
            {
                temp=temp.next;
            }
            return temp.data;
        }

        void deleteAtIndex(int index)
        {

            if(index==0)
            {
                head=head.next;
                size--;
            }

            Node temp=head;
           for(int i=1;i<=index-1;i++)
           {
              temp=temp.next;
           }
           temp.next=temp.next.next;
           tail=temp;
           size--;
        }
    }


    public static void main(String[] args) {

linkedlist ll= new linkedlist();
ll.insertAtEnd(34);
ll.insertAtEnd(56);
ll.insertAtEnd(29);

ll.insertAtBegin(45);
//ll.display();
      //  System.out.println(ll.size);

ll.insertAtIndex(2,67);
//System.out.println();
//ll.display();

        ll.insertAtIndex(5,44);
        ll.insertAtIndex(0,12);
       // System.out.println();
      //  ll.display();

        //System.out.println(ll.tail.data);

        //System.out.println(ll.getAt(2));

        ll.display();
        ll.deleteAtIndex(2);
        System.out.println();
        ll.display();
    }
}
