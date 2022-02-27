import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.function.BinaryOperator;


public class Accumulate<E> implements Iterator<E> {
	
	private Iterator<E> itera;
	private BinaryOperator<E> op;
	private E val;
	private boolean first	= true;
	
	public Accumulate(Iterable<E> itera1, BinaryOperator<E> op) {
		itera = itera1.iterator();
		this.op = op;
	}

		@Override
		public boolean hasNext() {
			return itera.hasNext();
		}
		
		@Override
		public E next() {
			if (!hasNext())
				throw new NoSuchElementException();
			E current = itera.next();
			if (!first)
				current = op.apply(val, current);
			else
				first = false;
			val = current;
			return val;
		}

}
