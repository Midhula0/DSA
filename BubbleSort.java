//Bubblesort
import java.util.*;
public class BubbleSort{
    static void Bubblesort(int[] arr,int n)
    {
        for(int i=0;i<n-1;i++)
        {
            int flag=0;
            int temp=0;
            for(int j=0;j<n-1-i;j++)
            {
                if(arr[j]>arr[j+1])
                {
                    temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                    flag=1;
                }
            }
            if(flag==0)
                break;
        }
    }
    public static void main(String[] args)
    {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter no of values to get: ");
        int n=s.nextInt();
        int[] arr=new int[n];
        System.out.println("Enter values: ");
        for(int i=0;i<n;i++)
        {
             arr[i]=s.nextInt();
        }
        Bubblesort(arr,n);
        System.out.println("Sorted array:");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");}
        }
}