package Arrays;

import java.util.ArrayList;
import java.util.Scanner;

public class pascalTriangle {
    static int NcR(int n,int r)
    {
        int res=1;
        for(int i=0;i<r;i++)
        {
            res=res*(n-i);
            res=res/(i+1);
        }
        return res;
    }
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the number of rows:");
        int n= sc.nextInt();

        ArrayList<ArrayList<Integer>> ans= new ArrayList<>();
        for(int i=1;i<=n;i++)
        {
            ArrayList<Integer> arr= new ArrayList<>();
            for(int j=1;j<=i;j++)
            {
                arr.add(NcR(i-1,j-1));
            }

            ans.add(arr);
        }

      for(int i=0;i<ans.size();i++){
          System.out.println(ans.get(i));
      }

    }
}
