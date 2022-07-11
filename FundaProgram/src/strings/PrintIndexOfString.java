package strings;

public class PrintIndexOfString {

	public static void main(String[] args) {
		String s1="THE QUICK BROWN FOR JUMPS OVER THE LAZY DOG";
		char ch[]=s1.toCharArray();
			
		 for(char i='A'; i<='Z'; i++)
		 {
			 for(int j=0; j<ch.length; j++)
			 {
				 if(i==ch[j])
				 {
					 System.out.println("Index of character "+i+" "+j);
				 }
			 }
		 }

	}

}
