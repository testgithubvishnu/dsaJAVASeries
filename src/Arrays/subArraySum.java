package Arrays;

import java.util.HashMap;

public class subArraySum {
    public static void main(String[] args) {
        int[] arr={1,2,3,1,1,1,1,4,2,3};
        int longest=0;
        int A=3;

        //Bruit-Force Approach:
         for(int i=0;i< arr.length;i++)
         {
             int sum=0;
             for(int j=i;j< arr.length;j++)
              {
                    sum += arr[j];
                    if (sum == A)
                    {
                        longest = Math.max(longest, j - i + 1);
                    }

              }
         }


         //Optimal Approach:
//        HashMap<Integer,Integer> hm=new HashMap<>();
//         int sum=0;
//         int maxLen=0;
//         for(int i=0;i< arr.length;i++)
//         {
//             sum+=arr[i];
//             if(sum==A)
//             {
//                 maxLen=Math.max(maxLen,i+1);
//             }
//             int rem=sum-A;
//             if(hm.containsValue(rem))
//             {
//                 int len= hm.get(rem);
//                 maxLen=Math.max(maxLen,len);
//             }
//
//         }

        System.out.println(longest);
    }
}
