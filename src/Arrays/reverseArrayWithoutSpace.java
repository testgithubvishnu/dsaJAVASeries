package Arrays;
import java.util.*;
public class reverseArrayWithoutSpace {
    static  void swap(int a,int b)
    {
        a=a+b;
        b=a-b;
        a=a-b;
    }
    static void reverse(int[] ans,int j,int i)
    {

        while(j<i)
        {
            reverseArrayWithoutSpace.swap(ans[j],ans[i]);
            j++;
            i--;
        }
    }

    public static void main(String[] args) {
        int[] arr={23,64,92,16,85,77,72,49};
        int k=3;
        int n=arr.length;
        k=k%n;
        reverse(arr,0,n-k-1);
        reverse(arr,n-k,n-1);
        reverse(arr,0,n-1);

       for(int i=0;i<n;i++)
       {
           System.out.print(arr[i]+" ");
       }

    }
}
