package SearchingAlgorithm;

public class LinearSearch {
    public static int linearSearch(int[] arr,int target)
    {
        for(int i:arr)
        {
            if(arr[i]==target) return i+1;
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] arr={4,6,2,8,3,9,7,1};
        int target=2;
       int pos= linearSearch(arr,target);
        System.out.println("Item present at position:"+pos);

    }
}
