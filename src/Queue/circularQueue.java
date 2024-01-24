package Queue;

public class circularQueue {
    public static class circularQ
    {
         int front=-1;
         int rear=-1;
         int size=0;
         int[] arr= new int[5];

         public void add(int x) throws  Exception
         {
             if(size==arr.length)
             {
                 throw new Exception("Queue is full!");
             }
             else if(size==0)
             {
                front=rear=0;
                arr[rear]=x;

             }
             else if(rear< arr.length-1)
             {
                 arr[++rear]=x;
             }
             else if(rear==arr.length-1)
             {
                 rear=0;
                 arr[0]=x;
             }
             size++;
         }

         public boolean isFull() throws  Exception
         {
             throw new Exception("Queue is Full!");
         }
         public boolean isEmpty() throws Exception
         {
            throw new Exception("Queue id Empty!");
         }

         public int peek() throws Exception
         {
             if(size==0)
             {
                 throw new Exception("Queue is Empty!");
             }
             else return arr[front];
         }
         public int remove() throws Exception
         {
              if(size==0)
              {
                  throw  new Exception("Queue is Empty!");
              }
              else
              {
                  int x =arr[front];
                  if(front== arr.length-1) front = 0;
                  else front++;
                  size--;
                  return x;
              }
         }

         public int size()
         {
           return size;
         }
         public void display()
         {
             if(size==0)
             {
                 System.out.println("Queue is Empty!");
             }
           else if(front<=rear)
           {
               for(int i=front;i<=rear;i++)
               {
                   System.out.print(arr[i]+" ");
               }
           }
           else {
             for(int i=front;i<= arr.length-1;i++)
             {
                 System.out.print(arr[i]+" ");
             }
             for(int i=0;i<rear;i++)
             {
                 System.out.print(arr[i]+" ");
             }
                 System.out.println();
           }
         }
    }
    public static void main(String[] args) throws Exception {
     circularQ cq= new circularQ();
     cq.display();
        cq.add(10);
        cq.add(20);
        cq.add(30);
        cq.add(40);
        cq.add(50);
        //cq.add(60);
        cq.display();
        System.out.println();

       // System.out.println(cq.remove());
        cq.remove();
        cq.display();
        System.out.println();

        cq.add(70);
        cq.display();

        System.out.println(cq.size);
       cq.add(80);

    }
}
