package SortingAlgorithms;

public class InsertionSort {
    public static void insertionSort(int[] arr)
    {
       for(int i=1;i< arr.length;i++)
       {
           int j=i;
           while(j>0 && arr[j]<arr[j-1])
           {
               int temp=arr[j];
               arr[j]=arr[j-1];
               arr[j-1]=temp;
               j--;
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
    public static void main(String[] args)
    {
        int[] arr={23,56,44,39,21,98,77,63};

        insertionSort(arr);
        printArray(arr);
    }
}
