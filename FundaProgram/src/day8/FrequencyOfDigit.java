package day8;

import java.util.Scanner;

public class FrequencyOfDigit {

	public static void main(String[] args) {
//		Scanner sc = new Scanner(System.in);
//		System.out.println("Enter any number");
//		
		int num = 1212345,temp;
		temp = num;
		
		for(int i=0; i<=9; i++)// i=0
		{
			int cnt = 0;
			num=temp;
			while(num>0) //num=12345  num=1234
			{
				int r = num % 10; //r=5 r=4
				if(r==i) 
				{
					cnt++;
				}
				num=num/10;
				
			}
			if(cnt>0)
			{
			System.out.println(i+" "+cnt);
			}
		}

	}

}
