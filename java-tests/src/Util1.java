import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Util1 {
	

	public static <K,V> HashMap<K,V> associateWith(Collection<K> keys, Function3<K,V> f) {
		HashMap<K,V> backit = new HashMap<>();
		for(K i : keys)
			backit.put(i,f.apply(i));
		return backit;
	}

	public static void main(String[] args) {
		List<Integer> list = Arrays.asList(1, 7, 10, 2, 3);
		Map<Integer, Integer> map = Util1.associateWith(list, new Function3<Integer, Integer>() {
		@Override
		public Integer apply(Integer t) {
		return t * t;
		}
		});
		System.out.println(map);
	}
}
