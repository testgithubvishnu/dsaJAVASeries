package Arrays;
import java.util.*;
public class intersectionOfSortedArrays {
    public static void main(String[] args) {

    int[] arr1= {2,2,3,4,5,5};
    int[] arr2={1,3,4,4,5,6};

    ArrayList<Integer> ans= new ArrayList<>();
    int n1= arr1.length;
    int n2= arr2.length;

    int[] visited=new int[n2];
    for(int i=0;i<n1;i++)
    {
        for(int j=0;j<n2;j++)
        {
            if(arr1[i]==arr2[j] && visited[j]==0){
                ans.add(arr1[i]);
                visited[j]=1;
                break;
            }
            if(arr2[j]>arr1[i]) break;
        }
    }

    for(int i=0;i<ans.size();i++)
    {
        System.out.print(ans.get(i)+" ");
    }
    }
}
