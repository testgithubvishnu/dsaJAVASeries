package LinkedList;

public class addNumbersasLL {
    static class Node{
        int data;
        Node next;

        Node(int data)
        {
            this.data=data;
        }
    }

    static void printLL(Node head)
    {
        while(head!=null)
        {
            System.out.print(head.data+" ");
            head=head.next;
        }
    }

    static Node addTwoNumbers(Node head1,Node head2)
    {
        Node ans= new Node(0);
        Node temp=ans;
        

         return ans.next;
    }
    public static void main(String[] args) {

        // Linked-List First:
        Node Fn1=new Node(2);
        Node Fn2=new Node(4);
        Node Fn3=new Node(3);
        Fn1.next=Fn2;
        Fn2.next=Fn3;
        Fn3.next=null;

        // Linked-List Second:
        Node Sn1=new Node(5);
        Node Sn2=new Node(6);
        Node Sn3=new Node(7);
        Node Sn4=new Node(9);
        Sn1.next=Sn2;
        Sn2.next=Sn3;
        Sn3.next=Sn4;
        Sn4.next=null;

        Node head1=Fn1;
        Node head2=Sn1;

        // Given Linked-Lists:
        System.out.println("Linked-List first:");
        printLL(head1);

        System.out.println("Linked-List Second:");
        printLL(head2);
        System.out.println();

        System.out.println("Addition of two numbers:");
        printLL(addTwoNumbers(head1,head2));
    }
}
