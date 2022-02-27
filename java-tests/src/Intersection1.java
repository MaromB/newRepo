import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Intersection1 {

	public static <V> V[] intersectAll(V[] a, V[] b, Intersection<V> c) {
		return c.Intersect(a, b);
	}

	public static List<Integer[]> intersect(List<Integer[]> list1, List<Integer[]> list2) {
		List<Integer[]> result = new ArrayList<>();
		for (int i = 0; i < list1.size(); i++) {
			result.add(intersectAll(list1.get(i), list2.get(i), new Intersection<Integer>() {
				@Override
				public Integer[] Intersect(Integer[] a1, Integer[] a2) {
					Integer[] res = null;
					int size = 0;
					for (int i = 0, k = 0; i < a1.length; i++) {
						for (int j = 0; j < a2.length; j++) {
							if (a1[i] == a2[j]) {
								if (res == null)
									res = new Integer[++size];
								else
									res = Arrays.copyOf(res, ++size);
								res[size - 1] = a1[i];
							}
						}
					}
					return res;
				}
			}));
		}
		return result;
	}

	public static void main(String[] args) {
		List<Integer[]> list1 = new ArrayList<>();
		Integer[] arr1 = { 4, 3, 2, 1 };
		Integer[] arr2 = { 5, 3, 6, 2 };
		list1.add(arr1);
		list1.add(arr2);
		List<Integer[]> list2 = new ArrayList<>();
		Integer[] ar1 = { 8, 3, 4, 5 };
		Integer[] ar2 = { 6, 1, 7, 2 };
		list2.add(ar1);
		list2.add(ar2);
		List<Integer[]> res = intersect(list1, list2);
		for (Integer[] item : res)
			System.out.println(Arrays.toString(item));
	}
}
