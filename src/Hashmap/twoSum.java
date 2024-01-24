package Hashmap;

import java.util.HashMap;

public class twoSum {
//    public static  int[] Twosum(int[] nums,int target)
//    {
//        int n= nums.length;
//        int [] ans={-1};
//        for(int i=0;i<n;i++)
//        {
//            for(int j=i+1;j<n;j++)
//            {
//                if(nums[j]==target-nums[i])
//                {
//                    ans=new int[]{i,j};
//                    return  ans;
//                }
//            }
//        }
//
//        return ans;
//    }

    public static int[] twoSum(int[] nums,int target)
    {
        int n=nums.length;
        int[] ans={-1};

        HashMap<Integer,Integer> hm= new HashMap<>();
        for(int i=0;i<n;i++)
        {
            int partner=target-nums[i];
            if(hm.containsKey(partner))
            {
                ans=new int[]{i,hm.get(partner)};
                return ans;
            }
                hm.put(nums[i],i);
        }
        return ans;

    }

    public static void main(String[] args) {
      int[] arr={2,5,4,3,6,7,1,9,4,2};
      int target=11;

      //int[] ans=Twosum(arr,target);

        int[] ans=twoSum(arr,target);
        System.out.println("Target sum indices are:");
        for(int i=0;i<2;i++)
        {
            System.out.print(ans[i]+" ");
        }
    }
}
