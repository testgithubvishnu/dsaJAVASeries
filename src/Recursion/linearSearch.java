package Recursion;

import java.util.Scanner;

public class linearSearch {
    static int LinearSearch(int[]arr,int i,int target)
    {
        if(arr[i]==target) return i+1;
        return LinearSearch(arr,i+1,target);
    }
    public static void main(String[] args) {
        int[] arr={32,84,63,48,12,52,23,59,36};

        Scanner sc= new Scanner(System.in);
        System.out.println("Enter element to search:");
        int target=sc.nextInt();

        System.out.println("Target found at:"+LinearSearch(arr,0,target)+" position");
    }
}
