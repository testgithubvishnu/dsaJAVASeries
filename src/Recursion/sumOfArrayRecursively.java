package Recursion;

public class sumOfArrayRecursively {
    static int sumOfArray(int[] arr,int i)
    {
         if(i==arr.length-1) return arr[i];
         return arr[i]+sumOfArray(arr,i+1);
    }
    public static void main(String[] args) {
        int[] arr={1,2,3,4,5,6,7,8,9,10};
        System.out.println("Sum of Array element:"+sumOfArray(arr,0));
    }
}