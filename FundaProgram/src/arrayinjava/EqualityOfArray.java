package arrayinjava;

//import java.lang.reflect.Array;
import java.util.Scanner;

public class EqualityOfArray {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("size of array 1");
		int size=sc.nextInt();
		
		System.out.println("size of array 2");
		int size1=sc.nextInt();
		int arr[] = new int[size];
		
		System.out.println("Enter element of array 1");
		System.out.println();
		
		
		for(int i=0; i<size; i++)
		{
			arr[i]=sc.nextInt();
			//System.out.print(" "+arr[i]);
		}
		System.out.println();
		
		System.out.println("Enter element of array 1");
		int arr1[] = new int[size1];
		for(int i=0; i<size1; i++)
		{
			arr1[i]=sc.nextInt();
			//System.out.println(" "+arr1[i]);
		}
		System.out.println();
		
	int arr3=0;
	if(size==size1)
	{
		for(int j=0;j<size;j++)
		{
			if(arr[j]==arr1[j])
			{
				arr3++;
			}
		}
			if(arr3==size)
			{
				System.out.println("match");
			}
			else
			{
				System.out.println("mis match");
			}
	}
		else
		{
			System.out.println("mis match size");
		}
	}
}


