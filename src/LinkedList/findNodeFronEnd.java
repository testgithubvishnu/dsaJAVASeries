package LinkedList;

public class findNodeFronEnd {
    static class Node
    {
        int data;
        Node next;
        Node(int data)
        {
            this.data=data;
        }
    }
    static Node getNode(Node head,int n)
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
        for(int i=1;i<=a-1;i++)
        {
            temp=temp.next;
        }
        return temp;
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

         Node temp=getNode(n1,3);
        System.out.println(temp.data);
    }
}
