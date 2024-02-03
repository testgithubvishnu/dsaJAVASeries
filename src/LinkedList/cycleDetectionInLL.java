package LinkedList;

public class cycleDetectionInLL {
    static class Node
    {
        int data;
        Node next;
        Node(int data)
        {
            this.data=data;
        }
    }
  static boolean detectCycle(Node head)
  {
      Node slow=head;
      Node fast=head;

      while(fast!=null) {
          slow = slow.next;
          fast = fast.next.next;

          if (fast == slow) {
              return true;
          }
      }

      return false;
  }

    public static void main(String[] args) {
        Node n1=new Node(3);
        Node n2=new Node(2);
        Node n3=new Node(0);
        Node n4=new Node(-4);

        n1.next=n2;
        n2.next=n3;
        n3.next=n4;
        n4.next=n2;

        if(detectCycle(n1))
        {
            System.out.println("Cycle exist in Linked list");
        }
        else System.out.println("Cycle does not exist");
    }
}
