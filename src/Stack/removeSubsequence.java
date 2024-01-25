package Stack;

import java.util.Stack;

public class removeSubsequence {
    public static int[] remove(int[] arr)
    {
       Stack<Integer> st= new Stack<>();
       for(int i=0;i<arr.length;i++)
       {
           if (st.size() == 0 || st.peek() != arr[i]) {
               st.push(arr[i]);
           }
           else if (arr[i] == st.peek()) {
               if (i == arr.length - 1 || (arr[i] != arr[i + 1])) {
                   st.pop();
               }
           }
       }
           int[] res = new int[st.size()];
           int n = res.length;
           for (int j = n - 1; j>= 0; j--) {
               res[j] = st.pop();
           }
        return res;
    }
    public static void main(String[] args) {
   int[] arr={1,2,2,3,10,10,10,4,4,4,6,7,7,8};
  int[] res=remove(arr);
  for(int i=0;i<res.length;i++)
  {
      System.out.println(res[i]+" ");
  }
    }
}
