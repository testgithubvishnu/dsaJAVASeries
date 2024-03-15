package Arrays;

public class rotateRight {
    public static void main(String[] args) {
        int []arr={1,2,3,4,5,6};
        int n= arr.length;;

        // Rotate right: D=3, arr=[4,5,6,1,2,3];
        int D=3;

        // Roatate array to right by one position:
        int temp=arr[n-1];
        for(int i=0;i<n-1;i++)
        {
            arr[i+1]=arr[i];
        }
        arr[0]=temp;

        for (int i=0;i<n;i++)
        {
            System.out.print(" "+arr[i]);
        }
    }
}
