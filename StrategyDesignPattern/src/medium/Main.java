package medium;

public class Main {

	public static void main(String[] args) {
		Context context = new Context();
		context.setStrategy(new SendByRail());
		context.executeStrategy("Trafalger", 65);
		
		context = new Context();
		context.setStrategy(new SendByBike());
		context.executeStrategy("1001 Centennial St., Suite 305", 25);
	}

}

