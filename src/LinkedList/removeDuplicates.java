package LinkedList;

public class removeDuplicates {
    static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
        }
    }


    static Node removeDupli(Node head) {
     Node temp=head;
     while(temp!=null && temp.next!=null)
     {
         if(temp.data==temp.next.data)
         {
             temp.next=temp.next.next;
         }

         if(temp.next==null) return head;
         if(temp.data!=temp.next.data)
         {
             temp=temp.next;
         }
     }
     return head;

    }

    static  void printLL(Node head)
    {
        Node temp=head;
        while(temp!=null)
        {
            System.out.print(temp.data+" ");
            temp=temp.next;
        }
    }
    public static void main(String[] args) {
        Node n1 = new Node(1);
        Node n2 = new Node(2);
        Node n3 = new Node(2);
        Node n4 = new Node(3);
        Node n5 = new Node(3);
        Node n6 = new Node(3);
        Node n7 = new Node(4);
        Node n8 = new Node(4);

        n1.next = n2;
        n2.next = n3;
        n3.next = n4;
        n4.next = n5;
        n5.next = n6;
        n6.next = n7;
        n7.next=n8;

        printLL(n1);

        System.out.println();
        printLL(removeDupli(n1));
    }
}