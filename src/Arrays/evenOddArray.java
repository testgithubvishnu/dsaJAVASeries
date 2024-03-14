package Arrays;

public class evenOddArray {
    static  void printArray(int[] arr)
    {
        for(int i=0;i<arr.length;i++)
        {
            System.out.print(arr[i]+" ");
        }
    }

    static  void swap(int a,int b)
    {
        int temp=a;
        a=b;
        b=temp;
    }
    static  void evenOddArray(int[] arr)
    {
        int i=0;
        int j= arr.length-1;
        while(i<j)
        {
            if(arr[i]%2==1 && arr[j]%2==0)
            {
                swap(arr[i],arr[j]);
                i++;
                j--;
            }
            if(arr[i]%2==0)
            {
                i++;
            }
            if(arr[j]%2==1)
            {
                j--;
            }
        }
    }

    public static void main(String[] args) {
        int[] arr={1,4,7,2,9,3,6,8,5,3};

//        int[] ans=new int[arr.length];
//        int j=0;
//        int k= arr.length-1;
//
//        for(int i=0;i< arr.length;i++)
//        {
//            if(arr[i]%2==0)
//            {
//                ans[j++]=arr[i];
//            }
//            else {
//                ans[k--]=arr[i];
//            }
//        }
//        printArray(ans);

        evenOddArray(arr);
        printArray(arr);
    }
}
