package strings;

import java.util.Arrays;

public class AnagranSortMethod {

	public static void main(String[] args) {
		String s1="Apple";
		String s2="ppAleh";
		
		char ch[]=s1.toCharArray();
		char ch1[]=s2.toCharArray();
		
		Arrays.sort(ch);
		System.out.println(ch);
		
		Arrays.sort(ch1);
		System.out.println(ch1);
		
		int cnt=0;
		if(ch.length==ch1.length)
		{
			for(int i=0; i<ch.length; i++)
			{
				if(ch[i]==ch1[i])
				{
					cnt++;
				}
			}
			if(cnt==ch.length)
			{
				System.out.println("Anagram");
			}
			else
			{
				System.out.println("Not Anagram");
			}	
		}
		else
		{
			System.out.println("Not Anagram");
		}
	}

}
