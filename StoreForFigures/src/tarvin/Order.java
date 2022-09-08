package tarvin;

import java.util.ArrayList;

public class Order {
	private int orderNumber;
	private ArrayList<Figure> figures;
	private double total;
	
	public Order(int orderNumber) {
		this.orderNumber = orderNumber;
		this.figures = new ArrayList<Figure>();
		this.total = 0;
	}
	
	public int getOrderNumber() {
		return orderNumber;
	}
	
	public ArrayList<Figure> getFigures() {
		return figures;
	}
	
	public double getTotal() {
		return total;
	}
	
	public void addFigureToOrder(Figure figure) {
		String figureName = figure.getName();
		Figure existingFigure = findFigure(figureName);
		if(existingFigure == null) {
			this.figures.add(figure);
			this.total += figure.getSubtotal();
		} else {
			existingFigure.updateQuantity(figure.getQuantity());
		}
	}
	
	private Figure findFigure(String figureName) {
		for(int i=0; i < figures.size(); i++) {
			Figure checkedFigure = this.figures.get(i);
			if(checkedFigure.getName().equals(figureName)) {
				return checkedFigure;
			}
		}
		return null;
	}
}
