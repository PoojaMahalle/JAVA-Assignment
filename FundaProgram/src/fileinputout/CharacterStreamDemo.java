package fileinputout;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class CharacterStreamDemo {

	void readFile()
	{
		try {
			FileReader fr = new FileReader("E://Test.txt");
			BufferedReader br = new BufferedReader(fr);
			String s;
			while((s=br.readLine())!=null)
			{
				System.out.println(s);
			}
			br.close();
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
			FileWriter fw = new FileWriter("E://Test.txt",true);
			fw.write("core java sessions");
			
			fw.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	void fileClassExample()
	{
		File f = new File("E://Test.txt");
	}
	public static void main(String[] args) {


		CharacterStreamDemo obj = new CharacterStreamDemo();
		obj.readFile();
		
		System.out.println("\n--------------\n");
		obj.writeFile();
		
		System.out.println("\n--------------\n");
		obj.readFile();

	}

}
