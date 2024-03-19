package Arrays;

public class buyAndSellStock {
    public static void main(String[] args) {
        int[] arr={7,1,5,3,6,4};
        int n= arr.length;

        int min=arr[0];
        int maxProfit=0;

        for(int i=0;i<n;i++)
        {
            int cost=arr[i]-min;
            maxProfit=Math.max(cost,maxProfit);
            min=Math.min(arr[i],min);
        }
        System.out.println(maxProfit);
    }
}
