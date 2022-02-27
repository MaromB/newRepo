package hw6New;

public class Cascade {
	

	private class runi implements Runnable {
		private Thread t = new Thread();

		private static void justSleep(long millis) {
			try {
				Thread.sleep(millis);
			} catch (InterruptedException e) {
			}
		}
		
		public void setToWakeUp(Thread t) {
			this.t = t;
		}
		
		@Override
		public void run() {
			while (true) {
				justSleep(Long.MAX_VALUE);
				System.out.println(Thread.currentThread().getName());
				justSleep(1000);
				t.interrupt();
			}
		}
	}

	public void runExample(int n) {
		runi[] runners = new runi[n];
		Thread[] threads = new Thread[n];
		for (int i = 0; i < n; i++) {
			runners[i] = new runi();
			threads[i] = new Thread(runners[i]);
			if (i > 0)
				runners[i-1].setToWakeUp(threads[i]);
		}
		runners[n-1].setToWakeUp(threads[0]);
		for (Thread t : threads) {
			t.start();
		}
		threads[0].interrupt();
	}
	
	public static void main(String[] args) {
		new Cascade().runExample(3);
	}

}
