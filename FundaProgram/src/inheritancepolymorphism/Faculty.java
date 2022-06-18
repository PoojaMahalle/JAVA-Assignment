package inheritancepolymorphism;

public class Faculty extends Person {
     int id,salary;
     String subject;
     char performance;
     
     void setFacultyData(int id,int salary, String subject,char performance)
     {
    	 this.id=id;
    	 this.salary=salary;
    	 this.subject=subject;
    	 this.performance=performance;
    	 
     }
     
     
     void bonus()
     {
    	 if(performance=='A')
    	 {
    		 salary=salary*15/100+salary;
    		 System.out.println("New salary: "+salary);
    	 }
    	 else if(performance=='B')
    	 {
    		 salary=salary*10/100+salary;
    		 System.out.println("New salary: "+salary);
    	 }
    	 else if(performance=='C')
    	 {
    		 salary=salary*5/100+salary;
    		 System.out.println("New salary: "+salary);
    	 }
    	 else
    	 {
    		 System.out.println("Low performance");
    	 }
     }
     public String toString()
     {
    	 return id+" "+name+" "+performance+" "+salary;
     }
}
