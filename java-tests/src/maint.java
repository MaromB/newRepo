//
//public class maint {
//	
//	public static void main(String[] args) {
//		
//		class RR implements Runnable {
//			private int sleepTime;
//			public RR(int sleepTime) { 
//				this.sleepTime = sleepTime;
//				}
//			public void run() {
//			try { 
//				Thread.sleep(sleepTime);
//				} catch (InterruptedException e) {}
//				System.out.println("Finished " + sleepTime);
//				}
//			}
//			runInParallel(new RR(1000), new RR(2000));
//			System.out.println("Done");
//	}
//
//}
