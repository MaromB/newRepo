import java.security.NoSuchAlgorithmException;
import java.util.NoSuchElementException;

public class test{

	public static int indexOf(Object[] a, Object o) {
		try {
		for (int i = 0; i < a.length; i++) {	
			if (o.equals(a[i]))
				return i;			
		}	
			}catch(NoSuchElementException e) {}
		return -1;
		
	}
	
	public static void main(String[] args) {
		Integer[] a = {3, 9, 11, 5, 12, 3, 6};
		int i = indexOf(a, new Object(){
			@Override
			public boolean equals(Object o) {
				return (Integer)o % 2 == 0;
				
			}
		});
		System.out.println(i);

	}
}
