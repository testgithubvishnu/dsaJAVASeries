package BitManipulation;
import java.util.*;
public class XORofGivenRange {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n= sc.nextInt();

        // Bruit-Force Approach:
        int ans=0;
        for(int i=1;i<=n;i++)
        {
            ans^=i;
        }
        System.out.println(ans);

        //Optimal Approach:

    }
}
