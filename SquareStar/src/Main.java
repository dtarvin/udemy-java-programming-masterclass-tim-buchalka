
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		printSquareStar(8);
	}
	
	static void printSquareStar(int number) {
		if (number < 5) {
			System.out.print("Invalid Value");
		} else {
			int rowCount = number;	
			int columnCount = number;	
			for (int rowNumber=1; rowNumber<=rowCount; rowNumber++) {		
				for (int columnNumber=1; columnNumber<=columnCount; columnNumber++) {
					if (rowNumber==1 || rowNumber==rowCount) {
						if (columnNumber != columnCount) {
							System.out.print("*");
						} else {
							System.out.println("*");
						}
					} else if (columnNumber==1 || columnNumber==rowNumber || columnNumber==(rowCount-rowNumber+1)) {
						System.out.print("*");
					} else if (columnNumber==columnCount) {
						System.out.println("*");
					} else {
						System.out.print(" ");
					}
				}
			}
		}
	}

}
