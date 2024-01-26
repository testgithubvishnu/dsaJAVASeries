package Recursion;

public class printArrayRecursively {
    static void printArray(int[] arr,int idx)
    {
      // Base case;
      if(idx== arr.length) return;
        System.out.print(arr[idx]+" ");
        printArray(arr,idx+1);

    }
    public static void main(String[] args) {
        int[] arr={1,2,3,4,5,6,7,8,9};
        printArray(arr,0);
    }
}
