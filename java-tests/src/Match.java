import java.util.HashMap;
import java.util.Map;

public class Match<E extends Valuable> {
	private Map<E, E> bo = new HashMap<E, E>();

	public boolean add(E e1, E e2) {
		if (bo.containsKey(e1) || bo.containsKey(e2))
			return false;
		bo.put(e1, e2);
		bo.put(e2, e1);
		return true;

	}

	public int val(E e) {
		E retit;
		if (!bo.containsValue(e))
			return e.value();
		retit = bo.get(e);
		return e.value() +retit.value(); 
	}
}