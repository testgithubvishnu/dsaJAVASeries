package Recursion;

public class maxValueOfArray {
    static int maxValue(int[] arr,int i)
    {
        if(i==arr.length-1) return arr[i];

        int smallAns=maxValue(arr,i+1);
        return Math.max(arr[i],smallAns);
    }
    public static void main(String[] args) {
        int[] arr={12,53,85,25,38,16,94,63};
        System.out.println("Max Element in Array:"+ maxValue(arr,0));
    }
}
