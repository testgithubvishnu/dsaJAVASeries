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
        while(itr.hasNext())
        {
            System.out.println(itr.next());
        }
    }

}
