package Arrays;

import java.util.Arrays;

public class sortArrayofs1sand2s {
    static void swap(int x,int y)
    {
        int temp=x;
        x=y;
        y=temp;
    }
    public static void main(String[] args) {

        int[] arr={0,1,1,1,0,2,1,2,0,0,0};
        int n= arr.length;

        for(int i=0;i<n;i++)
        {
            System.out.print(arr[i]+" ");
        }
        // Using Dutch-National flag Algorithm:

        int low=0,mid=0,high=n-1;

        while(mid<=high)
        {
            if(arr[mid]==0)
            {
                swap(arr[low],arr[mid]);
                low++;
                mid++;
            }
            else if(arr[mid]==1)
            {
                mid++;
            }else{
                swap(arr[mid],arr[high]);
                high--;
            }
        }
Arrays.sort(arr);
        System.out.println();
        for(int i=0;i<n;i++)
        {
            System.out.print(arr[i]+" ");
        }
        //Arrays.deepToString(arr);
    }
}
