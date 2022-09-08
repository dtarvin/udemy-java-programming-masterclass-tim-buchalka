import java.util.function.Supplier;

public class SupplierInterfaceEx1 {

	public static void main(String[] args) {
		
		/* Example of creating and using Supplier without lambda */
		Supplier<String> name1 = new Supplier<String>() {
			@Override
			public String get() {
				return new String("David");
			}
		};
		
		System.out.println(name1.get());
		
		/* Example of creating and using Supplier with lambda */
		Supplier<String> name2 = () -> new String("Tarvin");
		
		System.out.println(name2.get());
		
		/* Example of creating and using Supplier with lambda and removing "new String()" from return */
		Supplier<String> name3 = () -> "Amy";
		
		System.out.println(name3.get());
	}
}
