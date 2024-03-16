package Arrays;

public class subArraySum {
    public static void main(String[] args) {
        int[] arr={1,2,3,1,1,1,4,2};
        int longest=0;
        int A=3;

        //Bruit-Force Approach:
         for(int i=0;i< arr.length;i++)
         {
             int sum=0;
             for(int j=i;j< arr.length;j++)
              {
                    sum += arr[j];
                    if (sum == A)
                    {
                        longest = Math.max(longest, j - i + 1);
                    }
                  System.out.println("hii");
              }
         }

         //Optimal Approach:


        System.out.println(longest);
    }
}
