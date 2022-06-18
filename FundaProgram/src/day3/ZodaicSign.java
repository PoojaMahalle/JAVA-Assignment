package day3;

import java.util.Scanner;

public class ZodaicSign {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter dd,month,year");
		int dd = sc.nextInt();
		int month = sc.nextInt();
		int year = sc.nextInt();
		int febdays;
		
		if(year % 4 == 0)
			febdays = 29;
		else
			febdays = 28;
			
		
		if(month==1)
		{
			if(dd<=19)
				System.out.println("Your zodiac sign is Capricon");
			else if(dd>=20 && dd<=31)
				System.out.println("Your zodiac sign is Aquarius");
			else
				System.out.println("Invalid date");
		}
		else if(month==2)
		{
			if(dd<=19)
				System.out.println("Your zodiac sign is Aquarius");
			else if(dd>=20 && dd<=febdays)
				System.out.println("Your zodiac sign is Pisces");
			else
				System.out.println("Invalid date");
		}
	    else if(month==3)
		{
			if(dd<=21)
				System.out.println("Your zodiac sign is Pisces");
			else if(dd>=20 && dd<=30)
				System.out.println("Your zodiac sign is Aries");
			else
				System.out.println("Invalid date");
		}
	    else if(month==4)
		{
			if(dd<=20)
				System.out.println("Your zodiac sign is Aries");
			else if(dd>=20 && dd<=31)
				System.out.println("Your zodiac sign is Taurus");
			else
				System.out.println("Invalid date");
		}
	    else if(month==5)
		{
			if(dd<=21)
				System.out.println("Your zodiac sign is Taurus");
			else if(dd>=20 && dd<=30)
				System.out.println("Your zodiac sign is Gemini");
			else
				System.out.println("Invalid date");
		}
	    else if(month==6)
		{
			if(dd<=21)
				System.out.println("Your zodiac sign is Gemini");
			else if(dd>=20 && dd<=31)
				System.out.println("Your zodiac sign is Cancer");
			else
				System.out.println("Invalid date");
		}
	    else if(month==7)
		{
			if(dd<=21)
				System.out.println("Your zodiac sign is Cancer");
			else if(dd>=20 && dd<=30)
				System.out.println("Your zodiac sign is Leo");
			else
				System.out.println("Invalid date");
		}
	    else if(month==8)
		{
			if(dd<=21)
				System.out.println("Your zodiac sign is Leo");
			else if(dd>=20 && dd<=31)
				System.out.println("Your zodiac sign is Virgo");
			else
				System.out.println("Invalid date");
		}
	    else if(month==9)
		{
			if(dd<=21)
				System.out.println("Your zodiac sign is Virgo");
			else if(dd>=20 && dd<=30)
				System.out.println("Your zodiac sign is Libra");
			else
				System.out.println("Invalid date");
		}
	    else if(month==10)
		{
			if(dd<=21)
				System.out.println("Your zodiac sign is Libra");
			else if(dd>=20 && dd<=31)
				System.out.println("Your zodiac sign is Scorpio");
			else
				System.out.println("Invalid date");
		}
	    else if(month==11)
		{
			if(dd<=21)
				System.out.println("Your zodiac sign is Scorpio");
			else if(dd>=20 && dd<=30)
				System.out.println("Your zodiac sign is Sagittarius");
			else
				System.out.println("Invalid date");
		}
	    else if(month==12)
		{
			if(dd<=21)
				System.out.println("Your zodiac sign is Sagittarius");
			else if(dd>=20 && dd<=31)
				System.out.println("Your zodiac sign is Capricorn");
			else
				System.out.println("Invalid date");
		}
		
	}

}
