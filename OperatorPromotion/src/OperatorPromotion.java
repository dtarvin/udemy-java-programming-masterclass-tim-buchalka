import java.util.*;

public class OperatorPromotion {

	public static void main(String[] args) {
//		StringBuilder sb = new StringBuilder("harness recall");
//		System.out.println(sb);
//		sb.replace(3, 5, "binger");
//		System.out.println(sb);
//		
//		StringBuilder one = new StringBuilder();
//		StringBuilder two = new StringBuilder();
//		StringBuilder three = one;
//		System.out.println(one == two);
//		System.out.println(one == three);
//		
//		int[] numbers = {6, 9, 1};
//		Arrays.sort(numbers);
//		System.out.println("Printing variable numbers: " + numbers);
//		System.out.println(Arrays.toString(numbers));
		
		System.out.println(Arrays.compare(new int[] {1}, new int[] {2})); // -1
		
		String[] s3 = {"Camel"};
		String[] s4 = {"Camel", null};
		System.out.println(Arrays.mismatch(s3, s4));
	}
}
