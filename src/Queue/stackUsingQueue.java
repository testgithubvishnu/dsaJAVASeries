package Queue;

import java.util.LinkedList;
import java.util.Queue;

public class stackUsingQueue {
  public static  class stackFromQueue
  {
      Queue<Integer> q= new LinkedList<>();

      public void push(int x)
      {
         q.add(x);
         //size++;
      }
      public int pop()
      {
       for(int i=1;i<=q.size()-1;i++)
        {
           q.add(q.remove());
        }
       // int x=q.remove();
        return q.remove();
      }
      public int top()
      {
          for(int i=1;i<=q.size()-1;i++)
          {
              q.add(q.remove());
          }
          int x=q.peek();
          q.add(q.remove());
          return x;
      }
      public boolean empty()
      {
          if(q.size()==0) return true;
          else return  false;
      }

  }
    public static void main(String[] args) {
         stackFromQueue  q= new stackFromQueue();
         q.push(12);
         q.push(24);
         q.push(36);
         q.push(48);

        System.out.println(q.pop());

        System.out.println(q.top());



    }
}
