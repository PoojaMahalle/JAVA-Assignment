package fileinputout;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileHandling {
	
	void readFile()
    {
   	 try {
		FileInputStream fis = new FileInputStream("E://Test.txt");
		int i;
		while((i=fis.read())!=-1)
		{
			System.out.println((char)i);
		}
	} catch (FileNotFoundException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
    }
	
	void writeFile()
	{
		try {
			FileOutputStream fos = new FileOutputStream("E://Test.txt",true);
			String s = "ThinkQuotient";
			for(int i=0; i<s.length(); i++)
			{
				int c= s.charAt(i);
				fos.write(c);
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("Done");
	}

	public static void main(String[] args) {
      
		FileHandling f = new FileHandling();
		f.readFile();
		f.writeFile();
         

	}

}
