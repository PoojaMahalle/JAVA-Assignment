package day7;

import java.util.Scanner;

public class MenuDrivenDoWhile {

	public static void main(String[] args) {
		
		int ch,a,b;
		char c = 'n';
		do
		{
	    System.out.println("1. Addition");
	    System.out.println("2. Substraction");
	    System.out.println("3. Multiplication");
	    System.out.println("4. Division");
	    
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your choice");
		ch = sc.nextInt();
	    
		System.out.println("Enter any choice");
		a = sc.nextInt();
		b = sc.nextInt();
		
		switch(ch)
		{
		case 1: System.out.println("Addition is:" +(a+b));
		break;
		
		case 2: System.out.println("Substraction is:" +(a-b));
		break;
		
		case 3: System.out.println("Multiplication is:" +(a*b));
		break;
		
		case 4: System.out.println("Division is:" +(a/b));
		break;
		
		default: System.out.println("Invalid choice");
		}
		System.out.println("Do you want to continue: (y/n): ");
		c = sc.next().charAt(0);
		
		}while(c == 'y'|| c == 'Y');
         
		System.out.println("Done");
}
}
