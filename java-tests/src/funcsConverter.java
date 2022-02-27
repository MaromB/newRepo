import java.util.Arrays;

public class funcsConverter  {
	
	public static <A, B> void convertAll(A[] as, B[] bs, Converter<A, B> c) {
		for(int i=0;i<as.length;i++)
			bs[i] =  c.convert(as[i]);
	}
	
	public static Double[] squareRoots(Integer[] nums) {
		
		Double[] res = new Double[nums.length];
		convertAll(nums,res, new Converter<Integer,Double>(){
			public Double convert(Integer back) {
				return Math.sqrt(back);
			}
		}						
				);
		return res;
		
	}
	
	
	public static void main(String[] args) {
		Integer[] nums = {4, 2, 19, 25, 3};
		System.out.println(Arrays.toString(squareRoots(nums)));
	}
	//[2.0, 1.4142135623730951, 4.358898943540674, 5.0, 1.7320508075688772]
}
