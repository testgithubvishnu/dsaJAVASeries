package Arrays;
import java.util.*;

public class rotateMatrix {
    static void swap(int a,int b) {
        int temp = a;
        a = b;
        b = temp;
    }

    //Optimal Approach: In-Placed Algorithm
    static void transpose(int[][] matrix)
    {
        int n=matrix.length;
        for(int i=0;i<n-1;i++)
        {
            for(int j=i+1;j<n;j++)
            {
                  swap(matrix[i][j],matrix[j][i]);
                }
            }
        }

    static void reverse(int[][] matrix)
    {
   int n= matrix.length;;
   for(int i=0;i<n;i++)
   {
       int[] arr=matrix[i];
       int s=0,e=arr.length-1;
       while(s<e)
       {
           int temp=arr[s];
           arr[s]=arr[e];
           arr[e]=temp;
           s++;
           e--;
       }
       //reverse(matrix[0].begin(),);
   }
    }

    //====================================================================
    // Bruit-Force Approach:
    static int[][] RotateMatrix(int[][] matrix,int n)
    {
        int[][] ans= new int[n][n];
      for(int i=0;i<n;i++)
      {
          for(int j=0;j<n;j++)
          {
              ans[j][n-1-i]=matrix[i][j];
          }
      }
      return ans;
    }


    static void printMatrix(int[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                System.out.print(matrix[i][j]+" ");
            }
            System.out.println();
        }
    }


    public static void main(String[] args) {

        int[][] original={{1,2,3,4},{5,6,7,8},{9,10,11,12},{13,14,15,16}};
        System.out.println("Original Matrix:");
        printMatrix(original);

        // Bruit-force Approach:
//        System.out.println("Rotated Matrix by 90 Degrees:");
//        printMatrix(RotateMatrix(original,4));

        //Optimal Approach:
        System.out.println("Rotated Matrix by 90 Degrees:");
        transpose(original);
        reverse(original);
        printMatrix(original);
    }
}
