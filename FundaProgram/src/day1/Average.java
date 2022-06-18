package day1;

import java.util.Scanner;

public class Average {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Five subject marks");
		
		System.out.println("Enter marks of Maths");
		int math = sc.nextInt();
		
		System.out.println("Enter marks of Chemistry");
		int chem = sc.nextInt();
		
		System.out.println("Enter marks of Physics");
		int phys = sc.nextInt();
		
		System.out.println("Enter marks of English");
		int eng = sc.nextInt();
		
		System.out.println("Enter marks of Biology");
		int bio = sc.nextInt();
		
		
		int sum = math + chem + phys + eng + bio;
		int avg = sum/5;
		int percentage = (sum*100)/500;
		
		System.out.println("Total marks= "+sum);
		System.out.println("Average of subject= "+avg);
		System.out.println("Percentage= "+percentage);
		
	}

}
