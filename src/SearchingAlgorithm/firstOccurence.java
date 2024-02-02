package SearchingAlgorithm;

public class firstOccurence {
     static  int firstOccur(int[] arr,int x)
    {
        int start=0,end= arr.length-1;
        int fO=-1;
        while(start<=end)
        {
            int mid=start+(end-start)/2;
            if(arr[mid]==x)
            {
               fO=mid;
               end=mid-1;
            }
            else if(x<arr[mid])
            {
                end =mid-1;
            }
            else {
                start=mid+1;
            }

        }
        return fO;
    }
    public static void main(String[] args) {
   int[] arr={5,5,5,5,6,6,7,8,8};
   int x=6;
   System.out.println("First ocuurence of "+x+" is "+firstOccur(arr,x));
    }
}
