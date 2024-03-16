package Arrays;
import java.util.*;
public class intersectionOfSortedArrays {
    public static void main(String[] args) {

        int[] arr1 = {2, 2, 3,3, 4, 5, 5};
        int[] arr2 = {1, 3, 4, 4, 5, 6};


        //Bruit-Force Approach:
        ArrayList<Integer> ans = new ArrayList<>();
        int n1 = arr1.length;
        int n2 = arr2.length;


        int[] visited = new int[n2];
        for (int i = 0; i < n1; i++) {
            for (int j = 0; j < n2; j++) {
                if (arr1[i] == arr2[j] && visited[j] == 0) {
                    ans.add(arr1[i]);
                    visited[j] = 1;
                    break;
                }
                if (arr2[j] > arr1[i]) break;
            }
        }

        //Optimal Approach:
        ArrayList<Integer> res = new ArrayList<>();
        int i = 0;
        int j = 0;
        while (i < n1 && j < n2) {
            if (arr1[i] < arr2[j]) {
                i++;
            }
            else if(arr2[j]<arr1[i]){
                    j++;
                }
            else{
                if(!res.contains(arr1[i])) {
                    res.add(arr1[i]);
                    i++;
                    j++;
                }
            }
        }

    for(int k=0;k<res.size();k++)
    {
        System.out.print(res.get(k)+" ");
    }
    }
}
