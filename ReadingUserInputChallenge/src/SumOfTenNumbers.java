import java.util.Scanner;

public class SumOfTenNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		addTenNumbers();
		
//		Solution
		Scanner scanner = new Scanner(System.in);
		
		int counter = 0;
		int sum = 0;
		
		while(true) {
			int order = counter + 1;
			System.out.println("Enter number #" + order + ": ");
			boolean isAnInt = scanner.hasNextInt();
			if(isAnInt) {
				int number = scanner.nextInt();
				counter++;
				sum += number;
				if(counter == 10) {
					break;
				}
			} else {
				System.out.println("Invalid Number");
			}
			
			scanner.nextLine(); // handle end of line enter key	
		}
		System.out.println("Sum == " + sum);
		scanner.close();
	}
	
//	My code which didn't work
//	public static void addTenNumbers() {
//		Scanner scanner = new Scanner(System.in);
//		int sum = 0;
//		int number = 0;
//		for (int i = 1; i <= 10; i++) {
//			System.out.print("Enter number #" + i + " ");
//			number = scanner.nextInt();
//			while (!scanner.hasNextInt(number)) {
//				System.out.println("Invalid Number");
//				System.out.print("Enter number #" + i + " ");
//			}
//			scanner.nextLine();
//			
//			sum += number;
//		}
//		scanner.close();
//		System.out.println("The sum of the ten numbers is " + sum);
//	}

	
}
