package Arrays;

public class elementAppearsOnes {
    public static void main(String[] args) {
        int[] arr={1,1,2,3,3,4,4};

        //Bruit-force Approach:

        for(int i=0;i< arr.length;i++)
        {
            int count=0;
            for(int j=0;j< arr.length;j++)
            {
                if(arr[i]==arr[j])
                {
                    count++;
                }
            }
            if(count==1){
                System.out.println(arr[i]);
            }
        }

        //Optimal Approach:
        // if we have to find element which appears once and other twice:
      int xor=0;
        for(int i=0;i< arr.length;i++)
      {
          xor^=arr[i];
      }
        System.out.println(xor);
    }
}
