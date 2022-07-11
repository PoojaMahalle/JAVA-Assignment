package exception;

import java.util.InputMismatchException;
import java.util.Scanner;

public class NestedTryCatch {
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
	static void stringElement(String s,int i)
	{
		System.out.println(s.charAt(i));
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
	     int arr[]= {10,20,30,50,60,70};
	     System.out.println("Enter 2 number: ");
	     int a=sc.nextInt();
         int b=sc.nextInt();
	     //nested try catch
	     try
	     {
	    	  try
	    	  {
	    		  try
	    		  {
	    		  arrayElement(arr,6);
	    		  }
	    		  catch(ArrayIndexOutOfBoundsException e)
	    		  {
	    			  System.out.println(e);
	    		  }
		    	  stringElement("India",6); 
	    	  }
	    	  catch(StringIndexOutOfBoundsException e)
	    	  {
	    		  System.out.println(e);
	    	  }
	    	  div(a,b);	
	     }
	     catch(ArithmeticException e)
	     {
	    	 System.out.println(e);
	    	 //e.printStackTrace();//System.err printed
	     }
	     add(a,b);
	     System.out.println("Done with the operation");
         
	}

}
