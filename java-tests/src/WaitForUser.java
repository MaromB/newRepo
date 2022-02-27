import java.util.Scanner;

public class WaitForUser {
	private String str;
	
	public void letrun() {
		Runnable r = new execute();
		Thread t1 = new Thread(r);
		t1.start();
		try {
			t1.join();
		} catch (InterruptedException e) {}
		System.out.println(str);
	}
	
	
	public class execute implements Runnable{
		
		@Override
		public void run() {
			System.out.print("Give me string: ");
			Scanner s = new Scanner(System.in);
			str = s.nextLine();
		}

	}
	

	public static void main(String[] args) {
		new WaitForUser().letrun();
	}
}
