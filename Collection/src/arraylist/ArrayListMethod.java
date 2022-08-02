package arraylist;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class ArrayListMethod {

	public static void main(String[] args) {
		ArrayList<Integer> al = new ArrayList<>();
		ArrayList<Integer> list = new ArrayList<>();
		//normal for loop,advanced for loop,Iterator class,listIterator
		
		al.add(10);
		al.add(20);
		al.add(30);
		al.add(40);
		al.add(50);
		al.add(60);
		
		System.out.println(al);
		
		//Iterator
		System.out.println("Iterator: ");
		Iterator<Integer> itr = al.iterator();//traverse in forward direction
		while(itr.hasNext())
		{
			System.out.print(itr.next());
		}
		System.out.println();
		System.out.println("ListIterator forward: ");
		//ListIterator forward direction as well as reverse direction
		ListIterator<Integer> litr = al.listIterator();
		while(litr.hasNext())
		{
			System.out.print(litr.next());
		}
		
		//Reverse direction
		System.out.println("ListIterator reverse: ");
		litr = al.listIterator(al.size());//pointing the list iterator to the last element
		while(litr.hasPrevious())
		{
			System.out.print(litr.previous());
		}
		
//		al.add(3, 100);
//		System.out.println(al);
//		
////		al.remove(3);//index as input
////		System.out.println(al);
////		
////		al.clear();
////		System.out.println(al);
//		
//		System.out.println(al.get(4));
//		System.out.println(al.isEmpty());
//		System.out.println(al.indexOf(10)+" "+al.lastIndexOf(20));
//		
//		System.out.println(al.contains(50));
//		
//		System.out.println(al.set(2, 200));
//		System.out.println(al);
//		
//		list.add(1000);
//		list.add(200);
//		list.add(3000);
//		
//		al.addAll(1,list);//index,collection
//		System.out.println(al);
//		
//		al.removeAll(list);//remove common element also
//		System.out.println(al);
//
//		al.retainAll(list);
//		System.out.println(al);
//		
//		System.out.println(al.containsAll(list));
//		
//		ArrayList<Integer> list1 = new ArrayList<>();
//		
//		list1.add(100);
//		list1.add(200);
//		list1.add(3000);
//		
//		System.out.println(list.equals(list1));
//		
	}

}
