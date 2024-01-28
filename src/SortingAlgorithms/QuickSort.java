package SortingAlgorithms;

public class QuickSort {
    static void swap(int[] arr,int i,int j)
    {
        int temp=arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
    }
    static int partition(int[]arr,int start,int end)
    {
        int pivot=arr[start];
        int count=0;

        for(int i=start+1;i<=end;i++)
        {
            if(arr[i]<=pivot) count++;
        }

       int pivotIdx=start+count;
        swap(arr,start,pivotIdx);

        int i=start,j=end;

        while(i<pivotIdx && j>pivotIdx) {
            while (arr[i] <= pivot) i++;
            while (arr[j] > pivot) j--;

            if(i<pivotIdx && j>pivotIdx) {
                swap(arr, i, j);
                i++;
                j--;
            }
        }
        return pivotIdx;
    }
    public static void QuickSort(int[] arr,int start,int end)
    {
        int n= arr.length;
        if(start>=end) return;

        int pivot=partition(arr,start,end);
        QuickSort(arr,start,pivot-1);
        QuickSort(arr,pivot+1,end);

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

        QuickSort(arr,0,arr.length-1);
        printArray(arr);
    }
}
