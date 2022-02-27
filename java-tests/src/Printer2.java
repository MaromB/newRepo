public class Printer2 extends AbsPrinter {

	public Printer2(int[][] a) {
		super(a);
	}

	@Override
	protected String func(int x) {
		int s = 2*x;	
		return ""+s;
	}
	

}
