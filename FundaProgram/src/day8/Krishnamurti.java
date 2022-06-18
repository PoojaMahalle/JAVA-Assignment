package day8;

import java.util.Scanner;

public class Krishnamurti {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter any number");
		
		int num=sc.nextInt();
		int temp,rem,sum=0,fact=1;
		
		temp=num; //145
		
		while(temp != 0) 
		{
			rem = temp%10; //5 //4
			fact = 1;
			for(int i = 1; i <= rem; i++)
			{
				fact = fact*i; //1*1=1 1*2=2 2*3=6 6*4=24 24*5=120
			}
			sum = sum + fact; //0+120=120 //120+24=144 //144+1=145
			temp = temp / 10;  //14/10 //1/10
		}
		if(sum == num)
		{
			System.out.println("Number is krishnamurty");
		}
		else
		{
			System.out.println("Number is not krishnamurty");
		}

	}

}
