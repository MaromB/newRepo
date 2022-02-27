
public class lockThreads {
	private int c=0;
	private Object lock = new Object();
	
	public void runExample() {
		Runnable r = new myRun();
		Thread t1 = new Thread(r);
		Thread t2 = new Thread(r);
		t1.start();
		t2.start();
		
		try{
			t1.join();
			t2.join();
		}catch (InterruptedException e) {}
		System.out.println(c);		
		
	}
	
	public class myRun implements Runnable{

		@Override
		public void run() {
			for(int i=0;i<10000;i++)
				synchronized (lock) {
					c++;					
				}
		}
		
	}
	
	public static void main(String[] args) {
		new lockThreads().runExample();
	}

}
