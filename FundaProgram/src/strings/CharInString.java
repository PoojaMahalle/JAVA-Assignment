package strings;

import java.util.Scanner;

public class CharInString {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        System.out.println("Enter any string");
		String str = sc.next();
		String ouputstr="";
		char ch[]=str.toCharArray();
		
		for(int i=0; i<ch.length; i++)
		{
			if(ch[i]>='a' && ch[i]<='z')
			{
			ch[i]=(char)(ch[i]-32);
			}
			else if(ch[i]>='A' && ch[i]<='Z')
			{
			ch[i]=(char)(ch[i]+32);
			}
		}
		ouputstr= new String(ch);
		System.out.println(ouputstr);
	}

}
