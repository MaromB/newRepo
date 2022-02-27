import java.util.Scanner;

public class tir6 {
	private String[] arr;
	private int num;

	public tir6(int size) {
		arr = new String[size];
	}

	public void add(String s) throws StringSet.StringSetFullException{
		if(s == null)
			throw new NullPointerException(); 
		if(num == arr.length)
			//throw new StringSetFullException(); 
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
		while(true) {
		  	String str = sc.next();
		  	if (str.equals("Done"))
		        	break;
			else
				try {
					set.add(str);
				} catch (StringSet.StringSetFullException e) {					
					System.err.println("error");
				}  			
		}

	}
	
}
