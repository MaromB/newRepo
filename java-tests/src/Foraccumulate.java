
public class Foraccumulate{
	

	public static <E extends T,T> T accumulate(E[] a, Func2<T> func) {
		if(a.length == 1)
			return a[0];
		T back= a[0];
		for(int i=1;i<a.length;i++)
			back=func.f(back,a[i]);
		return back;	
	}

	public static int sum(Integer[] a) {
		int summ=0;
		
		summ=accumulate(a,new Func2<Integer>() {
			@Override
			public Integer f(Integer e1, Integer e2) {
				return e1+e2;			
				}			
			});
		
		return summ;
	}
	
	public static void main(String[] args) {
		Integer[] a = { 1, 5, -2, 10, 2 };
		System.out.println(sum(a));
	}	

}
