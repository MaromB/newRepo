import java.util.Map;
import java.util.TreeMap;

public class PhoneBook{
	
	private Map<Name, String> book = new TreeMap<>();
	
	public String get(String first, String last) {
		return book.get(new Name(first,last));
	}
	

	public void put(String first, String last, String number) {
		book.put(new Name(first, last), number);
	}

	public String toString() {
		return book.toString();
	}
	
	public static void main(String[] args) {
		PhoneBook pb = new PhoneBook();
		pb.put("Yossi", "Cohen", "11");
		pb.put("Aviram", "Cohen", "22");
		pb.put("Shlomo", "Gronich", "33");
		System.out.println(pb.get("Yossi", "Cohen"));
		System.out.println(pb);
	}
}
