package Arrays;

import java.util.ArrayList;

public class RearrangeArray {
    public static void main(String[] args) {
        int[] arr={3,1,-2,-5,2,-4};
        int n= arr.length;

//        int[] pos= new int[n/2];
//        int[] neg= new int[n/2];
//        int k=0;
//        int l=0;

// Case 1: if number of positive nad negative numbers are same:
        // Bruit-froce Approach:
//        for(int i=0;i<n;i++)
//        {
//            if(arr[i]>=0)
//            {
//                pos[k++]=arr[i];
//            }
//            else{
//                neg[l++]=arr[i];
//            }
//        }
//       for(int i=0;i<n/2;i++)
//       {
//           arr[2*i]=pos[i];
//           arr[2*i+1]=neg[i];
//
//       }

       //  Approach 1:
//        int[] ans= new int[n];
//        int posIndex=0,negIndex=1;
//         for(int i=0;i<n;i++)
//         {
//             if(arr[i]>0)
//             {
//                 ans[posIndex]=arr[i];
//                 posIndex+=2;
//             }
//             else{
//                 ans[negIndex]=arr[i];
//                 negIndex+=2;
//             }
//         }

// Case 2: If number of positive and negative numbers are different:
        ArrayList<Integer> posArr= new ArrayList<>();
         ArrayList<Integer> negArr= new ArrayList<>();

         for(int i=0;i<n;i++)
         {
             if(arr[i]>0)
             {
                posArr.add(arr[i]);
             }
             else{
                 negArr.add(arr[i]);
             }
         }

         if(posArr.size()>negArr.size()) {
             for (int i = 0; i < negArr.size(); i++) {
                 arr[2 * i] = posArr.get(i);
                 arr[2*i+1] = negArr.get(i);
             }
             int index=negArr.size()*2;
             for(int i=negArr.size();i<posArr.size();i++)
             {
                 arr[index]=posArr.get(i);
             }
         }
         else{
             for (int i = 0; i < negArr.size(); i++) {
                 arr[2 * i] = posArr.get(i);
                 arr[2*i+1] = negArr.get(i);
             }
             int index=posArr.size()*2;
             for(int i=posArr.size();i<negArr.size();i++)
             {
                 arr[index]=negArr.get(i);
             }
         }

        for(int i=0;i<n;i++)
        {
            System.out.print(arr[i]+" ");
        }

    }
}
