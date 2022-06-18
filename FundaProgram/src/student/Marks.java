package student;

public class Marks {
	int m;
     void marks(Student a)
     {
    	 int m1=a.getM1();
    	 int m2=a.getM2();
    	 int m3=a.getM3();
    	 m=m1+m2+m3;
     }
     int getMarks()
     {
    	 return m;
     }
     
     public String toString()
     {
    	 return "marks= "+m;
     }
}
