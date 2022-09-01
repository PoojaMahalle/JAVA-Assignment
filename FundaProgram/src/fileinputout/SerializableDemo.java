package fileinputout;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class SerializableDemo {
	
	void storeObject()
	{
		try {
			FileOutputStream fos = new FileOutputStream("E://Test.txt");
			
			ObjectOutputStream oos = new ObjectOutputStream(fos);
		
		    Employee e1 = new Employee(101,"Kajal","HR",70000);
		    oos.writeObject(e1);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("Done");
	}
	
	void readObjectData()
	{
		FileInputStream fis;
		try {
			fis = new FileInputStream("E://Test.txt");
			ObjectInputStream ois = new ObjectInputStream(fis);
			
			Employee e1 = (Employee)ois.readObject();//object
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

	public static void main(String[] args) {


		SerializableDemo s = new SerializableDemo();
		//s.storeObject();
		
		s.readObjectData();

	}

}
