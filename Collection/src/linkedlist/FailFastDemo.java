package linkedlist;

import java.util.ArrayList;
import java.util.ListIterator;

public class FailFastDemo {

	public static void main(String[] args) {
     ArrayList<Integer> al = new ArrayList<Integer>();
		
		al.add(10);
		al.add(20);
		al.add(30);
		al.add(40);
		al.add(10);
		al.add(50);
		al.add(60);
		al.add(70);
		al.add(10);
		al.add(80);
		System.out.println(al);
		
//		for(Integer i:al)//fail fast iterator
//		{
//			if(i==20)
//				al.add(200);
//		}
        
		ListIterator<Integer>litr=al.listIterator();//fail safe iterators
		while(litr.hasNext())
		{
			if(litr.next()==20)
				litr.remove();//listIterator
		}
		System.out.println(al);
	}

}
