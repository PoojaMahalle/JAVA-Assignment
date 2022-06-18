
package arrayinjava;

import java.util.Scanner;

public class TransMatrix {

	void displayArray(int arr[][],int r,int c)//a=arr
	{
		System.out.println("Element of array are: ");
		for(int i=0; i<r; i++)
		{
			for(int j=0; j<c; j++)
			{
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		}
	}
	
//	void matrix(int arr[][],int r,int c)
//	{
//		System.out.println("Matrix");
//		int arr1[][]= new int[c][r];
//		for(int i=0; i<r; i++)
//		{
//			for(int j=0; j<c; j++)
//			{
//				System.out.print(arr[i][j]+" ");
//			}
//			System.out.println();
//		}
//	}
	
	void transpose(int arr1[][],int r,int c)
	{
		System.out.println("Transpose");
		int arr[][]= new int[r][c];
		for(int i=0; i<c; i++)
		{
			for(int j=0; j<r; j++)
			{
				arr1[i][j]=arr[j][i];
				System.out.print(arr1[i][j]+" ");
			}
			System.out.println();
		}
	}
	
	public static void main(String[] args) {
		int r,c;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the row and col: ");
		r=sc.nextInt();
		c=sc.nextInt();
		
		//int arr[][]= new int[r][c];
		int arr1[][]= new int[c][r];
		
		System.out.println("Enter "+(r*c)+" element: ");
		for(int i=0; i<r; i++)
		{
			for(int j=0; j<c; j++)
			{
				arr1[i][j]=sc.nextInt();
				System.out.println(" ");
				
			}
		}
		
		TransMatrix t1 = new TransMatrix();
		t1.displayArray(arr1, r, c);
		//t1.matrix(arr, r, c);
		t1.transpose(arr1, r, c);
		
		
	}

}
