package multithreading;

public class TaskThreadMain {

	public static void main(String[] args) {


		Task t1 = new Task("AA");
		Task t2 = new Task("BB");
		Task t3 = new Task("CC");
		
		t1.setName("Thread A");
		t2.setName("Thread B");
		t3.setName("Thread C");
		
		t1.setPriority(5);
		t2.setPriority(8);
		t3.setPriority(3);
		
//		System.out.println("t1 start: "+t1.getState());
//		System.out.println("t1 is alive: "+t1.isAlive());
//		
//		t1.setDaemon(true);
		
		t1.start();
		
//			try {
//				t1.join();
//			} catch (InterruptedException e) {
//				// TODO Auto-generated catch block
//				e.printStackTrace();
//			}
		
		t2.start();
		t3.start();
		
		System.out.println("t2 state: "+t2.getState());
		
		System.out.println("t1 priority: "+t1.getPriority());
		
		t2.setPriority(10);
		System.out.println("t2 priority: "+t2.getPriority());
		
		System.out.println("t2 is alive: "+t2.isAlive());
		
		System.out.println("t1 is Deamon: "+t1.isDaemon());
		
		t2.interrupt();
		
		System.out.println("is interupted: "+t2.isInterrupted());
		
		System.out.println("state after interrupt "+t2.getState());

	}

}
