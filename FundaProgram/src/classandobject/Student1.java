package classandobject;

public class Student1 {

	int id, marks;
	String name, dept, sports;
	static String clgname;
	
	{
		id=00;
		marks=00;
		name="name";//instance block, method,constructor
		dept="dept";
		sports="sports";
		clgname="DYPCOE";
		System.out.println("In instance block");
	}
	{
		System.out.println("In instance block 2");
	}
	Student1()
	{
		System.out.println("In default constructor");
	}
	

	void setData(int id, String name, String dept, int marks, String sports) {
		this.id = id;
		this.name = name;
		this.dept = dept;
		this.marks = marks;
		this.sports = sports;
	}

	
	  void display() 
	  {
	  System.out.println(id+" "+name+" "+dept+" "+marks+" "+sports); 
	  }
	 

	void sportsMarks() {
		if (sports.equals("Batminton")) {
			marks = marks + 5;
			System.out.println("New marks are: " + marks);
		} else if (sports.equals("Hockey")) {
			marks = marks + 3;
			System.out.println("New marks are: " + marks);
		} else if (sports.equals("KhoKho")) {
			marks = marks + 2;
			System.out.println("New marks are: " + marks);
		} else if (sports.equals("No")) {
			System.out.println("New marks are: " + marks);
		} else {
			marks = marks + 1;
			System.out.println("New marks are: " + marks);
		}

	}

	public static void main(String[] args) {
		Student1 s1 = new Student1();
		System.out.println(s1);
		
		System.out.println();
		System.out.println();
		Student1 s2 = new Student1();
		System.out.println(s2);
//		
//		Student1 s3 = new Student1();
//
//		s1.setData(101, "raj", "comp", 70, "Batminton");
//		// s1.display();
//		s1.sportsMarks();
//		System.out.println(s1);// hexadecimal form of the hashcode
//
//		
//		 s2.setData(102, "Riya", "Entc", 60,"Hockey"); 
//		 s2.display(); 
//		 s2.sportsMarks();
//		 System.out.println();
//		  
//		 s3.setData(103, "Ram", "IT", 60,"No"); 
//		 s3.display(); 
//		 s3.sportsMarks();
//		 
	}

}
