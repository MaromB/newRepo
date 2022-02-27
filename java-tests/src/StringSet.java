import java.util.Scanner;

public class StringSet {
	
	private static final long serialVersionUID = 1L;
	private String[] arr;
	private int num;
	
	public StringSet(int size) {
		arr = new String[size]; 
		}
	
	public void add(String s) throws StringSetFullException{
		if(s == null)
			throw new NullPointerException();
		if(num == arr.length)
			throw new StringSetFullException();
		arr[num++] = s;	
		}
	
	public boolean contains(String s) {
		if(s == null)
			throw new NullPointerException();
		for (int i = 0; i < num; i++)
			if (arr[i].equals(s))
				return true;
		return false;
	}
	
	public static void main(String[] args) {
		StringSet set = new StringSet(5);
		Scanner sc = new Scanner(System.in);
		try {
		while(true) {
		  	String str = sc.next();
		  	if (str.equals("Done"))
		        	break;
		  	else
		        	set.add(str);
		}
		}catch (StringSetFullException e) {
			System.out.println("Set is too full..");
		}
	}
	class StringSetFullException extends Exception {
	}
}

