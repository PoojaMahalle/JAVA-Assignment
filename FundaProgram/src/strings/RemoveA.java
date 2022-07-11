package strings;

public class RemoveA {

	public static void main(String[] args) {
		String s1="Java is a programming language";
		System.out.println(s1);
		
		char ch[]=s1.toCharArray();
		//char c ;
	       for(int i=0; i<ch.length; i++)
	       {
	    	   if(ch[i]!='a')
	    	   {
	    		   System.out.print(ch[i]);
	    	   }
	  
	       }
//	       String s2=new String(ch);
//	       System.out.println(s2);

	}

}
