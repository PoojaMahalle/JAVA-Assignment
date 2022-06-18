package day6;

import java.util.Scanner;

public class Square1To20 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		//System.out.println("Enter number");
        
		int num = sc.nextInt();
		int i = 1;
		
		for(i=1; i<=20; i++)
		{
			System.out.println(i + "*" + i + "=" + i*i);
		}
	}

}
