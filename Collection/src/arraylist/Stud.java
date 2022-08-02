package arraylist;

public class Stud {

	int id,marks;
	String name;
	
	Stud(int id,String name,int marks)
	{
		this.id=id;
		this.name=name;
		this.marks=marks;
	}

	@Override
	public String toString() {
		return id + " " + marks + " " + name;
	}
}
