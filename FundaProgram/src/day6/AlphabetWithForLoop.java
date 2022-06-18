package day6;

import java.util.Scanner;

public class AlphabetWithForLoop {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Character");
		char ch = sc.next().charAt(0);
		
		 for(char i = 'a'; i<='z'; i++)
		 {
			 System.out.println("Alphabet " + i);
		 }
	}

}
