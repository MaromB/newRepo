
public class Prizes{

	private int[] needed;

	public Prizes(int[] needed) {
		this.needed = needed;
	}
	
	private class createclass implements Account{
		int score=0;
		@Override
		public void incScore() {
			score++;
		}
		@Override
		public int getScore() {
			return score;
		}
		@Override
		public int prize() {
			int i;
			for(i=0;i<needed.length;i++)
				if(score < needed[i])
					return i;
			return i;
		}
	}

	public Account makeAccount() {
		return new createclass();
	}
	
	public static void main(String[] args) {
		Prizes prizes = new Prizes(new int[] { 2, 5});
		Account a1 = prizes.makeAccount();
		
	    for (int i = 0; i < 8; i++) {
		System.out.print(a1.getScore() + ":" + a1.prize()+" ");
		a1.incScore();
		}
	}

}
