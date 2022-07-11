package exception;

public class AgeExceptionExample {
	
	void validate(int age) throws AgeException
	{ 
		if(age<18)
	{
		throw new AgeException("age is less, not allowed for rollercoster ride");
	}
		else if(age>60)
		{
			throw new AgeException("age is greater,not allowed for rollercoster ride");
		}
		else
		{
			System.out.println("Enjoy your ride");
		}
		
	}
	

	public static void main(String[] args) {

         int age=65;
         AgeExceptionExample a = new AgeExceptionExample();
         
        try {
			a.validate(age);
		} catch (AgeException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
        System.out.println("Done");
	}

}
