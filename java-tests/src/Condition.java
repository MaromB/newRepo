import java.util.Arrays;
import java.util.Collection;

public class Condition {
	private boolean flag = false;
	
	public synchronized void waitFor() throws InterruptedException{
		while(!flag)
			wait();
	}
	
	public synchronized void setTrue() {
		flag=true;	
		notify();
	}
	
	public static void waitForMany(Collection<Condition> conditions) throws InterruptedException{
		for(Condition i : conditions)
			while(!i.flag)
				i.wait();
	}
	
}
