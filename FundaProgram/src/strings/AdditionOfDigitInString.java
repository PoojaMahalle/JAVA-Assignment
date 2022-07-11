package strings;

public class AdditionOfDigitInString {

	public static void main(String[] args) {
		String s1="a5d4f8g9h6";
		char ch[]=s1.toCharArray();
		
		int sum=0;
		for(int i=48; i<=57; i++)
		{
			for(int j=0; j<ch.length; j++)
			{
			if(i==ch[j])
			{
				sum=sum+(i-48);
			}
		}
		}
        System.out.println("Sum "+sum);
	}

}
