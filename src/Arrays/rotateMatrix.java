package Arrays;

public class rotateMatrix {

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

        System.out.println("Rotated Matrix by 90 Degrees:");
        printMatrix(RotateMatrix(original,4));
    }
}
