package multithreading;

import java.util.Iterator;
import java.util.concurrent.ConcurrentHashMap;

public class ConcurrentHashMapExample extends Thread {
	
	static ConcurrentHashMap<Integer,String> chm;
	ConcurrentHashMapExample()
	{
		chm= new ConcurrentHashMap<>();
		chm.put(1, "A");
		chm.put(2, "B");
		chm.put(3, "C");
	}
	
	public void run()
	{
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		chm.put(4, "D");
	}

	public static void main(String[] args) {
		
     Thread t1 = new ConcurrentHashMapExample();
     t1.start();
     
     Iterator itr = chm.entrySet().iterator();
     while(itr.hasNext())
     {
    	 System.out.println(itr.next());
    	 try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
     }
	}

}
