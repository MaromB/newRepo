import java.util.ArrayList;
import java.util.List;

public class TwoPhaseLock {
	
	private List<Thread> declares = new ArrayList<>();
	private List<Thread> waiting = new ArrayList<>();
	private Thread lock = null;
	
	
	public void declare(Thread t) {
		try {
			declares.add(t);
			t.wait();
		}catch (InterruptedException e) {}		
	}
	
	public void lock(Thread t) {
		if(!declares.contains(t)) 
			throw new IllegalArgumentException();
		if(lock == null) {
			t.notify();
			declares.remove(t);
			lock=t;
		}
		else {
			waiting.add(t);
		}
	}
	
	public void unlock() {
		lock=null;
		if(!waiting.isEmpty()) {
			Thread t = waiting.get(0);
			waiting.remove(t);
			t.notify();
			lock=t;
		}
	}
	
}
