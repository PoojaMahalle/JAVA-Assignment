package student;

public class Percentage {

	int perc;
	void p(Marks a)
	{
		int m=a.getMarks();
		perc=(m*100)/300;
		
	}
	
	int getPer()
	{
		return perc;
	}
	public String toString()
	{
		return "Percentage= "+perc;
	}
}
