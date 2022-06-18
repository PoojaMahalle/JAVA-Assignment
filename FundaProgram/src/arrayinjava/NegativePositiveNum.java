package arrayinjava;

import java.util.Arrays;
import java.util.Scanner;

public class NegativePositiveNum {

	public static void main(String[] args) {
		int arr[]= {-4,8,-7,5,-6,3,-2,10,-12};
//		Scanner sc = new Scanner(System.in);
//		System.out.println("Enter any number");

		
		for(int i=0; i< arr.length; i++)
		{
			for(int j=0; j<arr.length; j++)
			{
				if(arr[i]<arr[j])
				{
					int temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
				
			}
		}
		System.out.print(Arrays.toString(arr));

	}

}
