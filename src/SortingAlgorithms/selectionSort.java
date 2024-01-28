package SortingAlgorithms;

public class selectionSort {
    static void selectionSort(int[] arr)
    {

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
