package SortingAlgorithms;

public class CountSort {
    static int findMax(int []arr)
    {
        int max=arr[0];
        for(int i=0;i< arr.length;i++)
        {
            if(arr[i]>max)
            {
                max=arr[i];
            }
        }
        return max;
    }
    static void basicCountSort(int[] arr)
    {
        // find largest element in array:
        int max=findMax(arr);
        int[] count=new int[max+1];
        for(int i=0;i< arr.length;i++)
        {
            count[arr[i]]++;
        }
        int k=0;
        for(int i=0;i< count.length;i++)
        {
           for(int j=0;j<count[i];j++)
           {
               arr[k++]=i;
           }
        }
    }

    public static void  printArray(int[] arr)
    {
        for(int i:arr)
        {
            System.out.print(i+" ");
        }
    }
    public static void main(String[] args) {
        int[] arr={1,4,5,2,3,2,1,6};
        System.out.println("Before sorting:");
        printArray(arr);

        System.out.println();

        System.out.println("After sorting:");
        basicCountSort(arr);
        printArray(arr);
    }

}
