package TwoPointerApproach;

import java.lang.reflect.Array;
import java.net.Inet4Address;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;

public class ThreeSumProblem {
    public static void main(String[] args) {
//        int[] arr={-1,0,1,2,-1,-4};
//        int n= arr.length;

        // Bruit-Force Approach:
//        HashSet<ArrayList<Integer>> ans= new HashSet<>();
//
//        for(int i=0;i<=n-1;i++)
//        {
//            for(int j=i+1;j<=n-1;j++)
//            {
//                for(int k=j+1;k<=n-1;k++)
//                {
//
//                    if((arr[i]+arr[j]+arr[k])==0)
//                    {
//                        ArrayList<Integer> al= new ArrayList<>();
//                        al.add(arr[i]);
//                        al.add(arr[j]);
//                        al.add(arr[k]);
//
//                        if(!ans.contains(al))
//                            ans.add(al);
//
//                    }
//                }
//            }

//        for(ArrayList<Integer> temp:ans)
//        {
//            System.out.println(temp);
//        }

            //Optimal Approach 1:
//            HashMap<Integer, Integer> hm= new HashMap<>();
//            for(int i=0;i<n;i++)
//            {
//                if(!hm.containsKey(arr[i]))
//                {
//                    hm.put(arr[i],1);
//                }
//                else{
//                    hm.put(arr[i],hm.get(arr[i])+1);
//                }
//            }
//           for(var e:hm.entrySet())
//           {
//               System.out.print("("+e.getKey()+":"+e.getValue()+"),");
//           }
//
//          for(int i=0;i<n;i++)
//          {
//              for(int j=i+1;j<n;j++)
//              {
//                  if(hm.containsKey(-(arr[i]+arr[j])))
//                  {
//
//                  }
//              }
//          }

          // Optimal Appraoch: Using Two Pointer
        // We will Sort array first
          int[] arr ={-2,-2,-1,-1,-1,0,0,0,2,2,2};

        }

    }

