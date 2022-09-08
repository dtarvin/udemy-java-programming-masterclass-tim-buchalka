package tarvin;

public class Figure {
	private String name;
	private double price;
	private int quantity;
	private double subtotal;
	
	public Figure(String name, double price, int quantity) {
		this.name = name;
		this.price = price;
		this.quantity = quantity;
		this.subtotal = price * quantity;
	}
	
	public String getName() {
		return name;
	}
	
	public double getPrice() {
		return price;
	}
	
	public int getQuantity() {
		return quantity;
	}
	
	public double getSubtotal() {
		return subtotal;
	}
	
	public int updateQuantity(int additionalAmt) {
		this.quantity += additionalAmt;
		return this.quantity;
	}
}
