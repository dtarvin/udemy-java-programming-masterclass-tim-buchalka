import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		My version
//		Scanner scanner = new Scanner(System.in);
//		
//		int number = 0;
//		int minimum = 0;
//		int maximum = 0;
//		
//		while(true) {
//			System.out.println("Enter a number: ");
//			boolean isAnInt = scanner.hasNextInt();
//			if(isAnInt) {
//				number = scanner.nextInt();
//				if(number < minimum) {
//					minimum = number;
//				} else if(number > maximum) {
//					maximum = number;
//				}
//			} else {
//				System.out.println("The minimum number entered is " + minimum + " and the maximum number entered is " + maximum + ".");
//				break;
//			}
//			scanner.nextLine(); // handle end of line enter key
//		}
//		scanner.close();
		
		// instructor's version
		
		Scanner scanner = new Scanner(System.in);
		
		int min = 0;
		int max = 0;
		boolean first = true;
		
		// alternate solution not using boolean flag
//		 int min = 2147483647;
//		 int max = -2147483648;
		
		// can also do
//		int min = Integer.MAX_VALUE;
//		int max = Integer.MIN_VALUE;
		
		while(true) {
			System.out.println("Enter number: ");
			boolean isAnInt = scanner.hasNextInt();
			if(isAnInt) {
				int number = scanner.nextInt();
				
				// alternate solution not using boolean as flag
				// comment out if(first) block
				if(first) {
					first = false;
					min = number;
					max = number;
				}
				
				if(number > max) {
					max = number;
				}
				
				if(number < min) {
					min = number;
				}
			} else {
				break;
			}
			
			scanner.nextLine(); // handle input
		}
		System.out.println("min = " + min + ", max = " + max);
		scanner.close();
	}

}
