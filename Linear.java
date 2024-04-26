import java.util.*;
public class Linear

{
	static void linear(int[] arr,int n,int data)
	{
		for(int i=0;i<n;i++)
		{
			if(arr[i]==data)
			{
				System.out.println("The given data is found in the array at: "+i);
				return;
			}
		}
		
			System.out.println("The given data is not found in the array");
		
	}
	public static void main(String[] args)
	{
		
	
		Scanner s=new Scanner(System.in);
		System.out.println("Enter number values to get: ");
		int n=s.nextInt();
		int[] arr=new int[n];
		System.out.println("Enter the values: ");
		for(int i=0;i<n;i++)
		{
		    arr[i]=s.nextInt();
		}
		System.out.println("Enter the data to find in array: ");
		int data=s.nextInt();
		linear(arr,n,data);
	}
			
}
