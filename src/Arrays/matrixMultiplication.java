package Arrays;

public class matrixMultiplication {
    static void printMatrix(int[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                System.out.print(matrix[i][j]+" ");
            }
            System.out.println();
        }
    }

    static void multiply(int[][] a, int r1, int c1, int[][] b, int r2, int c2) {
        if (c1 != r2) {
            System.out.println("Multiplication is not possible!");
            return;
        }

        int[][] mul= new int[r1][c2];
        for (int i=0;i<r1;i++)
        {
            for (int j=0;j<c2;j++)
            {
             for(int k=0;k<c1;k++)
             {
                 mul[i][j]+=(a[i][k]*b[k][j]);
             }
            }
        }
        System.out.println("Multiplication of two matrices:");
        printMatrix(mul);
    }


    public static void main(String[] args) {
//        for two matrices to mutilply them:
//        let [c1,r1] and [c2,r2]
//        then it must have:
//        1) c1=r2

//        Resultant matrix will be:
//        [c2,r1]
        //multiply({});
        int[][] matrix1={{1,2,3},{3,2,1},{5,6,1}};
        int[][] matrix2={{2,1,7},{5,3,8},{2,4,3}};

        System.out.println("Matrix 1:");
        printMatrix(matrix1);

        System.out.println("Matrix 2:");
        printMatrix(matrix2);

        multiply(matrix1,matrix1.length,matrix1[0].length,
                matrix2,matrix2.length,matrix2[0].length);

    }
}
