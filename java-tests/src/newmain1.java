	import java.util.Arrays;
	import java.util.Iterator;
	import java.util.List;
	import java.util.function.BinaryOperator;

	public class newmain1 {
		
		public static void main(String[] args) {
			List<Integer> list = Arrays.asList(3, 5, 1, 2, 10, 7);
			Iterator<Integer> it = new Accumulate<>(list, new BinaryOperator<Integer>() {
				public Integer apply(Integer t1, Integer t2) {
					return t1 * t2;
				}
			});
			while (it.hasNext())
				System.out.print(it.next() + " ");
		}
	}

