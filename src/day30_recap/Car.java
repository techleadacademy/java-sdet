package day30_recap;

public class Car {
	private String model;
	private String color;
	private double price;
	
	public Car(String aModel, String aColor, double aPrice) {
		this.model = aModel;
		this.color = aColor;
		this.price = aPrice;
	}

	@Override
	public String toString() {
		return "Car [model=" + model + ", color=" + color + ", price=" + price + "]";
	}
	
}
