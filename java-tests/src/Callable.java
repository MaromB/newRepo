
public abstract class Callable <E> implements Runnable{
		
	private E back=null;
	private boolean ready = false;
	
	protected abstract E call();
	
	public boolean isReady(){
		return ready;
	}
	
	public E waitForValue() throws InterruptedException{
		while(!isReady())	
			wait();
		return back;	
	}
	
	@Override
	public void run() {
		E val = call();
		synchronized (this) {
			back = val;
			ready = true;
			notifyAll();
		}
	}
	
//	public static void main(String[] args) {
//		
//		Callable<String> c = new Callable<String>() {
//			protected String call() {
//				Thread.sleep(5000);
//				return "AAA";
//			}};
//		new Thread(c).start();
//		Thread.sleep(1000);
//		System.out.println(c.isReady());
//		System.out.println(c.waitForValue());
//		System.out.println(c.isReady());
//				
//	}

}
