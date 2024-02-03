package LinkedList;

public class deleteMiddleOfLL {
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
    static Node deleteMiddleNode(Node head)
    {
        if(head.next==null) {
        return null;
        }
       Node slow=head;
       Node fast=head;
        while(fast.next.next!=null && fast.next.next.next!=null)
        {
            slow=slow.next;
            fast=fast.next.next;
        }

            slow.next = slow.next.next;
        return head;
    }
    public static void main(String[] args) {
        Node n1=new Node(10);
        Node n2=new Node(20);
        Node n3=new Node(30);
        Node n4=new Node(40);
        Node n5=new Node(50);
        Node n6=new Node(60);
        Node n7=new Node(70);

        n1.next=n2;
        n2.next=n3;
        n3.next=n4;
        n4.next=n5;
        n5.next=n6;
        n6.next=n7;

        printLL(n1);
        Node temp=deleteMiddleNode(n1);

        System.out.println();
        printLL(temp);

    }
}
