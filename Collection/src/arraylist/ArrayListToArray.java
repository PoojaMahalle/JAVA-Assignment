package arraylist;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class ArrayListToArray {

	public static void main(String[] args) {
		ArrayList<Integer> al = new ArrayList<>();
		ArrayList<Integer> al1 = new ArrayList<>();
		
		al1.add(400);
		al1.add(550);
		
		al.add(200);
		al.add(20);
		al.add(10);
		al.add(400);
		al.add(500);
		al.add(100);
		al.add(2000);
		al.add(1000);
		al.add(400);
		al.add(550);
		
		System.out.println(al);
		Collections.sort(al);//ascending order
		System.out.println(al);
		
		System.out.println(Collections.frequency(al, 400));
		System.out.println(Collections.indexOfSubList(al, al1));
		
//		Collections.sort(al);
//		Collections.reverse(al);
//		System.out.println(al);
		
//		int arr[]= new int[al.size()];
//		for(int i=0; i<al.size(); i++)
//		{
//			arr[i]=al.get(i);
		    //al,add(arr[i]);//converting array to arraylist
//		}
//		System.out.println(Arrays.toString(arr));
//		
//		Integer ai[]= new Integer[al.size()];
//		al.toArray(ai);
//		
//		System.out.println("Object Array: "+Arrays.toString(ai));//arrays utility class

	}

}
