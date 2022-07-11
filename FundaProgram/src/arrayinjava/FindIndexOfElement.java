package arrayinjava;

import java.util.Scanner;

public class FindIndexOfElement {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter any number:");
		int a=sc.nextInt();
		int arr[]= {1,2,3,4,5,6,7,8,9};
		
		for(int i=0; i<arr.length; i++)
		{
			if(arr[i]==a)
			{
				System.out.println(i);
			}
		}

	}

}
