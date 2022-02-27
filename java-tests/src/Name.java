
public class Name  implements Comparable<Name>{
	
	private String first;
	private String last;
	
	public Name(String first, String last) {
		this.first = first;
		this.last = last;
	}
	
	@Override
	public int compareTo(Name other) {
		if(last.equals(other.last))
			return first.compareTo(other.first);
		return last.compareTo(other.last);		
	}
	
	public String toString() {
		return first+" "+last;
	}

	
}
