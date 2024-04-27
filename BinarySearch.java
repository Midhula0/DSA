//Binary Search
import java.util.*;
import java.util.Arrays;
public class Main{
    static void BinarySearch(int[] a,int n,int key)
    {
        int l=0;
        int r=n-1;
        while(l<=r)
        {
            int mid=(l+r)/2;
            if(key==a[mid])
            {
                System.out.println("Element found at: "+mid);
                return;
            }
            else if(key<a[mid])
            {
                r=mid-1;
            }
            else
            {
                l=mid+1;
            }
        }
        System.out.println("Element not present");
    }
    public static void main(String[] args)
    {
        Scanner s= new Scanner(System.in);
        System.out.println("Enter the number of values to get: ");
        int n=s.nextInt();
        int[] a=new int[n];
        System.out.println("Enter the values: ");
        for(int i=0;i<n;i++)
        {
            a[i]=s.nextInt();}
        Arrays.sort(a);
        System.out.println("Sorted array:  ");
        for (int num : a) {
            System.out.print(num + " ");
        }
        System.out.println("\nEnter key value to be searched: ");
        int key=s.nextInt();
        BinarySearch(a,n,key);
    }
}
