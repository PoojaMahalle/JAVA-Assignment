package wrapperclasses;

import java.util.Arrays;

public class EnumDemo {

	public static void main(String[] args) {

      System.out.println(Colors.BLACK);
      
      Colors c1 = Colors.BLACK;
      System.out.println(c1.ordinal());
      
      Colors cr[]= Colors.values();
      for(Colors c:cr)
      {
    	  System.out.println(c);
      }
      System.out.println(Arrays.toString(cr));

	}

}
