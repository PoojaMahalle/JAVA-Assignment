package linklist;

import java.util.Iterator;
import java.util.LinkedList;

public class DescendingIteratorDemo {

	public static void main(String[] args) {
		 LinkedList<Integer> l1 = new LinkedList<Integer>();
			
			l1.add(10);
			l1.add(20);
			l1.add(30);
			l1.add(40);
			l1.add(10);
			l1.add(50);
			l1.add(60);
			l1.add(70);
			l1.add(10);
			l1.add(80);
			System.out.println(l1);
			
			Iterator<Integer> itr= l1.descendingIterator();
			while(itr.hasNext())
			{
				System.out.print(itr.next()+" ");
			}

	}

}
