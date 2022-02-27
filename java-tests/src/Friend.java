public class Friend {
	private String name;

	public Friend(String name) {
		this.name = name;
	}

	public synchronized void sayHA(Friend date) {
		System.out.format("%s says HA to %s%n", name, date.name);
		date.sayDA(this);
	}

	public synchronized void sayDA(Friend date) {
		System.out.format("%s says DA to %s%n", name, date.name);
		Thread.currentThread().interrupt();
	}
	
	public static void main(String[] args){
		Friend alice = new Friend("Alice");
		Friend bob = new Friend("Bob");
		class FriendRun implements Runnable {
			boolean someonewait = false;
							private Friend me, date;

				public FriendRun(Friend m, Friend d) {
					me = m;
					date = d;
				}
				@Override
				public synchronized void run() {
					
					if(someonewait==false) {
						someonewait=true;
						me.sayHA(date);
					}
					else {
						try {
							Thread.currentThread().sleep(Long.MAX_VALUE);
						}catch (InterruptedException e) {}
						someonewait=false;
						me.sayHA(date);
					}
					
				}
			}
		new Thread(new FriendRun(alice,bob)).start();
		new Thread(new FriendRun(bob,alice)).start();
	}	
}	


