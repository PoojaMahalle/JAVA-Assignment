package strings;

public class ReverseString {

	public static void main(String[] args) {
		String s1="Java is a programming language";
		String str[]=s1.split(" ");
		char ch[]=s1.toCharArray();
		
		for(int i=0; i<ch.length; i++)
		{
			System.out.print(ch[ch.length-(i+1)]+"");
		}
		
		}

	}


