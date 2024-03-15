package Arrays;

import java.util.*;

public class UnionOfSortedArrays {
    public static void main(String[] args) {
       int[] arr1={1,1,2,3,4,5,4};
       int[] arr2={2,3,4,4,5,6};
       int n1=arr1.length;
       int n2=arr2.length;

       ArrayList<Integer> ans = new ArrayList<>();
       int i=0;
       int j=0;
       while(i<n1 && j<n2 ) {
          if(arr1[i]<arr2[j]) {
               if (!ans.contains(arr1[i])) {
                   ans.add(arr1[i]);
               }
               i++;
           }

          else{
              if (!ans.contains(arr2[j])) {
                  ans.add(arr2[j]);
              }
              j++;
          }
       }

        for(int nums:ans)
        {
            System.out.print(" "+nums);
        }
    }
}
