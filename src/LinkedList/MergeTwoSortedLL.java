package LinkedList;

public class MergeTwoSortedLL {
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

        // Bruit-Force Approach:

        Node temp1=head1;
        Node temp2=head2;
        Node head= new Node(45);
        Node temp=head;

        while(temp1!=null && temp2!=null)
        {
            if(temp1.data<temp2.data)
            {
                Node a= new Node(temp1.data);
                temp.next=a;
                temp=a;
                temp1=temp1.next;
            }
            else {
                Node a= new Node(temp2.data);
                temp.next=a;
                temp=a;
                temp2=temp2.next;
            }
        }
        if(temp1==null)
        {
            temp.next=temp2;
        }
        else {
            temp.next=temp1;
        }
        return head.next;

        // Optimal-Approach:

    }
    static void printLL(Node head)
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
        Node n4=new Node(8);

        n1.next=n2;
        n2.next=n3;
        n3.next=n4;

        Node n5=new Node(2);
        Node n6=new Node(4);
        Node n7=new Node(6);
        Node n8=new Node(7);

        n5.next=n6;
        n6.next=n7;
        n7.next=n8;

        System.out.println("List 1:");
        printLL(n1);
        System.out.println();

        System.out.println("List 2:");
        printLL(n5);

        System.out.println();
        System.out.println("After merging:");
        printLL(mergeLinkedList(n1,n5));
    }
}
