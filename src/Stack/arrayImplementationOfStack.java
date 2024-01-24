package Stack;

public class arrayImplementationOfStack {
     static  class stack
    {
        private int[] arr=new int[10];
       private  int idx=0;
        void push(int x)
        {
            arr[idx]=x;
            idx++;
        }

        int peek()
        {
            if(idx==0) {
                System.out.println("Stack is empty!");
                return -1;
            }
            return arr[idx-1];
        }
        int pop() {
            if (idx == 0) {
                System.out.println("Stack is empty!");
                return -1;
            }
            int ans = arr[idx - 1];
            idx--;
            return ans;
        }
        int size()
        {
          return idx;
        }
        void display()
        {
            for(int i=0;i<=idx-1;i++)
            {
                System.out.print(arr[i]+" ");
            }
        }
        boolean isEmpty()
        {
            if(size()==0) return true;
            return  false;
        }

        boolean isFull()
        {
            if(size()==arr.length) return true;
            return  false;
        }
    }

    public static void main(String[] args) {
       stack st=new stack();
       st.push(23);
       st.push(56);
       st.push(97);
       st.pop();
        System.out.println(st.size());
        st.display();

    }
}
