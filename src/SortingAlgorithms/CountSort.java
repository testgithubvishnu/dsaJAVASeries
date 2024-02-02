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
    public static void  printArray(int[] arr)
    {
        for(int i:arr)
        {
            System.out.print(i+" ");
        }
    }
    public static void main(String[] args) {
        int[] arr={2,3,2,4,0,1,4,1,0,2};
        System.out.println("Before sorting:");
        printArray(arr);

        System.out.println();

        System.out.println("After sorting:");
        basicCountSort(arr);
        countSort(arr);
        printArray(arr);
    }

}
