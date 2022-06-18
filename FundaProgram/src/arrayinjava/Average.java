package arrayinjava;

import java.util.Arrays;
import java.util.Scanner;

public class Average {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter size of array:");
		int size=sc.nextInt();
		System.out.println("Enter "+size+" element");
		float arr[] = new float[size];
		float n = 0;
		
		for(int i=0; i<size; i++)
		{
			arr[i]=sc.nextFloat();
			n = n+arr[i];
		}
		System.out.println();
		float total=n/size;
		System.out.println(total);

	}

}
