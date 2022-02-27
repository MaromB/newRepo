
public class Aplus <T> extends A<T>{
	
	private int count=0;
	
	public Aplus(T x) {
		super(x);
	}
	
	@Override
	public void use(Function2<? super T, ? extends T> f) {
		super.use(f);
		count++;
	}
	
	public int getCount() {
		return count;
	}
	
	public static void main(String[] args) {
		Aplus<Integer> a = new Aplus<>(10);
		class Mult2 implements Function2<Integer, Integer> {
		public Integer apply(Integer t) { return t * 2; }
		}
		a.use(new Mult2());
		a.use(new Mult2(), 4);
		System.out.println(a.get() + " : " + a.getCount());
	}
}
