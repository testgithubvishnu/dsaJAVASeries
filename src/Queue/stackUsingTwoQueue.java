package Queue;

import java.util.LinkedList;
import java.util.Queue;

public class stackUsingTwoQueue {
    public static class stackByTwoQueue{
        Queue<Integer> q= new LinkedList<>();

        public void push(int x)
        {
            if(q.size()==0)
            {
                q.add(x);
            }
            else {
                for(int i=1;i<=q.size()-1;i++)
                {
                    q.add(q.remove());
                }
            }
        }
        public int top()
        {
           return q.peek();
        }
        public int pop()
        {
           return q.remove();
        }
    }
    public static void main(String[] args) {

    }

}
