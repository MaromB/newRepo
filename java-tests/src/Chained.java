import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;

public class Chained<E> implements Iterable<E> {
	private Iterable itb1, itb2;

	public <E1,E2 extends E> Chained(Iterable<E1> itb1, Iterable<E2> itb2) {
		this.itb1 = itb1;
		this.itb2 = itb2;
	}

	private class Iteratormy implements Iterator<E> {
		Iterator<E> a1 = itb1.iterator();
		Iterator<E> a2 = itb2.iterator();
		@Override
		public boolean hasNext() {

			return a1.hasNext() || a2.hasNext();
		}

		@Override
		public E next() {
			if (!hasNext()) {
				throw new NoSuchElementException();
			}
			if (a1.hasNext())
				return a1.next();
			return a2.next();
		}
	}

	@Override
	public Iterator<E> iterator() {
		return new Iteratormy();
	}

	public static void main(String[] args) {
		List<String> l1 = Arrays.asList("A", "B", "C");
		List<String> l2 = Arrays.asList("d", "e", "f");
		Iterable<String> l12 = new Chained<>(l1, l2);
		for (String s : l12)
			System.out.print(s + " ");
		for (String s : l12)
			System.out.print(s + " ");
	}

}
