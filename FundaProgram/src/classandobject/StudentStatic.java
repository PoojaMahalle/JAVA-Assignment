package classandobject;

public class StudentStatic {
	int id,marks;
	String name;
	static String clgname = "JDIET";
	
	static
	{
		System.out.println("Static block 1 ");
	}
	
	static
	{
		System.out.println("Static block 2 ");
	}
	
	StudentStatic(int id,String name,int marks)
	{
		this.id=id;
		this.name=name;
		this.marks=marks;
	}
	
	static void clgname1()//can access only static directly if non static it require an object
	{
		StudentStatic s1 = new StudentStatic(101,"Pooja",80);
		clgname="DYPCOE";
		s1.marks=90;
		System.out.println("collage name is: "+clgname);
	}
	
	
	void display()//non static can access both static as well as non static directly
	{
		clgname="DYPCOE";
		marks=90;
		System.out.println(id+" "+name+" "+marks);
	}

	public static void main(String[] args) {
		StudentStatic s1 = new StudentStatic(101,"Pooja",80);
		
		s1.display();
		System.out.println(StudentStatic.clgname);
		System.out.println(clgname);
		//System.out.println(marks);
		StudentStatic.clgname1();
		

	}

}
