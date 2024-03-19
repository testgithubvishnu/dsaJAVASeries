package Arrays;

public class setMatrixZero {
    public static void main(String[] args) {
        int[][] matrix= {{1,1,1,1},{1,0,0,1},{1,1,0,1},{1,1,1,1}};

        int row= matrix.length;
        int col=matrix[0].length;

        int[] r=new int[row];
        int[] c= new int[col];

        for(int i=0;i<row;i++)
        {
            for(int j=0;j<col;j++)
            {
                if(matrix[i][j]==0)
                {
                    r[i]=0;
                    c[j]=0;
                }
            }
        }

    }
}
