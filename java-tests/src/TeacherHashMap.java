import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class TeacherHashMap {
	
	private Map<String, HashSet<Course>> map = new HashMap<>();
	
	public void put (String teacher,String course) {
		if(!map.containsKey(teacher))
			map.put(teacher,new HashSet<>());
		map.get(teacher).add(new Course(teacher,course));
	}
	
	@Override
	public String toString() {
		return map.toString();
	}
			
	public static void main(String[] args) {
		TeacherHashMap s = new TeacherHashMap();
		s.put("Lior Suchard","Introduction to illusion");
		s.put("Lior Suchard","How to be a mentalist");
		s.put("Yair Tel-Tsur","Computer networking");
		System.out.println(s);
	}
}

//{Lior Suchard=[Introduction to illusion, How to be a mentalist], Yair
//Tel-Tsur=[Computer networking]}