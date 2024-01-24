package Arrays;

import java.util.Scanner;

public class transposeMatrix {
    static void printMatrix(int[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                System.out.print(matrix[i][j]+" ");
            }
            System.out.println();
        }
    }

    static  void transpose(int[][] arr,int r,int c)
    {
        int[][] ans= new int[c][r];
        for(int i=0;i<c;i++)
        {
            for(int j=0;j<r;j++)
            {
                ans[i][j]=arr[j][i];
            }
        }
        System.out.println("Transpose of Matrix:");
        printMatrix(ans);
    }

   static void transposeInPlace(int[][] arr,int r,int c)
    {
       for (int i=0;i<c;i++)
       {
           for (int j=0;j<r;j++)
           {
               int temp=arr[i][j];
               arr[i][j]=arr[j][i];
               arr[j][i]=temp;
           }
       }
    }

    public static void main(String[] args) {
        //int[][] original={{1,2,3},{4,5,6},{7,8,9}};
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter number of rows and columns:");
        int r=sc.nextInt();
        int c=sc.nextInt();

        int[][]matrix= new int[r][c];

        System.out.println("Enter matrix elemnts:");
        for (int i=0;i<r;i++)
        {
            for(int j=0;j<c;j++)
            {
                matrix[i][j]=sc.nextInt();
            }
        }

        System.out.println("Original Matrix:");
        printMatrix(matrix);

        //Transpose:
        //transpose(original,original.length,original[0].length);


        transposeInPlace(matrix,r,c);
        System.out.println("Transpose of Matrix:");
        printMatrix(matrix);
    }
}
