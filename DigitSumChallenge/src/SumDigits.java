
public class SumDigits {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		System.out.println("The sum of the digits in number 125 is " + sumDigits(125));
//		System.out.println("The sum of the digits in number -125 is " + sumDigits(-125));
//		System.out.println("The sum of the digits in number 4 is " + sumDigits(4));
//		System.out.println("The sum of the digits in number 32123 is " + sumDigits(32123));
		
	}
	
//	My solution
	
	public static int sumDigits(int number) {
		int sum = 0;
		if (number < 10) {
//			System.out.println("number is less than 10, returning -1");
			return -1;
		}
//		System.out.println("Initial number is " + number);
		sum += (number % 10);
//		System.out.println("After modulus, sum = " + sum);
		while(number >= 10) {
			number /= 10;
//			System.out.print("In while loop, number after / 10 now " + number);
			sum += number % 10;
//			System.out.println("In while loop, after modulus, sum now " + sum);
		}
//		System.out.println("Final - sum is " + sum);
		return sum;
	}
	
	
//	Instructor solution
	
//	private static int sumDigits(int number) {
//		
//		if(number < 10) {
//			return -1;
//		}
//		
//		int sum = 0;
		
		// 125 -> 125 / 10 = 12 -> 12 x 10 = 120 -> 125 - 120 = 5
//		while (number >0) {
			// extract least significant digit
//			int digit = number % 10;
//			sum += digit;
			
			// drop the least significant digit
//			number /= 10; // same as number = number / 10;
//		}
//		
//		return sum;
//	}
	
}


