
public class EnglishToMetricConverter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		calcFeetAndInchesToCentimeters(3, 4);
		calcFeetAndInchesToCentimeters(186);
	}
	
	public static double calcFeetAndInchesToCentimeters(double feet, double inches) {
		if (feet < 0 || inches < 0 || inches > 12) {
			return -1;
		}
		System.out.println("Feet is " + feet + " and inches is " + inches + ".");
		inches = (feet * 12) + inches;
		double centimeters = inches * 2.54;
		System.out.println("Centimeters are " + centimeters);
		return centimeters;
	}
	
	public static double calcFeetAndInchesToCentimeters(double inches) {
		if (inches < 0) {
			return -1;
		}
		System.out.println("Inches are initially " + inches);
		double feet = Math.floor(inches / 12);
		inches = inches % 12;
		System.out.println("The above mentioned inches convert to " + feet + " feet and " + inches + " inches.");
		double centimeters = calcFeetAndInchesToCentimeters(feet, inches);
		System.out.println("Total centimeters are " + centimeters);
		return centimeters;
	}

}
