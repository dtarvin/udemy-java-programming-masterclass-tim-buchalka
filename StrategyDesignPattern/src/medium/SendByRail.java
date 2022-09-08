package medium;

public class SendByRail implements PackageStrategy {

	@Override
	public void processPackage(String destination, int timeToDestination) {
		System.out.println("The package will go by rail with a destination of " + destination + " station. The journey is expected to take " + timeToDestination + " minutes.");
	}

}
