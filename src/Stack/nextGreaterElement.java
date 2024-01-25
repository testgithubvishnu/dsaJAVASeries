package Stack;

import java.util.Stack;

public class nextGreaterElement {
    static int[] nextElement(int[] arr)
    {
          int[] res= new int[arr.length];
          Stack<Integer> s= new Stack<>();
          arr[arr.length-1]=-1;

          s.push(arr[arr.length-1]);
          for(int i=arr.length-2;i>=0;i--)
          {
              if(s.peek()>arr[i])
              {
                  res[i]=s.peek();
              }
              s.push(arr[i]);
          }
          return res;
    }

    public static void main(String[] args) {
        int[] arr={1,3,2,1,8,6,3,4};
        int[] res=nextElement(arr);

        for(int i=0;i<res.length;i++)
        {
            System.out.print(res[i]+" ");
        }
    }
}
