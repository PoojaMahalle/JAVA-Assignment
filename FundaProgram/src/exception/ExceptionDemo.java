package exception;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ExceptionDemo {
	
	static void add(int a,int b)
	{
		System.out.println("Addition is: "+(a+b));
	}
	static void div(int a,int b)
	{
		System.out.println("Division in process");
		System.out.println("Division is: "+(a/b));
	}

	static void arrayElement(int arr[],int i)
	{
		System.out.println("element at the index is: "+arr[i]);
	}
	public static void main(String[] args) {

     Scanner sc = new Scanner(System.in);
     int arr[]= {10,20,30,50,60,70};
     System.out.println("Enter 2 number: ");
     int a=0;
     int b=0;
     
     try
     {
    	  a=sc.nextInt();
          b=sc.nextInt();
    	  div(a,b);
    	
     }
     catch(ArithmeticException e)
     {
    	// System.out.println(e);
    	 e.printStackTrace();
     }
     catch(ArrayIndexOutOfBoundsException e)
     {
    	 System.out.println(e);
     }
     catch(InputMismatchException e)
     {
    	 System.out.println(e);
     }
     catch(Exception e)
     {
    	 System.out.println(e);
     }
     finally
     {
    	 System.out.println("Finally block always executed");
    	 sc.close();
     }
     add(a,b);
     arrayElement(arr,3);
     
     System.out.println("Done with the operation");
	}

}
