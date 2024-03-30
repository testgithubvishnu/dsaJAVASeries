package PrintPatterns;

public class pattern1 {
    public static void main(String[] args) {
        int i,j;

        // Pattern 1:
        for( i=0;i<4;i++)
        {
            for( j=0;j<4;j++)
            {
                if(i<=j) {
                    System.out.print("* ");
                }
            }
            System.out.println();
        }

        // Pattern 2:

        for( i=0;i<4;i++)
        {
            for( j=0;j<4;j++)
            {
                if(j<=i) {
                    System.out.print("* ");
                }
            }
            System.out.println();
        }

        // Pattern 4:


        for( i=1;i<=4;i++)
        {
            for( j=1;j<=4;j++)
            {
                if(j<=i) {
                    System.out.print(j+" ");
                }
            }

            System.out.println();
        }


        // Pattern 3:

        int k=1;
        for( i=0;i<4;i++)
        {
            for( j=0;j<4;j++)
            {
                if(j<=i) {
                    System.out.print(k+" ");
                }
            }
            k++;
            System.out.println();
        }

        // Pattern 5:


        for( i=1;i<=4;i++)
        {
            for( j=1;j<=4-i+1;j++)
            {

                    System.out.print(j+" ");

            }
            System.out.println();
        }



    }
}
