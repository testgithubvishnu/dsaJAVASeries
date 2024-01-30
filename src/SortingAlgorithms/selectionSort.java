package SortingAlgorithms;

// In place comparison based sorting
public class selectionSort {
    static void selectionSort(int[] arr)
    {
        int n=arr.length;
       for(int i=0;i<n-1;i++)
       {
           int min=i;
           for(int j=i+1;j<n;j++)
           {
              if(arr[j]<arr[min])
              {
                  min=j;
              }
           }
           int temp=arr[i];
           arr[i]=arr[min];
           arr[min]=temp;
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
        int[] arr={23,56,44,39,21,98,77,63};

        System.out.println("Sorted array is:");
        selectionSort(arr);
        printArray(arr);
    }
}
