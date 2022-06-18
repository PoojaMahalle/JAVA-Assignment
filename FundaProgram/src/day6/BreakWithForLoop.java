package day6;

import java.util.Scanner;

public class BreakWithForLoop {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number");
		int num = sc.nextInt();
		int i = 1;
		
		for(i=1; i<=10; i++)
		{
			if(i == 6)
			{
			    break;
			    
			}
			System.out.println(i +" ");
		}
		

	}

}
