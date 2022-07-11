package exception;

import java.io.IOException;
import java.sql.SQLException;

public class ExceptionParentChild {
	
	class AB
	{
		void display() throws IOException
		{
			System.out.println("In parent class");
		}
	}
	
	class BC extends AB 
	{
		//void display() throws SQLException
		{
			System.out.println("In child class");
		}
	}

	public static void main(String[] args) {
		

	}

}
