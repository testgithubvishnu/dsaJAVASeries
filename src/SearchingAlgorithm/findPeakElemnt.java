package SearchingAlgorithm;

public class findPeakElemnt {
    static int findPeak(int[] arr)
    {
        int st=0,end=arr.length-1;
        int ans=Integer.MAX_VALUE;

        while(st<=end)
        {
            int mid=st+(end-st)/2;
            if(arr[mid]<arr[mid+1])
            {
                ans=mid+1;
                st=mid+1;
            }
            else {
                end=mid-1;
            }
        }
        return ans;
    }
    public static void main(String[] args) {
        int[] arr={2,3,5,6,9,11,8,7,4,3,1};
        System.out.println("index of peak element is: "+findPeak(arr));
    }
    
}
