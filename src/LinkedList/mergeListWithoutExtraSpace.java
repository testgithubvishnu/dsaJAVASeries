package LinkedList;

public class mergeListWithoutExtraSpace {
    static class Node
    {
        int data;
        Node next;
        Node(int data)
        {
            this.data=data;
        }
    }
    static Node mergeLinkedList(Node head1,Node head2)
    {
        Node temp1=head1;
        Node temp2=head2;
        Node head= new Node(100);
        Node temp=head;

        while(temp1!=null && temp2!=null)
        {
            if(temp1.data<temp2.data)
            {
                temp.next=temp1;
                temp=temp1;
                temp1=temp1.next;
            }
            else {
                temp.next=temp2;
                temp=temp2;
                temp2=temp2.next;
            }
        }
        if(temp1==null)
        {
            temp.next=temp2;
        }
      else
       {
           temp.next=temp1;
       }
            return head.next;
    }
    static  void printList(Node head)
    {
        Node temp=head;
        while(temp!=null)
        {
            System.out.print(temp.data+" ");
            temp=temp.next;
        }
    }
    public static void main(String[] args) {
        Node n1=new Node(1);
        Node n2=new Node(3);
        Node n3=new Node(5);
        Node n4=new Node(7);

        n1.next=n2;
        n2.next=n3;
        n3.next=n4;

        Node n5=new Node(2);
        Node n6=new Node(4);
        Node n7=new Node(6);
        Node n8=new Node(8);

        n5.next=n6;
        n6.next=n7;
        n7.next=n8;

        System.out.println("Before merging:");
        System.out.println("List 1:");
        printList(n1);

        System.out.println();
        System.out.println("List 2:");
        printList(n5);

        System.out.println();
        System.out.println("After merging lists:");
        printList(mergeLinkedList(n1,n5));

    }
}
