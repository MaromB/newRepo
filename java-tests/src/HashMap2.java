import java.util.HashMap;

public class HashMap2 <K,V> extends HashMap<K,V>{
	
	private HashMap<K,V> map = new HashMap<K,V>();
	private V defaultValue;
	
	public void setDefault(V defaultValue) {
		this.defaultValue=defaultValue;
	}
	@Override
	public V put(K k, V v) {
		if(map.containsKey(k))
			throw new IllegalArgumentException();	
		return map.put(k, v);
		
	}
	@Override
	public V get(Object k) {
		if(map.get(k) != null)
			return map.get(k);
		return defaultValue; 
	}
	
	
	
	public static void main(String[] args) {
		
		HashMap2<String, Integer> hm = new HashMap2<>();
		hm.put("A", 1);
		hm.setDefault(10);
		System.out.println(hm.get("A") + " " + hm.get("B"));
		hm.setDefault(20);
		System.out.println(hm.get("A") + " " + hm.get("B"));
		hm.put("A", 2);
	}

}
