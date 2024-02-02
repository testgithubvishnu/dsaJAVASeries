package SearchingAlgorithm;

// Time Complexity:O(n,log.m)

//n=3,m=4;
//r-row,c-column :  r.m+c => translated indices
// r=(rm+c)/m; row=mid/col
// c=(rm+c)%m  column= mid%row

public class BinarySearchon2DArray {
    static boolean searchMatrix(int[][] matrix,int target)
    {
        int n= matrix.length;;
        int m=matrix[0].length;

        int st=0, end=m*n-1;

        while(st<=end)
        {
            int mid=st+(end-st)/2;
            int midElem=matrix[mid/m][mid%n];

            if(midElem==target) return  true;

            if(target<midElem) {
                end = mid - 1;
            }
            else {
                st=mid+1;
            }

        }
        return  false;
    }
    public static void main(String[] args) {

        int[][] matrix = {{1, 3, 5, 7}, {10, 11, 16, 20}, {23, 30, 34, 60}};
        int target=22;
        if(searchMatrix(matrix,target))
        {
            System.out.println("Element present in the 2D array");
        }
        else {
            System.out.println("Not present");
        }
    }
}
