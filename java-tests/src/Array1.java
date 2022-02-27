import java.util.Iterator;
import java.util.NoSuchElementException;

public class Array1<T>{
	private T[] a;

	public Array1(T[] a) {
		this.a = a;
	}

	private class iter1 implements Iterator<T>{
		int count = 0, go;
		int[] chosen;

		public iter1(int[] chosen) {
			this.chosen = chosen;
		}

		@Override
		public boolean hasNext() {
			return count < chosen.length;
		}

		@Override
		public T next() {
			if (!hasNext())
				throw new NoSuchElementException();
			go = chosen[count++];
			return a[go];
		}
	}

	public Iterator<T> iterator(int[] chosen) {
		return new iter1(chosen);
	}

	public static void main(String[] args) {
		String[] strs = { "A", "B", "C", "D", "E", "F" }; // create string array
		Array1<String> a1 = new Array1<>(strs); // show of this class with string inside
		int[] chosen = { 2, 1, 0, 5, 2, 1 }; // int array
		Iterator<String> it = a1.iterator(chosen); // insert the chosen array to interator of a1
		while (it.hasNext()) // while he has next print it!
			System.out.print(it.next());
		// CBAFCB
	}

}
