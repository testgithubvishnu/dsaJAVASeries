package Arrays;

import java.util.HashMap;

public class TwoSumProblem {
    public static void main(String[] args) {
        int[] arr={2,6,5,8,11};
        int tem=14;
        int n= arr.length;

        //Bruit-force Approach:
//        for(int i=0;i<n;i++)
//        {
//            int sum=0;
//            for(int j=i+1;j<n;j++)
//            {
//               if( tem==arr[i]+arr[j])
//               {
//                   System.out.println(i+" "+j);
//               }
//
//            }
//        }
//Time complexity: O(n^2)

        //Optimal Approach:
        //Using HashMap:
//        HashMap<Integer,Integer> hm= new HashMap<>();
//         for(int i=0;i<n;i++)
//         {
//             int curr=arr[i];
//             int rem= tem-curr;
//             if(hm.containsKey(rem))
//             {
//                 System.out.println("Yes");
//                 System.out.println(hm.get(rem)+" " +i);
//             }
//             else{
//                 hm.put(curr,i);
//             }
//         }

         //Time complexity: O(n*logn)

        //optimal approach:
        // Using Two-pointer Approach
           int p=0,q=n-1;
         for(int i=0;i<n;i++)
         {
             if(arr[p]+arr[q]==tem)
             {
                 System.out.println("Yes");
                 System.out.println(p+" "+q);
                 break;
             }
             else if(arr[p]+arr[q]<tem)
             {
                 p++;
             }
             else{
                 q--;
             }
         }
    }
}
