package Queue;

public class queueUsingArray {
    public static class queue
    {
        int[] arr=new int[100];
        int front=-1;
        int rear=-1;
        int size=0;

        public void add(int x)
        {
            //arr[rear]
            if(rear==arr.length-1)
            {
                System.out.println("Queue is full!");
                return;
            }
            if(front==-1) {
                front = rear = 0;
                arr[rear]=x;
            }
            else {
                arr[++rear]=x;
            }
            size++;
        }

        public int remove()
        {
            if(size==0)
            {
                System.out.println("Queue is empty!");
                return -1;
            }
            front++;
            size--;
            return arr[front-1];
        }

        public int peek()
        {
            return arr[front];
        }
        public boolean isEmpty()
        {
            if(size==0)
            {
                return true;
            }
            return  false;
        }

        public boolean isFull()
        {
            if(size== arr.length)
            {
                return true;
            }
            return  false;
        }

        public void display()
        {
            for(int i=front;i<=rear;i++)
            {
                System.out.print(arr[i]+" ");
            }
        }
    }
    public static void main(String[] args) {
     queue q= new queue();
    q.add(23);
    q.add(12);
    q.add(85);
    q.add(39);

    System.out.println(q.remove());
    q.display();


    }
}
