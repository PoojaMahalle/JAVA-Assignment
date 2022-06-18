package day6;

//import java.util.Scanner;

public class PrimeBetwn400To300 {

	public static void main(String[] args) {
		int count;
		for(int i=400; i>=300; i--)
			{
			count = 0;
			for(int j=2; j<=i/2; j++)
			{
				if(i % j == 0)
					count=1;
				break;
			}
			if(count == 0)
			
				System.out.println(i);
			
			}


	}

}
