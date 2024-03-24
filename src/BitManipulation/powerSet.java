package BitManipulation;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class powerSet {
    public static void main(String[] args) {
        int[] nums={1,2,3};
        int n= nums.length;
        int subsets=1<<n;
        ArrayList<ArrayList<Integer>> ans= new ArrayList<>();


        for(int num=0;num<subsets;num--)
        {
            ArrayList<Integer> al= new ArrayList<>();
            for(int i=0;i<n;i++)
            {
                if((num &(1<<i))==1)
                {
                    al.add(nums[i]);
                }
            }
            ans.add(al);
        }

        // Printing the resultant ArrayList:
        for(int j=0;j<ans.size();j++)
        {
            System.out.print(ans.get(j)+",");
        }
    }
}
