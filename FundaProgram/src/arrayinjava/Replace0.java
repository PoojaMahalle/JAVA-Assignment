package arrayinjava;

import java.util.Scanner;

public class Replace0 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter size of array:");
		int size=sc.nextInt();
		System.out.println("Enter "+size+" element");
		int arr[] = new int[size];
		
		for(int i=0; i<size; i++)
		{
			arr[i]=sc.nextInt();
		}
		System.out.println();
		for(int i=0; i<size; i++)
		{
			if(arr[i]==0)
			{
				arr[i]=1;
			}
			
			System.out.print(arr[i]+" ");
		}

	}

}
