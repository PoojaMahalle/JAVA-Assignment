package strings;

import java.util.Arrays;
import java.util.Scanner;

public class WordCount {

	public static void main(String[] args) {

		String s1="Java is a programming language";
		String str[]=s1.split(" ");
		
		for(int i=0; i<str.length; i++)
		{
			System.out.print(str[str.length-(i+1)]+" ");
		}
		//System.out.println(Arrays.toString(str));
		System.out.println();
		char ch[]=s1.toCharArray();
		Scanner sc = new Scanner(System.in);
		//System.out.println(Arrays.toString(ch));
		System.out.println("Enter Character");
		char c = sc.next().charAt(0);
		int cnt=0;
	       for(int i=0; i<ch.length; i++)
	       {
	    	   if(ch[i]==c)
	    	   {
	    		   cnt++;
	    	   }
	       } 
	      System.out.println("Number of char count= "+cnt);
	       
	      

	}

}
