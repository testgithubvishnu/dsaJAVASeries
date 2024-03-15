package Arrays;

import java.util.ArrayList;

public class moveZerosToEnd {
    public static void main(String[] args) {
        int[] arr={2,0,3,0,0,5,6,0,7,0};
        int n=arr.length;
        ArrayList<Integer> ans= new ArrayList<>();
        int count=0;
        // Expected: [2,3,5,6,7,0,0,0,0,0]

       //Bruit-force Approach:
        for(int i=0;i<n;i++)
        {
            if(arr[i]!=0)
            {
                ans.add(arr[i]);
            }
            else{
                count++;
            }
        }
        for(int i=0;i<count;i++)
        {
            ans.add(0);
        }

        for(int i=0;i<n;i++)
        {
            System.out.print(" "+ans.get(i));
        }
    }
}
