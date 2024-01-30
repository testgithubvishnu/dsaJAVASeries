package SortingAlgorithms;


// Based on Divide and Conquer Approach:
public class MergeSort {
    static void mergeSort(int[] arr,int l,int r)
    {

          if(l>=r) return;

         int mid=(l+r)/2;
          mergeSort(arr,l,mid);
          mergeSort(arr,mid+1,r);
          merge(arr,l,mid,r);
    }

    static void merge(int[] arr,int l,int mid,int r)
    {
        int n1=mid-l+1;
        int n2=r-mid;
        int[] left=new int[n1];
        int[] right=new int[n2];
        int i,j,k;

        for( i=0;i<n1;i++) left[i]=arr[l+i];
        for( j=0;j<n2;j++) right[j]=arr[mid+1+j];

        i=0;
        j=0;
        k=l;

        while(i<n1 && j<n2)
        {
            if(left[i]<right[j])
            {
                arr[k++]=left[i++];
            }
            else {
                arr[k++]=right[j++];
            }
        }

        while(i<n1) arr[k++]=left[i++];
        while(j<n2) arr[k++]=right[j++];


    }
    public static void  printArray(int[] arr)
    {
        for(int i:arr)
        {
            System.out.print(i+" ");
        }
    }
    public static void main(String[] args) {
        int[] arr={23,56,44,39,11,98,77,63};

        System.out.println("Array Before sorting:");
        printArray(arr);  // 23,56,44,39,11,98,73,63

        int n=arr.length;
        mergeSort(arr,0,n-1);

        System.out.println();
        System.out.println();

        System.out.println("Array After Sorting:");
        printArray(arr); //  11,23,39,44,56,63,73,98
    }
}
