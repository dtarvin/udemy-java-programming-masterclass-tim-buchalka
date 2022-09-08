import java.util.function.Supplier;

public class SupplierInterfaceEx2 {

	public static void main(String[] args) {
				
		System.out.println(name1.get());
		
		/* Example of creating and using Supplier with lambda */
		Supplier<String> name2 = () -> new String("Tarvin");
		
		System.out.println(name2.get());
		
		/* Example of creating and using Supplier with lambda and removing "new String()" from return */
		Supplier<String> name3 = () -> "Amy";
		
		System.out.println(name3.get());
	}
	
	public void printUser(Supplier<User> userSupplier) {
		System.out.println(userSupplier.get());
	}
}
