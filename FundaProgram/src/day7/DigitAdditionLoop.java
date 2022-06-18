package day7;

import java.util.Scanner;

public class DigitAdditionLoop {

	public static void main(String[] args) {
		
		int num, sum=0;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("enter a number: ");
		num=sc.nextInt();
		
		while(num!=0)// n = 345     num = 34
		{
			int r=num%10; //r=5     r=34%10
			sum = sum+r;  //sum=0+5=5   sum = 5+4=9
			num=num/10; //num=345/10=34  num=34/10=3
		}
		System.out.println("Addition is: "+sum);

	}

}
