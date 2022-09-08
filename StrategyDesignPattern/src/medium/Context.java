package medium;

public class Context {

	private PackageStrategy packageStrategy;
	
	public void setStrategy(PackageStrategy	packageStrategy) {
		this.packageStrategy = packageStrategy;
	}
	
	public void executeStrategy(String destination, int timeToDestination) {
		packageStrategy.processPackage(destination, timeToDestination);
	}
}
