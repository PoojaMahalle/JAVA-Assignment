package queue;

import java.util.PriorityQueue;

public class QueueDemo {

	public static void main(String[] args) {
		PriorityQueue<Integer> qe= new PriorityQueue<>();
		
		//Queue<Integer> qe1= new PriorityQueue<>();
		
		qe.add(10);
		qe.add(90);
		qe.add(45);
		qe.add(20);
		qe.add(10);
		qe.add(90);
		qe.add(45);
		qe.add(20);
		
		System.out.println(qe);
		
		qe.remove();//remove true or false
		System.out.println(qe);
		
		System.out.println("Peek: "+qe.peek());
		System.out.println(qe.element());//head but it will throw exception when queue is empty
		
		System.out.println(qe.poll());//remove as well as it will return the element
		System.out.println(qe);
		
		System.out.println(qe.size());

	}

}
