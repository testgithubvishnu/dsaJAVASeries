package Arrays;

public class missingNumber {
    public static void main(String[] args) {
        int[] arr={1,2,4,5,6};
// Using XOR operation:
        // a^a=0
        // a^0=a
        
        int xor1=0;
        int xor2=0;

        for(int i=0;i<arr.length-1;i++)
        {
            xor2^=arr[i];
            xor1^=(i+1);
        }
        xor1^= arr.length;
        System.out.println(xor1^xor2);
    }
}
