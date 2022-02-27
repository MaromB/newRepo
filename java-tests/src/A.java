
public class A <T>{

	protected T x;
	
	public A(T x) {
		this.x=x;
	}
	

	public T get() {
		return x;
	}
	
	public void use(Function2<? super T, ? extends T> f) {
		x=f.apply(x);
	}
	
	public void use(Function2<T, T> f, int num) {
		
		for(int i=0;i<num;i++) {
			use(f);
		}
		
	}
	
}
