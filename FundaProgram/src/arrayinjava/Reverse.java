package arrayinjava;

import java.util.Arrays;
import java.util.Scanner;

public class Reverse {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter size of array:");
		int a=sc.nextInt();
		System.out.println("Enter "+a+" element");
		int arr[] = new int[a];
		//int a=arr.length;   60 50 40 30 20 10
		for(int i=0; i<a; i++) 
		{
		  arr[i]=sc.nextInt();
		}
		
		for(int i=0;i<a/2;i++)
		{
			int temp=arr[i];//temp=a[2]=30
			arr[i]=arr[a-i-1];//a[2]=a[6-2-1]=a[3]
			arr[a-i-1]=temp;//a[3]=temp=30
		}
		System.out.println("Reverse of array is: ");
		System.out.println(Arrays.toString(arr));

		}


}


