package overriding;

public class Student extends Person{

	int id,percentage;
	String dept;
	
	void setStudentData(int id,int percentage,String dept)
	{
		this.id=id;
		this.percentage=percentage;
		this.dept=dept;
	}
	
	void grade()
	{
		if(percentage > 60)
		{
			System.out.println("A grade");
		}
		else if(percentage < 50)
		{
			System.out.println("B grade");
		}
		else
		{
			System.out.println("C grade");
		}
	}
	
	void display()
	{
		super.display();
		System.out.println(id+" "+percentage+" "+dept);
	}
}
