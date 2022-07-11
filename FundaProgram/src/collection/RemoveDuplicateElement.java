package collection;

import java.util.ArrayList;

public class RemoveDuplicateElement {

	public static void main(String[] args) {
		ArrayList<Integer> al = new ArrayList<Integer>();
		
		al.add(1);
		al.add(2);
		al.add(3);
		al.add(4);
		al.add(1);
		al.add(5);
		al.add(6);
		al.add(7);
		al.add(1);
		al.add(8);
		System.out.println(al);
		
		ArrayList<Integer> al1 = new ArrayList<Integer>();
		
		for(int i=0; i<al.size(); i++)
		{
			int cnt=0;
			for(int j=0; j<al.size(); j++)
			{
				if(al.get(i)==al.get(i)&&j<i)
				{
					break;
				}
				else if(al.get(i)==al.get(j)&&j>=i)
				{
					cnt++;
				}
			}
			if(cnt!=0)
			{
				al1.add(al.get(i));
			}
		}
        System.out.println(al1);

	}

}
