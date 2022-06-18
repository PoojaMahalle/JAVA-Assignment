package day5;

import java.util.Scanner;

public class SwitchDemo4 {

	public static void main(String[] args) {
//		int num=1;
		
//		switch(num)
//		{
//		case 1:System.out.println(1);
//		case 2:System.out.println(2);
//		case 3:System.out.println(3);
//		case 4:System.out.println(4);
//		case 5:System.out.println(5);
//		break;
//		}
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter number");
		int num=sc.nextInt();
		
		switch(num%2)
		{
		case 0: System.out.println("Number is even");
		break;
		default:System.out.println("Number is odd");
		}
	}

}
