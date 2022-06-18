package day5;

import java.util.Scanner;

public class MonthWithSwitch {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter month");
		int month = sc.nextInt();

		switch (month) {
		case 1:
			System.out.println("No of days in January " + 31);
			break;
		case 2:
			System.out.println("No of days in February " + 28);
			break;
		case 3:
			System.out.println("No of days in March " + 30);
			break;
		case 4:
			System.out.println("No of days in April " + 31);
			break;
		case 5:
			System.out.println("No of days in May " + 30);
			break;
		case 6:
			System.out.println("No of days in June " + 31);
			break;
		case 7:
			System.out.println("No of days in July " + 30);
			break;
		case 8:
			System.out.println("No of days in August " + 31);
			break;
		case 9:
			System.out.println("No of days in September " + 30);
			break;
		case 10:
			System.out.println("No of days in October " + 31);
			break;
		case 11:
			System.out.println("No of days in November " + 30);
			break;
		case 12:
			System.out.println("No of days in December " + 30);
			break;
		default:
			System.out.println("Invalid month");
		}
	}

}
