import java.util.NoSuchElementException;

public class Flag {
	private int range,valflag=0;
	
	public Flag(int range) {
		this.range = range;
	}
	
	public boolean checkrange(int val) {
		if(0 <= val && val <= range-1)
			return true;
		throw new IllegalArgumentException();	
	}
	
	public synchronized void set(int val){
		checkrange(val);	
		valflag = val;
		notifyAll();
	}
	
	public synchronized void waitFor(int val){
		checkrange(val);
		while(valflag != val)
			try {
				wait();
			}catch(InterruptedException e) {}
	}
	
	public static void main(String[] args) {
		Flag flag = new Flag(10);
		Thread t1 = new Thread(new Runnable() {
			public void run() {
				for (int i = 0; i < 6; i += 2) {
				    flag.waitFor(i);
				    System.out.print("A" + i);
				    flag.set(i+1);
				}
			}
		});
		
		t1.start();
		Thread t2 = new Thread(new Runnable() {
			public void run() {
				for (int i = 1; i < 6; i += 2) {
				    flag.waitFor(i);
				    System.out.print("B" + i);
				    flag.set(i+1);
				}
			}
		});
		t2.start();
		
	}
	//A0B1A2B3A4B5
}
