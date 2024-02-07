package LinkedList;

// Distance covered:
// n - nodes
// m - cycle length
// m<=n
// dist travelled by fast= 2 X dist travelled by slow

public class StartPointOfCycle {
    static class Node
    {
        int data;
        Node next;
        Node(int data)
        {
            this.data=data;
        }
    }
    static Node detectPoint(Node head)
    {
        Node slow=head;
        Node fast=head;

        while(fast!=null) {
            slow=slow.next;
            fast=fast.next.next;

            if(slow==fast) break;

        }
        Node temp=head;
        while(temp!=slow)
        {
            temp=temp.next;
            slow=slow.next;
        }
        return slow;

    }

    public static void main(String[] args) {
        Node n1= new Node(2);
        Node n2=new Node(1);
        Node n3=new Node(-4);
        Node n4= new Node(5);
        n1.next=n2;
        n2.next=n3;
        n3.next=n4;
        n4.next=n2;

        System.out.println(" starting point of cycle:"+detectPoint(n1).data);

    }
}
