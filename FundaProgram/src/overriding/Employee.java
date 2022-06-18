package overriding;

public class Employee extends Person {

	int id,salary,pf;
	String dept;
	
	void setEmployeeData(int id,int salary,int pf,String dept)
	{
		this.id=id;
		this.salary=salary;
		this.dept=dept;
	}
	
	void pf()
	{
		pf=salary*15/100;
		System.out.println("PF = "+ pf);
	}
	
	void display()
	{
		super.display();
		System.out.println(id+" "+salary+" "+dept);
	}
}
