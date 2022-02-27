
public abstract class AbsPrinter {
	protected int[][] a;
	
	public AbsPrinter(int[][] a) {
		this.a = a;
	}
	
	public void doAll() {
		for (int i = 0; i < a.length; i++)
			for (int j = 0; j < a.length; j++)
				System.out.println(func(a[i][j]));
	}

	protected abstract String func(int x);
	
	public static void main(String[] args) {
		int[][] a = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 }};
		AbsPrinter r = new Printer(a);	
		r.doAll();
	}
}