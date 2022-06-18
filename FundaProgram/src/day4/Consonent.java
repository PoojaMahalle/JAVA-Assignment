package day4;

import java.util.Scanner;

public class Consonent {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a character");
		char ch=sc.next().charAt(0);
		
		if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u')
		{
			System.out.println("This is a vowel");
		}
		else
		{
			System.out.println("This is a consonant");
		}
	}

}
