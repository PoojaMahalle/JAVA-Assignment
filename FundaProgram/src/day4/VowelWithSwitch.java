package day4;

import java.util.Scanner;

public class VowelWithSwitch {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter character");
		char ch = sc.next().charAt(0);
		switch (ch)
        {
            case 'a':
               
            case 'e':
                
            case 'i':
               
            case 'o':
                
            case 'u':
            	System.out.println("This character is vowel");
                break;
            default:
            	System.out.println("This character is consonant");
                break;
        }
		
		//float a = 9.5f;
		//int b =(int)a;
		
		

	}

}
