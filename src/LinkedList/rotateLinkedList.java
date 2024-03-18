package LinkedList;

public class rotateLinkedList {
    static Node rotateLL(int k,Node head)
    {
        Node curr=head;
        for(int i=1;i<k;i++)
        {
            curr=curr.next;
        }

        Node end=curr;
        while(end.next!=null)
        {
            end=end.next;
        }
         end.next=head;
        Node newhead=curr.next;
        curr.next=null;

        return newhead;
    }
    static void display(Node head)
    {
        Node temp=head;
        while(temp!=null)
        {
            System.out.print(temp.data+" ");
            temp=temp.next;
        }
    }
    static class Node{
        int data;
        Node next;

        Node(int data)
        {
            this.data=data;
        }
    }

    public static void main(String[] args) {
        Node node1= new Node(2);
        Node node2= new Node(4);
        Node node3= new Node(7);
        Node node4= new Node(8);
        Node node5= new Node(9);

        node1.next=node2;
        node2.next=node3;
        node3.next=node4;
        node4.next=node5;

        System.out.println("Before rotation:");
        display(node1);
        int k=3;

        System.out.println();
        System.out.println("After rotation:");
        display( rotateLL(k,node1));

    }

}
