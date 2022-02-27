public class Printer extends AbsPrinter {

	public Printer(int[][] a) {
		super(a);
	}
	
	@Override
	protected String func(int x) {
	Double s = Math.sqrt(x);
	return ""+s;
	}
	
	
}
