package arrayinjava;

public class Employee {
	int id,salary;
    String name,dept,location;
    
//    Employee(int id,String name,int salary,String dept,String location)
//    {
//    	this.id=id;
//    	this.name=name;
//    	this.salary=salary;
//    	this.dept=dept;
//    	this.location=location;
//    }
    
    Employee(){}
    
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
    int getSalary()
    {
    	return salary;
    }
    void setSalary(int salary)
    {
    	this.salary=salary;
    }
    String getDept()
    {
    	return dept;
    }
    void setDept(String dept)
    {
    	this.dept=dept;
    }
    String getLocation()
    {
    	return location;
    }
    void setLocation(String location)
    {
    	this.location=location;
    }
   public String toString() 
   {
    
    	return id+" "+name+" "+salary+" "+dept+" "+location;
   }
   
//   void print()
//   {
//   if(dept.equals("HR")&& salary>30000)
//   {
//	   System.out.println("Department is HR");
//   }
//   else
//   {
//	   System.out.println("Department is not HR");
//   }
   }



