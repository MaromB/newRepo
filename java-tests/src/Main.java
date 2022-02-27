
public class Main{
	
	public static int apply(int[] a, Func func) {
		for (int i=1; i<a.length; i++)
			a[i] = func.f(a[i]);
		a.toString();
		return 0;
	}

	public static int square(int[] a) {
		return apply(a, new forFunc());
	}

	public static void main(String[] args) {
		int [] a = {3,4,5,6,2};
		new Main().square(a);
	}
}
