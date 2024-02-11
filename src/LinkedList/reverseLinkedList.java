package LinkedList;

public class reverseLinkedList {
    static class Node
    {
        int data;
        Node next;
        Node(int data)
        {
            this.data=data;
        }
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
//    static void printReverse(Node head)
//    {
//        if(head==null) return;
//        printReverse(head.next);
//        System.out.print(head.data+" ");
//    }

    // USING RECURSION:
//    static Node reverseLL(Node head)
//    {
//        if(head.next==null) return head;
//        Node newhead=reverseLL(head.next);
//        head.next.next=head;
//        head.next=null;
//        return newhead;
//    }

    // using three pointe approach:
     static Node reverseLL(Node head)
     {
         Node prev=null;
         Node curr=head;
         Node agla=null;

         while(curr!=null) {
             agla = curr.next;
             curr.next = prev;
             prev = curr;
             curr = agla;
         }
         return prev;

     }

    public static void main(String[] args) {
        Node n1=new Node(2);
        Node n2=new Node(7);
        Node n3=new Node(1);
        Node n4=new Node(4);
        Node n5=new Node(9);
        Node n6=new Node(3);
        Node n7=new Node(6);

        n1.next=n2;
        n2.next=n3;
        n3.next=n4;
        n4.next=n5;
        n5.next=n6;
        n6.next=n7;

      //  printLL(n1);
        System.out.println();

        // 3 pointer:
        printLL(reverseLL(n1));

        // recursion:
        //printReverse(n1);

    }
}
