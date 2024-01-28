package SearchingAlgorithm;

public class BinarySearch {

    public static int binarySearch(int[] arr, int target) {
        int low = 0, high = arr.length - 1;
        while (low <= high) {
            int mid = (low + high) / 2;
            if (arr[mid] == target) {
                return mid+1;
            } else if (arr[mid] > target) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] arr = {12, 26, 33, 48, 53, 61, 79, 85, 90, 112};
        int target = 90;

        int pos = binarySearch(arr, target);

        if (pos < 0) {
            System.out.println("Item is not present in array");
        } else {
            System.out.println("Item present at position:" + pos);

        }
    }
}


