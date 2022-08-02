package stack;

import java.util.Stack;

public class StackDemo {

	public static void main(String[] args) {

          Stack<Integer> s = new Stack<>();
          
          s.push(20);
          s.push(60);
          s.push(1);
          s.push(100);
          s.push(10);
          
          System.out.println(s);
          
          s.pop();
          System.out.println(s);
          
          System.out.println(s.contains(100));// vector
          
          System.out.println(s.peek());//top element in your stack
          
          System.out.println(s.empty());
          
          System.out.println(s.search(20));//position of the element from top
	
	}

}
