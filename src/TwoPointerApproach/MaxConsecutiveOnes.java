package TwoPointerApproach;

public class MaxConsecutiveOnes {
    public static void main(String[] args) {
        int[] arr={1,1,0,1,1,1,0,0,1,1,1,1};
        int maxC=0;
        int count=0;
        int n=arr.length;

        for(int i=0;i<n;i++)
        {
           if(arr[i]==1)
           {
               count++;
               maxC=Math.max(maxC,count);
           }
           else{
               count=0;
           }
        }
        System.out.println(maxC);
    }
}
