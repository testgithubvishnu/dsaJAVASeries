package SortingAlgorithms;

import java.util.Scanner;

public class BubbleSort {
    public static void bubbleSort(int[] arr)
    {
        for(int i=0;i< arr.length;i++)
        {
            for(int j=0;j< arr.length-i-1;j++)
            {
                if(arr[j]>arr[j+1])
                {
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
        }
    }

 // My approach:
//     for(int i=0;i<n;i++){
//        for(int j=0;j<n;j++){
//            if(arr[i]<arr[j]){
//                int temp=arr[i];
//                arr[i]=arr[j];
//                arr[j]=temp;
//            }
//        }

    public static void  printArray(int[] arr)
    {
        for(int i:arr)
        {
            System.out.print(i+" ");
        }
    }
    public static void main(String[] args) {
        int[] arr={23,56,44,39,21,98,77,63};
        Scanner sc= new Scanner(System.in);

        bubbleSort(arr);
        printArray(arr);

    }
}
