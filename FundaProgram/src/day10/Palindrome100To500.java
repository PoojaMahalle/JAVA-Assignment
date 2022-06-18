package day10;

import java.util.Scanner;

public class Palindrome100To500 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		//System.out.println("Enter number");
		int f,m,s,l;
		
		for(int i=100; i<=500; i++)
		{
			f= i%10;
			m = i/10;
			s = m/10;
			l = m/10;
			if(f == l)
			{
				System.out.println(i+" ");
			}
		}

	}

}
