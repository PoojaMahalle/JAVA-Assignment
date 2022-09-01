package fileinputout;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Scanner;

public class SerializableUserInput {
	
	void storeObject(ArrayList<Employee>al)
	{
		try {
			FileOutputStream fos = new FileOutputStream("E://test1.txt");
			
			ObjectOutputStream oos = new ObjectOutputStream(fos);
		
		    oos.writeObject(al);
		    
		    System.out.println("Core Java");
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
			fis = new FileInputStream("E://test1.txt");
			ObjectInputStream ois = new ObjectInputStream(fis);
			
			ArrayList<Employee> al = (ArrayList<Employee>)ois.readObject();
			System.out.println(al);
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
		Scanner sc = new Scanner(System.in);
		
		ArrayList<Employee>al = new ArrayList<>();
		System.out.println("Enter size");
		int size=sc.nextInt();
		for(int i=0; i<size; i++)
		{
			System.out.println("Enter id,name,dept,salary");
			int id=sc.nextInt();
			String name=sc.next();
			String dept=sc.next();
			int salary= sc.nextInt();
			
			al.add(new Employee(id,name,dept,salary));
		}

		SerializableUserInput su = new SerializableUserInput();
		su.storeObject(al);
		su.readObjectData();
	}

}
