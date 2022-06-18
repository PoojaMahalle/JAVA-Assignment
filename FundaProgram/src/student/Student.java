package student;

public class Student {
    int id,m1,m2,m3;
    String name,dept;
    
    void Student(){}
    
    void setId(int id)
    {
    	this.id=id;
    }
    void setM1(int m1)
    {
    	this.m1=m1;
    }
    void setM2(int m2)
    {
    	this.m2=m2;
    }
    void setM3(int m3)
    {
    	this.m3=m3;
    }
    void setName(String name)
    {
    	this.name=name;
    }
    void setDept(String dept)
    {
    	this.dept=dept;
    }
    
    int getM1()
    {
    	return m1;
    }
    int getM2()
    {
    	return m2;
    }
    int getM3()
    {
    	return m3;
    }
    public String toString()
    {
    	return id+" "+name+" "+m1+" "+m2+" "+m3+" "+dept;
    }
    
}
