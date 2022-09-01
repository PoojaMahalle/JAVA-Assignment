package multithreading;

public class Task extends Thread {
	
	Task(String s)
	{
		super(s);
	}
	
	public void run()
	{
		for(int i=0; i<=5; i++)
		{
			System.out.println(Thread.currentThread().getName()+" "+i);
//			try {
//				Thread.sleep(1000);
//			} catch (InterruptedException e) {
//				// TODO Auto-generated catch block
//				e.printStackTrace();
//			}
			Thread.yield();
		}
		//System.out.println(Thread.currentThread().getState());
	}

}
