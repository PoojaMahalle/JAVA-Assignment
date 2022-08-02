package arraylist;

import java.util.ArrayList;

public class RemoveEvenNumber {

	public static void main(String[] args) {
		ArrayList<Integer> al = new ArrayList<>();

        al.add(1);
        al.add(2);
        al.add(3);
        al.add(4);
        al.add(5);
        al.add(6);
        al.add(7);
        al.add(8);
        al.add(9);
        al.add(10);
        
        for(int i=0; i<al.size()-1; i++)
        {
        	if(al.get(i)%2==0)
        	{
        		al.remove(i);
        	}
        	System.out.print(al.get(i));
        }
        
	}

}
