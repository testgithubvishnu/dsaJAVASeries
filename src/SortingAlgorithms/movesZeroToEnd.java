package SortingAlgorithms;

public class movesZeroToEnd {
    static void MovesZero(int[] arr)
    {
        for(int i=0;i< arr.length;i++)
        {
            for(int j=0;j< arr.length-i-1;j++)
            {
                if(arr[j]==0 && arr[j+1]!=0)
                {
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
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
        int[] arr={0,5,0,3,4,0,2};
        printArray(arr);

        System.out.println();
        MovesZero(arr);
        printArray(arr);

    }
}
