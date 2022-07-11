package strings;

import java.util.Scanner;

public class DisplayAllOccurance {

	public static void main(String[] args) {
		
		String s1="Java is a programming language";
		System.out.println(s1);
		
		char ch[]=s1.toCharArray();
		
	       for(int i=0; i<ch.length; i++)
	       {
	    	   int cnt=1;
	    	   for(int j=i+1; j<ch.length; j++)
	    	   {
	    	   if(ch[i]==ch[j])
	    	   {
	    		   cnt++;
	    		   ch[j]=' ';
	    	   }
	    	   }
	    	   if(ch[i]!=' ')
	    	   System.out.println(ch[i]+" "+cnt);
	       }
	       
	      
	}

}
