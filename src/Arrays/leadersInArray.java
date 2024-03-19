package Arrays;

public class leadersInArray {
    public static void main(String[] args) {
        int[] arr={10,8,3,22,12,3,0,6};
        int n= arr.length;

        //Approach 2:
//        for(int i=1;i<n-1;i++)
//        {
//            if(arr[i]>arr[i+1] && arr[i]>arr[i-1])
//            {
//                System.out.println(arr[i]);
//            }
//        }

        //Approach 2:
        //int j=n-1;
        int max=Integer.MIN_VALUE;
        for(int i=n-1;i>=0;i--)
        {
            if(arr[i]>max)
            {
                max=arr[i];
            }
        }
        System.out.println(max);
    }
}
