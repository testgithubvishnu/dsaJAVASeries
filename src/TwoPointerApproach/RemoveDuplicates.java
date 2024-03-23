package TwoPointerApproach;

public class RemoveDuplicates {
    public static void main(String[] args) {
        int[] arr= {1,1,2,2,2,3,3,4};
        int n= arr.length;

        int j=0;
        for(int i=1;i<n;i++)
        {
            if(arr[i]!=arr[j])
            {
                j++;
                arr[j]=arr[i];
            }

        }
        System.out.println(j+1);

    }

}
