package LinkedList;

public class oddEvenLinkedList {
    static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
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

    static Node oddEvenLL(Node head)
    {

        Node even=new Node(100);
        Node odd=new Node(200);

        Node tempo=odd;
        Node tempe=even;

        Node temp=head;
        while(temp!=null)
        {
            if(temp.data%2==0)
            {
                tempe.next=temp;
                tempe=even;
            }
            else {
                tempo.next=temp;
                tempo=odd;
            }
            temp=temp.next;
        }
        tempe.next=odd.next;

       return even.next;
    }
        public static void main(String[] args) {
            Node n1= new Node(4);
            Node n2= new Node(11);
            Node n3= new Node(7);
            Node n4= new Node(5);
            Node n5= new Node(8);
            Node n6= new Node(2);
            Node n7= new Node(9);

            n1.next=n2;
            n2.next=n3;
            n3.next=n4;
            n4.next=n5;
            n5.next=n6;
            n6.next=n7;

            printLL(n1);
            System.out.println();
            printLL(oddEvenLL(n1));

        }
}
