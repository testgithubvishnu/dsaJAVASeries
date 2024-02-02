package SortingAlgorithms;

// Digit by digit sorting of array


public class RadixSort {
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

    static void countSort(int[] arr)
    {
        // Find largest element of the arr:
        int max=findMax(arr);
        int[] count=new int[max+1];
        int[] output=new int[arr.length];

        //Frequency array
        for(int i=0;i< arr.length;i++)
        {
            count[arr[i]]++;
        }

        // make prefix sum array of count array:
        for(int i=1;i< count.length;i++)
        {
            count[i]=count[i]+count[i-1];
        }

        // Find index of each elemnt in the original array and put it into output array:
        for(int i= arr.length-1;i>=0;i--)
        {
            int idx=count[arr[i]]-1;
            output[idx]=arr[i];
            count[arr[i]]--;
        }

        // Copy ouput array into arr:
        for(int i=0;i< output.length;i++)
        {
            arr[i]=output[i];
        }
    }

static void radixSort(int[] arr)
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
        int[] arr={170,45,75,90,802,2};
        System.out.println("Before sorting:");
        printArray(arr);

        System.out.println();

        System.out.println("After sorting:");
        radixSort(arr);
        printArray(arr);
    }
}
