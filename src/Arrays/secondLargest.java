package Arrays;
import java.lang.reflect.Array;
import java.util.*;
public class secondLargest {
    public static void main(String[] args) {
        int[] arr={7,4,3,8,7,5,1,7};
        int n=arr.length;
        // Approach 1:
        Arrays.sort(arr);
        int largest=arr[n-1];

        for(int i=n-1;i>=0;i--)
        {
            if(arr[i]!=largest)
            {
                System.out.println(arr[i]);
                break;
            }
        }

        // Approach 2:
        int large1=arr[0];
        for(int i=0;i<n;i++)
        {
            if(arr[i]>large1)
            {
                large1=arr[i];
            }
        }
        int large2=-1;
        for(int i=0;i<n;i++)
        {
            if(arr[i]>large2 && arr[i]!=large1)
            {
                large2=arr[i];
            }
        }
        System.out.println(large2);
    }

}
