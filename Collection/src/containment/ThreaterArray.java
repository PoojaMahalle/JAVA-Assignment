package containment;

import java.util.ArrayList;
import java.util.Arrays;

public class ThreaterArray {

	public static void main(String[] args) {
		ArrayList<Theater> al= new ArrayList<>();
		
		al.add(new Theater(101,"Pushpa",2,700000));
		al.add(new Theater(102,"Bhaagi",3,600000));
		al.add(new Theater(103,"Gangubai",2,50000));
		al.add(new Theater(104,"Pawankhind",3,70000));
		al.add(new Theater(105,"I hate love story",2,600000));
		
		//System.out.println(al);

        Theater t1[]= new Theater[al.size()];
        al.toArray(t1);
        System.out.println(Arrays.toString(t1));
        
		for(Theater t:al)
		{
			if(t.name.startsWith("I"))
			{
				System.out.println(t.name+" "+t.total1daycollection);
				//System.out.println(t);
			}
		}
		
		

	}

}
