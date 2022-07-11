package exception;

public class ThrowsDemo {
	
	int getStringLength(String s) throws NullPointerException 
	{
		if(s==null)
		{
			throw new NullPointerException("String is null");
			//System.out.println("String is null");
		}
		return s.length();
	}

	public static void main(String[] args) {
		ThrowsDemo t1 = new ThrowsDemo();
		
		System.out.println(t1.getStringLength("India"));
		try
		{
			System.out.println(t1.getStringLength(null));
		}
		catch(NullPointerException e)
		{
			e.printStackTrace();
			//System.out.println(e);
			//throw new NullPointerException("Null string...Please enter valid string");
		}
        System.out.println(t1.getStringLength("Mumbai"));
        System.out.println(t1.getStringLength("program"));
	}

}
