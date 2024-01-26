package Recursion;

public class SearchAllIndices {
    static void findAllIndices(int[] arr,int target,int idx)
    {
        if(idx>= arr.length) return;
        if(arr[idx]==target) System.out.print((idx+1)+" ");

        findAllIndices(arr,target,idx+1);
    }
    public static void main(String[] args) {
        int[] arr={12,64,38,72,49,12,86,32,12};
        int target=12;

        findAllIndices(arr,target,0);
    }
}
