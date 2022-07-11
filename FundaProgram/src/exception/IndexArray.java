package exception;

import java.util.Arrays;
import java.util.Scanner;

public class IndexArray {

	public static void main(String[] args) {
		 Scanner sc = new Scanner(System.in);
	     System.out.println("Enter array length: ");
		 int size=sc.nextInt();
//		 System.out.println("Enter "+size+" element");
//		 int arr[]=new int[size];
		 int arr[]= {10,20,30,40,50};
		 
		 try
		 {
			 System.out.println(arr[size]);
		 }
		 catch(ArrayIndexOutOfBoundsException a)
		 {
			//System.out.println(a);
			 a.printStackTrace();
			 
		 }
		 System.out.println(Arrays.toString(arr));

	}

}
