package strings;

import java.util.Arrays;

public class Anagram {

	public static void main(String[] args) {
		String s1="Apple";
		String s2="ppAle";
		
		char ch[]=s1.toCharArray();
		char ch1[]=s2.toCharArray();
		
		for(int i=0; i<ch.length; i++)
		{
			for(int j=i+1; j<ch.length;j++)
			{
				if(ch[i]>ch[j])
				{
					char temp=ch[i];
					ch[i]=ch[j];
					ch[j]=temp;
				}
			}
			System.out.print(ch[i]+" ");
		}
		System.out.println();
		
		for(int i=0; i<ch1.length; i++)
		{
			for(int j=i+1; j<ch1.length;j++)
			{
				if(ch1[i]>ch1[j])
				{
					char temp=ch1[i];
					ch1[i]=ch1[j];
					ch1[j]=temp;
				}
			}
			System.out.print(ch1[i]+" ");
		}
		System.out.println();
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
		
		
		
		
		
//		System.out.println(Arrays.toString(ch));
//		System.out.println(Arrays.toString(ch1));

		
		
		

	}



