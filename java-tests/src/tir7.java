import java.util.List;
import java.util.Random;
import java.util.random.*;

public class tir7 {
	private static Random myrand = new Random();
	
	
	public static <T> T randomMember(T[] arr) {
		int i= 	myrand.nextInt()%arr.length;
		return arr[i];		
		
	}
	
	public static <T> T randomMember(List<T> list) {
		int i= 	myrand.nextInt()%list.size();
		return list.get(i);
	}

}
