package hw6New;

public class exampleExchange {
	
	private Exchange<String> exchange = new Exchange<>();

	class runi1 implements Runnable {
		
		@Override
		public void run() {
			System.out.println("Runner1");
			System.out.println("Runner1 got: " + exchange.give1("Hi1"));
		}
	}

	class runi2 implements Runnable {

		@Override
		public void run() {
			System.out.println("Runner2");
			System.out.println("Runner2 got: "+ exchange.give2("Hi2"));
		}
	}
	
	public void runIt() {
		Thread t1 = new Thread(new runi1());
		Thread t2 = new Thread(new runi2());
		t1.start();
		t2.start();
	}
	
	public static void main(String[] args) {
		new exampleExchange().runIt();
		
	}

}
