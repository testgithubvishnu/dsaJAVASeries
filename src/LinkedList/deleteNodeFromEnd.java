package LinkedList;

public class deleteNodeFromEnd {
    static class Node
    {
        int data;
        Node next;
        Node(int data)
        {
            this.data=data;
        }
    }
    static void deleteNode(Node head,int n)
    {
        int size=0;
        Node temp=head;
        while(temp!=null)
        {
            size++;
            temp=temp.next;
        }

        temp=head;
        int a=size-n+1;
        for(int i=1;i<a-1;i++)
        {
            temp=temp.next;
        }
        Node temp1=temp.next.next;
        temp.next=temp1;

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
        Node n1= new Node(10);
       Node n2= new Node(20);
       Node n3= new Node(30);
       Node n4= new Node(40);
       Node n5= new Node(50);
       Node n6= new Node(60);

        n1.next=n2;
        n2.next=n3;
        n3.next=n4;
        n4.next=n5;
        n5.next=n6;

        printLL(n1);
        deleteNode(n1,3);

        System.out.println();
        printLL(n1);

    }
}
