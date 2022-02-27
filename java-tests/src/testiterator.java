import java.util.Iterator;
import java.util.NoSuchElementException;

public class testiterator implements Iterable<String> {

	private String[] a = new String[100];

	public void set(int index, String s) {
		a[index] = s;
	}

	@Override
	public Iterator<String> iterator() {
		return new Iterator<String>() {
			private int current = 0;

			@Override
			public boolean hasNext() {
				while (current < a.length && a[current] == null)
					current++;
				return current < a.length;
			}

			@Override
			public String next() {
				if (!hasNext()) {
					throw new NoSuchElementException();
				}
				return a[current++];

			}
		};
	}

	public static void main(String[] args) {
		testiterator a = new testiterator();
		a.set(72, "rob I");
		a.set(3, "pirates");
		a.set(50, "yes");
		a.set(70, "they");
		a.set(1, "old");
		for (String s : a)
			System.out.print(s + " ");

	}
}
