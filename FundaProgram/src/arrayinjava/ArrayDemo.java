package arrayinjava;

import java.util.Scanner;

public class ArrayDemo {

	public static void main(String[] args) {
		
		int size=5;
		int arr[] = new int[size];
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter "+size+" elements:");
		
		for(int i=0; i<size; i++)
		{
			arr[i]=sc.nextInt();
			//System.out.print(arr[i]+" ");
		}
		for(int i=0; i<size; i++)
		{
			System.out.print(arr[i]+" ");
		}
       
	}

}
