package SearchingAlgorithm;

public class findIndex {
    static  int FindIndex(int[] arr,int target)
    {
        int n= arr.length;
        int start=0,end=n-1;
        int ans=-1;

        while(start<=end) {

            int mid = start + (end - start) / 2;

            if (arr[mid] == target) return mid;

            if (arr[mid] < arr[end]) {
                if (target > arr[mid] && target <= arr[end]) start = mid + 1;

                else {
                    end = mid - 1;
                }
            }
            else {
                if (target >= arr[start] && target < arr[mid]) {
                 end=mid-1;
                }
                else {
                    start=mid+1;
                }
            }


        }
        return ans;
    }
    public static void main(String[] args) {
        int[] arr={5,6,7,8,9,1,2,3,4};
        int target=8;
        System.out.println("Element present at: "+FindIndex(arr,target));
    }
}
