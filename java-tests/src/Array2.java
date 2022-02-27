import java.util.Iterator;
import java.util.NoSuchElementException;

public class Array2<E> implements Iterable<E> {
	private E[] a;
	boolean temp = true;
	
	public void setForward(boolean val) {
		boolean temp = val;
	}

	public Array2(E[] a) {
		this.a = a;
	}



	@Override
	public Iterator<E> iterator(){
		if(temp) {
			return new Iterator<E>() {
				private int count=0;
				
				@Override
				public boolean hasNext() {
					return count< a.length;
				}
				
				@Override
				public E next() {
				if(!hasNext())
					throw new NoSuchElementException();
				return a[count++];
				
				}				
			};
			
		}
		else {
			return new Iterator<E>() {
				private int count=a.length-1;
				
				@Override
				public boolean hasNext() {
					return count > 0;
				}
				
				@Override
				public E next() {
				if(!hasNext())
					throw new NoSuchElementException();
				return a[count--];
				
				}				
				
			};
			
		}
		
	}

	public static void main(String[] args) {
		Integer[] a = { 1, 2, 3 };
		Array2<Integer> arr = new Array2<>(a);
		arr.setForward(true);
		for (int i : arr) {
			arr.setForward(false);
			for (int j : arr)
				System.out.format("(%d,%d) ", i, j);
		}

	}

}
