package Hashmap;

import java.util.HashMap;
import java.util.Map;

public class HashMapMethod {
    public static  void main(String[] args)
    {
        HashMap<String ,Integer> map=new HashMap<>();
        //Insert
        map.put("Aakash",21);
        map.put("Amar",23);
        map.put("Ankit",32);
        map.put("naksh",81);
        map.put("Aman",63);
        map.put("Anisha",44);

//        System.out.println(map.get("Aman"));

//        Update
//        map.put("Amar",22);
//        System.out.println(map.get("Amar"));

//        Remove
//        map.remove("Aman");
//
//        Contains:Boolean
//        System.out.println(map.containsKey("Amar"));
//
//        Absent
//        map.putIfAbsent("Avanti",21);

//        System.out.println(map.keySet());
//        System.out.println(map.values());
//        System.out.println(map.entrySet());

//       Traversing all entries of map
        //Method1:
//        for (String key:map.keySet())
//        {
//            System.out.printf("Age of %s is %d\n",key,map.get(key));
//        }

        //Method2:
//        for(Map.Entry<String,Integer> e:map.entrySet())
//        {
//            System.out.printf("Age of %s is %d\n",e.getKey(),e.getValue());
//        }

        //Method3:
        for(var e:map.entrySet())
        {
            System.out.printf("Age of %s is %d\n",e.getKey(),e.getValue());
        }
    }
}
