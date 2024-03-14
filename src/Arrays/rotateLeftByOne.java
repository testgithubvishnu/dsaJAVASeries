package Arrays;

public class rotateLeftByOne {
    public static void main(String[] args) {
        int[] arr={1,2,3,4,5,6};
        int n= arr.length;

        // Roatate array Left by One:
        int temp=arr[0];
        for(int i=1;i<n;i++)
        {
            arr[i-1]=arr[i];
        }
   arr[n-1]=temp;
        for(int i=0;i<n;i++)
        {
            System.out.print(arr[i]+" ");
        }
        System.out.println();
        // Rotate array Left by D places:
        int d=2;
        d=d%n;
        int[] temparr=new int[d];
        for(int i=0;i<d;i++)
        {
            temparr[i]=arr[i];
        }

        for(int i=d;i<n;i++)
        {
           arr[i-d]=arr[i];
        }

        for(int i=n-d;i<n;i++)
        {
            arr[i]=temparr[i-(n-d)];
        }
        for(int i=0;i<n;i++)
        {
            System.out.print(arr[i]+" ");
        }
    }
}
