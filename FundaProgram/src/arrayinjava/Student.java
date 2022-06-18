package arrayinjava;

public class Student {
	int id, marks;
	String name, dept;

//	Student(int id, String name, String dept, int marks) {
//		this.id = id;
//		this.name = name;
//		this.dept = dept;
//		this.marks = marks;
//		
//	}
	Student(){}
	
	int getId()
	{
		return id;
	}
	void setId(int id)
	{
		this.id=id;
	}
	String getName()
	{
		return name;
	}
	void setName(String name)
	{
		this.name=name;
	}
	String getDept()
	{
		return dept;
	}
	void setDept(String dept)
	{
		this.dept=dept;
	}
	int getMarks()
	{
		return marks;
	}
	void setMarks(int marks)
	{
		this.marks=marks;
	}
	
	public String toString() {
		return id + " " + name + " " + dept + " " + marks;
	}
}
