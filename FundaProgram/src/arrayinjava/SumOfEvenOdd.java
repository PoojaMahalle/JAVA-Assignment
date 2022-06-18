package arrayinjava;

import java.util.Scanner;

public class SumOfEvenOdd {

	public static void main(String[] args) {
		int size; 
		int sum=0,sum1=0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Elements of array are: ");
		size=sc.nextInt();
		int arr[] = new int[size];
		System.out.println("Enter "+size+" element");
		for(int i=0; i<size; i++)
		{
			arr[i] = sc.nextInt();
		}
		for(int i=0; i<size; i++)
		{
			if(arr[i]%2==0)
			{
				sum = sum + arr[i];
				
			}
			else
			{
				sum1 = sum1 + arr[i];
				
			}
		}
		System.out.println("sum of even numbers: "+sum);	
		System.out.println("sum of odd numbers: "+sum1);
	}

}
