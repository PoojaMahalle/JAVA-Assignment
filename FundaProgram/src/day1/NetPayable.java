package day1;

import java.util.Scanner;

public class NetPayable {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the sells amount");
		int amt = sc.nextInt();
		
		if(amt>10000)
		{
			double discount = amt*20/100;
			System.out.println("The discount is "+discount);
			System.out.println("Net payable amount is "+(amt-discount));
		}
		else
		{
			double dis= amt*10/100;
			System.out.println("The discount is "+dis);
			System.out.println("Net payable amount is "+(amt-dis));
		}

	}

}
