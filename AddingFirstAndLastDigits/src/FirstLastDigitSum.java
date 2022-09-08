
public class FirstLastDigitSum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		sumFirstAndLastDigit(-10);
	}
	
	public static int sumFirstAndLastDigit(int number) {
		int sum = 0;
		
		if (number < 0) {
			return -1;
		}
		sum += number % 10;
		
		while (number >= 10) {
			number /= 10;
		}
		
		sum += number;
		return sum;
	}

}
