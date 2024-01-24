package Hashmap;

import java.util.HashMap;
import java.util.Map;

public class FreqElement {
    public static void main(String[] args)
    {
        int[] arr={1,3,2,1,4,1,4,2,4,1,4,4,4,8};
        Map<Integer,Integer> mp= new HashMap<>();
        for(int el:arr)
        {
           if(!mp.containsKey(el))
           {
               mp.put(el,1);
           }
           else {
               mp.put(el,mp.get(el)+1);
           }
        }
        System.out.println(mp.entrySet());

        int maxFreq=0,ansKey=-1;

        for(var e:mp.entrySet())
        {
            if(e.getValue() > maxFreq)
            {
                maxFreq =e.getValue();
                ansKey= e.getKey();
            }
        }
        System.out.printf("%d has maximum frequency:",ansKey);
    }
}
