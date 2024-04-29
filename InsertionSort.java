//insertion sort
import java.util.*;
public class InsertionSort{
    static void Insertionsort(int[] arr,int n)
    {
        int temp=0;
        for(int i=1;i<n;i++)
        {
            temp=arr[i];
            int j=i-1;
            while(j>=0 && arr[j]>temp)
            {
                arr[j+1]=arr[j];
                j--;
            }
            arr[j+1]=temp;
        }
    }
    public static void main(String[] args)
    {
        Scanner s=new Scanner(System.in);
        System.out.println("ENter the no of values to be get: ");
        int n=s.nextInt();
        int[] arr=new int[n];
        System.out.println("Enter the array: ");
        for(int i=0;i<n;i++)
        {
            arr[i]=s.nextInt();
        }
        Insertionsort(arr,n);
        System.out.println("Sorted array: ");
        for(int i=0;i<n;i++)
        {
            System.out.println(arr[i]+" ");
        }    
    }
}