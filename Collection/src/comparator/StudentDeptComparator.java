package comparator;

import java.util.Comparator;

public class StudentDeptComparator implements Comparator<Student1> {

	public int compare(Student1 s1,Student1 s2)
	{
		if(s1.dept.equals(s2.dept))
			return s1.name.compareTo(s2.name);
			//return s1.id-s2.id;
		else
		return s1.dept.compareTo(s2.dept);
	}
}
