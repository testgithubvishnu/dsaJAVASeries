package ArrayList;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class reverseArrayList {
    static void ReverseArraylist(ArrayList<Integer> al)
    {
        int i=0,j=al.size()-1;

        while(i<j)
        {
            Integer temp=Integer.valueOf(al.get(i));
            al.set(i,al.get(j));
            al.set(j,temp);
            i++;
            j--;
        }
    }
    static void printArrayList(ArrayList<Integer> al)
    {
        for(int i=0;i<al.size();i++)
        {
            System.out.print(al.get(i)+" ");
        }
    }
    public static void main(String[] args) {
        ArrayList<Integer> al= new ArrayList<>();
        al.add(12);
        al.add(43);
        al.add(38);
        al.add(51);
        al.add(67);
        al.add(73);
        al.add(88);

        printArrayList(al);
        ReverseArraylist(al);

        System.out.println();
        printArrayList(al);

    }
}
