package containment;

import java.util.Arrays;
import java.util.Scanner;

public class MovieActorMain {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        Movie mov[]=new Movie[2];
        
        for(int i=0; i<2; i++)
        {
        	System.out.println("Enter m_id,mname,boxofficecoll");
        	int m_id=sc.nextInt();
        	String mname=sc.next();
        	int boxofficecol=sc.nextInt();
        	
        Actor act[]=new Actor[2];
        for(int j=0; j<2; j++)
        {
        	System.out.println("Enter the id,name,birthyear,address of the "+(j+1)+" actors:");
        	int id=sc.nextInt();
        	String name=sc.next();
        	int birthyear=sc.nextInt();
        	String address=sc.next();
        	
        	Actor a1=new Actor();
        	a1.setId(id);
        	a1.setBirthyear(birthyear);
        	a1.setAddress(address);
        	a1.setName(name);
        	
              act[j]=a1;
        }
        Movie m1 = new Movie();
        m1.setM_id(m_id);
        m1.setM_name(mname);
        m1.setAct(act);
        m1.setBoxofficecol(boxofficecol);
        
        mov[i]=m1;
        }
        System.out.println(Arrays.toString(mov));
        for(Movie m: mov)
        {
        for(Actor a:m.act)
        {
        	if(a.getName().equals("SalmanKhan")&& m.getBoxofficecol()>5000000)
        	{
        	System.out.println(m.m_name+" "+a.name+""+a.birthyear+" "+a.address);
        	}
        }
	}


	}

}
