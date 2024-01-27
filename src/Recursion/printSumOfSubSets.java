package Recursion;

public class printSumOfSubSets {
    static void subsetSum(int[] arr,int n,int idx,int sum)
    {
        if(idx>=n)
        {
            System.out.println(sum);
            return;
        }
        subsetSum( arr,n, idx+1, sum+arr[idx]);
        subsetSum( arr, n, idx+1, sum);
    }
    public static void main(String[] args) {
        int[] arr={2,4,5};
        subsetSum(arr,arr.length,0,0);
    }
}
