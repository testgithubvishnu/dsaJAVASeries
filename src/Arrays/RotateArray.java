package Arrays;

public class RotateArray {
    public static void main(String[] args) {
int[] arr={2,4,7,1,9,8,3,5};
int k=3;
int n=8;
k=k%10;
int j=0;
int[] ans= new int[8];

for(int i=n-k;i<n;i++)
{
    ans[j++]=arr[i];
}
for(int i=0;i<n-k;i++)
{
    ans[j++]=arr[i];
}
for(int m=0;m<n;m++)
{
    System.out.print(ans[m]+" ");
}
    }
}
