package exception;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileWriteExample {

	public static void main(String[] args) throws IOException {
		FileReader fr=null;
		FileWriter fw=null;

		File f= new File("E://Test.text");
		
		try {
			fw=new FileWriter(f);
			fw.write("Welcome to core java session");
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		finally
		{
			System.out.println("File writer closed");
			fw.close();
		}
		
		 try {
			fr= new FileReader(f);
			int i;
				while((i=fr.read())!=-1)
				 {
					 System.out.println((char)i);
				 }
		} catch (FileNotFoundException e1) {
			
			e1.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		 
		System.out.println();
		System.out.println("Done");
	}

}
