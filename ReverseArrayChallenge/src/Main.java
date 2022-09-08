import java.util.Arrays;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] array = new int[] {5, 6, 7, 8, 9, 10, 11, 12, 13};
		reverse(array);
	}
	
	public static void reverse(int[] array) {
		int temp;
		int rightSide = array.length - 1;
		System.out.println("At start, array is " + Arrays.toString(array));
		for(int i=0; i < (array.length)/2; i++) {
			temp = array[i];
			array[i] = array[rightSide - i];
			array[rightSide - i] = temp;
			System.out.println("Run through loop #" + (i + 1) + 
					": Array is now " + Arrays.toString(array));
		}
		System.out.println("At end, array is now " + Arrays.toString(array));	
	}

}
