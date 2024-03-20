package Arrays;

import java.util.Scanner;

public class pascalsTriangle {
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

        //Print element of given row and column numbe:
        System.out.println("Enter row and column of number:");
        int n=sc.nextInt();
        int r=sc.nextInt();
        System.out.println(NcR(n-1,r-1));

        // Print nth row of Pascal's Triangle:
        System.out.println("Enter the row number:");
        int row=sc.nextInt();

        for(int c=1;c<=n;c++)
        {
            System.out.print(NcR(row-1,c-1)+" ");
        }
    }
}
