package Queue;

import java.util.ArrayDeque;
import java.util.LinkedList;
import java.util.Queue;

public class displayQueue {
    public static void main(String[] args) {
        Queue<Integer> q= new LinkedList<>();
        q.add(10);
        q.add(20);
        q.add(30);
        q.add(40);
        q.add(50);

        Queue<Integer> helper= new ArrayDeque<>();
        while(q.size()>0)
        {
            System.out.println(q.peek());
            //int x=q.poll();
            helper.add(q.poll());
        }
        while(helper.size()>0)
        {

            q.add(helper.poll());
        }
    }
}
