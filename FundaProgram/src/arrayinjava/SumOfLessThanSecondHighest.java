package arrayinjava;

import java.util.Scanner;

class SumOfLessThanSecondHighest{
public static int SecondHighest(int...a) 
{
	int high1=0,high2=0;
	for(int i=0; i<a.length; i++)
	{
		for(int j=i+1; j<a.length; j++)
		{
			if(a[i]<a[j])
			{
				int temp=a[i];
				a[i]=a[j];
				a[j]=temp;
			}
		}
//		System.out.println(a[i]+" ");
	}
	System.out.println();
	high1=a[0];
	high2=a[1];
//	System.out.println(high1+" "+high2);
	return high2;
}

	public static void main(String[] args) {
		int a[]= new int[10];
		Scanner sc = new Scanner(System.in);
		int sum=0;
		System.out.println("Array");
		for(int i=0; i<a.length; i++)
		{
			a[i]=sc.nextInt();
		}
		
		SumOfLessThanSecondHighest.SecondHighest(a);
		for(int i=0; i<a.length; i++)
		{
			if(a[i]!=a[0] && a[i]!=a[1])
			{
				sum=sum+a[i];
			}
		}
		System.out.println(sum);
	}

}
