
public class Clock {
	private Thread t1;

	public Clock(int lapse, Runnable r) {
		t1 = new Thread(new Runnable() {
			@Override
			public void run() {
				try {
					while (true) {
						t1.sleep(lapse);
						r.run();
					}
				} catch (InterruptedException e) {
				}
				return;
			}

		});
		t1.start();
	}

	public void stop() {
		t1.interrupt();
	}

	public static void main(String[] args) throws InterruptedException {
		Clock clock = new Clock(500, new Runnable() {
			private int i = 0;

			public void run() {
				System.out.println("Hopa Hey " + i++);
			}
		});
		Thread.sleep(1700);
		clock.stop();
	}

}
