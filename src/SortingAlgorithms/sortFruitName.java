package SortingAlgorithms;

public class sortFruitName {
    static void sortFruits(String[] fruits)
    {
        int n=fruits.length;
        for(int i=0;i<n-1;i++)
        {
            int min_index=i;
            for(int j=i+1;j<n;j++)
            {
                if(fruits[j].compareTo(fruits[min_index])<0)
                {
                    min_index=j;
                }
            }
            String temp=fruits[i];
            fruits[i]=fruits[min_index];
            fruits[min_index]=temp;
        }
    }
    static void printFruitName(String[] arr)
    {
        for(String st:arr)
        {
            System.out.print(st+" ");
        }
    }
    public static void main(String[] args) {
        String[] fruits={"kiwi","apple","papaya","mango"};
        printFruitName(fruits);

        System.out.println();
        sortFruits(fruits);
        printFruitName(fruits);
    }
}
