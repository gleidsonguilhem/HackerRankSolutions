import java.util.Arrays;

public class FunnyString {
	
	static String funnyStringCheck(String s) {
		
		char[] asc = s.toCharArray();
		
		String reverse = new StringBuilder(s).reverse().toString();
		char[] desc = reverse.toCharArray();
	    final int SIZE = s.length();
		
		int[] values = new int[SIZE];
		int[] valuesReversed = new int[SIZE];
		boolean x = true;
		
		for(int i = 0; i < SIZE-1; i++) {
			
			values[i] = Math.abs( (asc[i] - asc[i+1]) );
			valuesReversed[i] = Math.abs( (desc[i] - desc[i+1]) );
		}
		return Arrays.equals(values, valuesReversed) == true ? "Funny" : "Not Funny";	
	}
	
	public static void main(String[] args) {
		
		String a = "acxz";
		System.out.println(funnyStringCheck(a));		
		
	}
}
