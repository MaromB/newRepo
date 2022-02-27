import java.util.Set;
import java.util.TreeSet;

public class Book implements Comparable<Book> {
	private String author;
	private String title;

	public Book(String author, String title) {
		this.author = author;
		this.title = title;
	}

	public String toString() {
		return author + " : " + title;
	}

	@Override
	public int compareTo(Book o) {
		if(author.equals(o.author))
			return title.compareTo(o.title);
		return author.compareTo(o.author);
	}
	
	public static void main(String[] args) {
		Set<Book> s = new TreeSet<>();
		s.add(new Book("Lewis Carol", "Alice in WonderLand"));
		s.add(new Book("Dickens", "Oliver Twist"));
		s.add(new Book("Dickens", "A Tale of Two Cities"));
		System.out.println(s);

	}

}
