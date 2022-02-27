
public class DoubleMonitor {
	private int count = 0,count2=0;
	public synchronized void wait1() {
		count++;
		try {
			wait();
		} catch (InterruptedException e) {}
		count--;	
	}
	public synchronized void wait2() {
		count2++;
		try {
			wait();
		} catch (InterruptedException e) {}
		count2--;	
	}
	
	public synchronized void pNotify() {
		if(count >0) {
			notify();
			return;
		}
		if(count2 >0) 
			notify();
		return;
		
		
	}
	
}
