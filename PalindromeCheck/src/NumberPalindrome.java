
public class NumberPalindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		isPalindrome(-1221);
		isPalindrome(707);
		isPalindrome(11212);
	}
	
	public static boolean isPalindrome(int number) {
		
		int origNumber = number;
		if (number < 0) {
			number = -number;
		}
		
		int reverse = 0;
		int lastDigit = 0;
		
		while (number > 0) {
			
			lastDigit = number % 10;	
			reverse += lastDigit;
			
			if (number >= 10) {
				reverse *= 10;
			}
			
			number /= 10;
			
		}
		if (origNumber < 0) {
			reverse = -reverse;
		}
		if (reverse == origNumber) {
			System.out.println("The original number " + origNumber + " is a palindrome of the reversed number " + reverse);
			return true;
		}
		System.out.println("The original number " + origNumber + " is not a palindrome of the reversed number " + reverse);
		return false;
	}

}
