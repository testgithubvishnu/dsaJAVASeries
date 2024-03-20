package Arrays;

public class setMatrixZero {
    public static void main(String[] args) {
        int[][] matrix= {{1,1,1,1},{1,0,0,1},{1,1,0,1},{1,1,1,1}};

        int row= matrix.length;
        int col=matrix[0].length;


        //Approach 1:
        int[] r=new int[row];
        int[] c= new int[col];

        for(int i=0;i<row;i++)
        {
            for(int j=0;j<col;j++)
            {
                if(matrix[i][j]==0)
                {
                    r[i]=1;
                    c[j]=1;
                }
            }
        }
        for(int i=0;i<row;i++)
        {
            for(int j=0;j<col;j++)
            {
               if(r[i]==1 || c[j]==1)
               {
                   matrix[i][j]=0;
               }
            }
        }
// Space Complexity: m+n
// Time Complexity: (m*n)*(m+n)

        for(int i=0;i<row;i++)
        {
            for(int j=0;j<col;j++)
            {
                System.out.print(matrix[i][j]+" ");
            }
            System.out.println();
        }

    }
}
