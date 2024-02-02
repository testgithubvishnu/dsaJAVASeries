package SearchingAlgorithm;

import java.util.Scanner;

// Better way to find mid = start + (end-start)/2;
// To avoid overflow

// Time complexity= O(log.n)
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

    public static int recursiveBS(int[] arr,int start,int end,int target)
    {
        if(start>end ) return  -1;

        int mid=(start+end)/2;
        if(arr[mid]==target) return mid+1;

        else if(arr[mid]>target) return recursiveBS(arr,start,mid-1,target);

        else return recursiveBS(arr,mid+1,end,target);

    }

    public static void main(String[] args) {
        int[] arr = {12, 26, 33, 48, 53, 61, 79, 85, 90, 112};

        Scanner sc= new Scanner(System.in);
        System.out.println("Enter target to search:");
        int target = sc.nextInt();

        //int pos = binarySearch(arr, target);
        int pos=recursiveBS(arr,0, arr.length-1,target);

        if (pos < 0) {
            System.out.println("Item is not present in array");
        } else {
            System.out.println("Item present at position:" + pos);

        }
    }
}


