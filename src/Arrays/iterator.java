package Arrays;

import java.util.*;
public class iterator {
    public static void main(String[] args) {
        ArrayList<Integer> arr= new ArrayList<>();
        arr.add(23);
        arr.add(53);
        arr.add(89);
        arr.add(49);

        Iterator<Integer> itr= arr.iterator();

        // Print the elements:
        while(itr.hasNext())
        {
            System.out.println(itr.next());
        }
        System.out.println();

        // delete the items:
        while(itr.hasNext())
        {
            int a= itr.next();
            if(a<30)
            {
                itr.remove();
            }
        }
        System.out.println(arr);
    }

}
