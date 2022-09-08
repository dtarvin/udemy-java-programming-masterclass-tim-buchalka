package medium;

public class SendByBike implements PackageStrategy {
	
	public void processPackage(String destination, int timeToDestination) {
		System.out.println("The package will be delivered by bike messenger to " + destination + " in about " + timeToDestination + " minutes");
	}

}
