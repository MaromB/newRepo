import java.util.Iterator;
import java.util.NoSuchElementException;

public class ShortStringArray implements Iterable<String> {

	private String[] a = new String[100];
	private int length, index = 0;

	public ShortStringArray(int length) {
		this.length = length;
	}

	private class iterable1 implements Iterator<String> {
		private int index = 0;

		@Override
		public boolean hasNext() {
			return index<a.length;
		}

		@Override
		public String next() {
		
			while(a[index].length() >= length)
				index++;
			if (!hasNext()) {
				throw new NoSuchElementException();
			}
					return a[index];
		}
	}

	@Override
	public Iterator<String> iterator() {
		return new iterable1();
	}

	public void add(String s) {
		a[index++] = s;
	}

	public static void main(String[] args) {
		ShortStringArray a = new ShortStringArray(5);
		a.add("rob I");
		a.add("pirates");
		a.add("yes");
		a.add("they");
		a.add("old");
		for (String s : a)
			System.out.print(s + " ");
	}
}