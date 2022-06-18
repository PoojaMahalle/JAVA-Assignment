package arrayinjava;

import java.util.Arrays;
import java.util.Scanner;

public class ArraySorting {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter size of array: ");
		int size=sc.nextInt();
		System.out.println("Enter "+size+" element");
		int arr[]=new int [size];
		
		for(int i=0; i<size; i++)
		{
			arr[i]=sc.nextInt();
			
		}
		for(int i=0; i<size; i++)
		{
			for(int j=i+1; j<size;j++)
			{
				if(arr[i]<arr[j])
				{
					int temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
			}
		}

	
		for(int i=0; i<size; i++)//buble sort
		{
			for(int j=0; j<size-1; j++)
			{
			if(arr[j]>arr[j+1])
			{
				int temp=arr[j];
				arr[j]=arr[j+1];
				arr[j+1]=temp;
			}
			}
		}
		System.out.println("Bubble sort: "+Arrays.toString(arr));
		System.out.println("Second heighest: "+arr[size-2]);
		System.out.println("Second minimum: "+arr[1]);
		
		int ar[]= {50,10,30,80,90,20,40,70};
		Arrays.sort(ar);
		System.out.println(Arrays.toString(ar));
	}

}
