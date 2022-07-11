package exception;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileReadWrite {

	public static void main(String[] args) throws IOException {
		//FileOutputStream fos=null;
		//autoclosable can be directly written along with try
		//try with resources
		//FileInputStream fis=null;
		try (FileInputStream fis=new FileInputStream("E://Test.text")){
			//fis= new FileInputStream("E://Test.text");
			int i;
			while((i=fis.read())!=-1)//-1 mark end of the file
			{
				System.out.println((char)i);
			}
			System.out.println();
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
//		finally
//		{
//			System.out.println("output stream closed");
//			fis.close();
//		}
		
//		fos = new FileOutputStream("E://Test.txt");
//		String s="Java session ThinkQuotient";
//		for(int i=0; i<s.length(); i++)
//		{
//			fos.write((int)s.charAt(i));
//		}
//		System.out.println();
		
        System.out.println("Done");
	}

}
