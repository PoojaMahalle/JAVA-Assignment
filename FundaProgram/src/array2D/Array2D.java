package array2D;

import java.util.Scanner;

public class Array2D {
	
	void displayArray(int a[][],int r,int c)//a=arr
	{
		System.out.println("Element of array are: ");
		for(int i=0; i<r; i++)
		{
			for(int j=0; j<c; j++)
			{
				System.out.print(a[i][j]+" ");
			}
			System.out.println();
		}
	}
	
	void addElements(int a[][],int r,int c)
	{
		int sum=0;
		
		for(int i=0; i<r; i++)
		{
			for(int j=0; j<c; j++)
			{
				sum=sum+a[i][j];
			}
		}
		System.out.println("Addition of element: "+sum);
	}
	
	void multiElements(int a[][],int r,int c)
	{
		int multi=1;
		
		for(int i=0; i<r; i++)
		{
			for(int j=0; j<c; j++)
			{
				multi=multi*a[i][j];
			}
		}
		System.out.println("Multiplication of element: "+multi);
	}
	
	void addRow(int a[][],int r,int c)
	{
		int sum=0;
		//System.out.println("Addition of rows element: "+sum);
		for(int i=0; i<r; i++)
		{
			for(int j=0; j<c; j++)
			{
				sum=sum+a[i][j];
			}
			System.out.println("Addition of "+(i+1)+" row is= "+sum);
		}
	}

	public static void main(String[] args) {
		int r,c;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the row and col: ");
		r=sc.nextInt();
		c=sc.nextInt();
		
		int arr[][]= new int[r][c];
		
		System.out.println("Enter "+(r*c)+" element: ");
		for(int i=0; i<r; i++)
		{
			for(int j=0; j<c; j++)
			{
				arr[i][j]=sc.nextInt();
			}
		}
				
        Array2D a1 = new Array2D();
        a1.displayArray(arr,r,c);
        a1.addElements(arr, r, c);
        a1.multiElements(arr, r, c);
        a1.addRow(arr, r, c);
	}

}
