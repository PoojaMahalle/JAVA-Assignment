package collection;

import java.util.ArrayList;

public class CollectionNonGeneric {

	public static void main(String[] args) {

        ArrayList a1 = new ArrayList();
  
        a1.add(40);
        a1.add(2.5f);
        a1.add("Raj");
        a1.add(60);
        a1.add(80);
        a1.add(30);
        a1.add("Riya");
        a1.add(78.5f);
        a1.add(new Stud(101,"Anjali",70));
        a1.add(new Stud(102,"Rahul",70));
        
        System.out.println(a1);
        
//        for(int i=0; i<a1.size(); i++)
//        {
//        	a1.get(i);
//        }
        
        for(Object o:a1)
        {
        	String s=o.getClass().getName();
        	if(s.equalsIgnoreCase("java.lang.String"))
        	System.out.println(o);
        }
	}

}
