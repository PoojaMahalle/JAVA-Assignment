package student;

public class Result {

	void r(Percentage p)
	{
		int n=p.getPer();
		

		if(n > 80)
		{
			System.out.println("Distinction");
		}
		else if(n > 60)
		{
			System.out.println("First class");
		}
		else if(n > 50)
		{
			System.out.println("Second class");
		}
		else
		{
			System.out.println("Fail");
		}
	}
	
}
