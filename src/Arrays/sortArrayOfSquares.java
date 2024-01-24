package Arrays;

public class sortArrayOfSquares {
    static  void printArray(int[] arr)
    {
        for(int i=0;i<arr.length;i++)
        {
            System.out.print(arr[i]+" ");
        }
    }

    static int[] sortSquares(int[] arr)
    {
        int[] ans=new int[arr.length];
       int n= arr.length;
       int left=0,right=n-1;
       int k=0;

       while(left<=right)
       {
          if( Math.abs(arr[left])>Math.abs(arr[right]))
           {
               ans[k++]=arr[left]*arr[left];
               left++;
           }
          else {
              ans[k++]=arr[right]*arr[right];
              right--;
          }

       }
        return ans;
     //  printArray(ans);
    }

    public static void main(String[] args) {
        int[] arr={-10,-7,-5,-2,1,4,9};
      printArray( sortSquares(arr));

    }
}
