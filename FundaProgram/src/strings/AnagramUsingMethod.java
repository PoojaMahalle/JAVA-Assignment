package strings;

import java.util.Arrays;
import java.util.Scanner;

public class AnagramUsingMethod {
	
	public static boolean checkAnagram(String first, String second)
	{
		char ch1[]=first.toCharArray();
		char ch2[]=second.toCharArray();		
		
		boolean isAnagram = false;
		if(isAnagram==false)
		{
			System.out.println("not Anagram");
		}
		else
		{
			System.out.println("Anagram");
		}
		return isAnagram;
	}

	public static void main(String[] args) {


		Scanner sc = new Scanner(System.in);
		String first=sc.next();
		String second=sc.next();
		
		AnagramUsingMethod.checkAnagram(first, second);
		//System.out.println(isAnagram);

	}

}
