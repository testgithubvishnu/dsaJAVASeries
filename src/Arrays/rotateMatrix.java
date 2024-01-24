package Arrays;

public class rotateMatrix {
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

        printMatrix(ans);
    }
    public static void main(String[] args) {
        int[][] original={{1,2,3},{4,5,6},{7,8,9}};
    }
}
