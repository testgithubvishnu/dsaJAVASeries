package SearchingAlgorithm;

public class rotatedSortedArray {
    static int findIndex(int[] arr)
    {
        int n= arr.length;
        int start=0,end=n-1;
        int ans=-1;


        while(start<=end)
        {
            int mid=start+(end-start)/2;
            if(arr[mid]<=arr[n-1])
            {
                ans=mid;
                end=mid-1;
            }
            else
            {
                start=mid+1;
            }
        }
        return ans;
    }
    public static void main(String[] args) {
        int[] arr={5,6,7,8,9,10,1,2,3,4};
        System.out.println("Rotation point of given array: "+ findIndex(arr));
    }
}
