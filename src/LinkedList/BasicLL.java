package LinkedList;

public class BasicLL {
    public static int length(Node node)
    {
        int count=0;
        while(node!=null)
        {
            count++;
            node=node.next;
        }
        return count;
    }
    static  void display(Node node)
    {
        while(node!=null)
        {
            System.out.println(node.data);
            node=node.next;

        }
    }
    static  void displayrev(Node node)
    {
        if(node == null) return;
        displayrev(node.next);
        System.out.println(node.data+" ");
    }
    public  static class Node
    {
        int data;
        Node next;
        Node(int data)
        {
            this.data=data;
        }
    }
    public static void main(String[] args) {
        Node node1= new Node(10);
        Node node2= new Node(20);
        Node node3= new Node(30);
        Node node4= new Node(40);
        Node node5= new Node(50);

        node1.next=node2;
        node2.next=node3;
        node3.next=node4;
        node4.next=node5;

       // Node temp=node1;
//        display(node1);
//        displayrev(node1);

       System.out.println(length(node1));
    }
}
