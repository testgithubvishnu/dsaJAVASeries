package SearchingAlgorithm;

// find 14: flow to find
//        1,  4   7   11<-15
//                     |
//        2,  5 , 8,  12 ,19,
//                     |
//        3,  6,  9 <-16 ,22,
 //               |
//        10, 13, 14 ,17, 24,

//        18, 21, 23, 26, 30
public class searchMatrix {
    static boolean SearchMatrix(int[][] matrix,int target)
    {
        int n= matrix.length,m=matrix[0].length;
        int i=0,j=m-1;

        while(i<n && j>=0)
        {
            if(matrix[i][j]==target) return  true;

            if(target<matrix[i][j]) j--;
            else i++;
        }

        return  false;
    }

    public static void main(String[] args) {
        int[][] matrix={{1,4,7,11,15},{2,5,8,12,19}, {3,6,9,16,22},{10,13,14,17,24},{18,21,23,26,30}};
        int target=5;
        if(SearchMatrix(matrix,target))
        {
            System.out.println("Element is present in array");
        }
        else {
            System.out.println("Element is not present");
        }
    }
}
