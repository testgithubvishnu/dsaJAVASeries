package Arrays;

public class sortZeroesAndOnes {
    static  void swap(int a,int b)
    {
        int temp=a;
        a=b;
        b=temp;
    }
    static void printArray(int[] arr)
    {
        for(int i=0;i< arr.length;i++)
        {
            System.out.print(arr[i]+" ");
        }
    }
    // Alternate Method to Sort ZeroesAndOnes Array:
    static  void sortZeroesAndOnes(int[] arr)
    {
        int i=0;
        int j= arr.length-1;;
        while(i<j)
        {
            if(arr[i]==1 && arr[j]==0)
            {
                swap(arr[i],arr[j]);
                i++;
                j--;
            }
            if(arr[i]==0)
            {
                i++;
            }
            if(arr[j]==1)
            {
                j--;
            }
        }
    }

    public static void main(String[] args) {
        int[] arr={1,0,0,1,0,1,1,0,0,1,1,0,0,0};
        int zeroes=0;

        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]==0)
            {
                zeroes++;
            }
        }
        for(int i=0;i< arr.length;i++)
        {
            if(zeroes>0)
            {
                arr[i]=0;
                zeroes--;
            }
            else {
                arr[i]=1;
            }
        }
        printArray(arr);
        sortZeroesAndOnes(arr);

        System.out.println();
        printArray(arr);

    }
}
