package arraylist;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayToArrayListDemo {

	public static void main(String[] args) {

       Integer arr[]= {10,20,30,40,50,1,2,3,4,5,6};
       
       ArrayList<Integer> al=new ArrayList<>(Arrays.asList(arr));
       System.out.println(al);
  
	}

}
