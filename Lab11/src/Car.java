import java.util.ArrayList;
import java.util.Scanner;

class Car{
	private String make;
	private String model;
	private int year;
	private double price;
	public String getMake() {
		return make;
	}
	public void setMake(String make) {
		this.make = make;
	}
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	public int getYear() {
		return year;
	}
	public void setYear(int year) {
		this.year = year;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	@Override
	public String toString() {
		return  make + "\t" + model + "\t" + year + "\t" + price;
	}
	public Car(String make, String model, int year, double price) {
		this.make = make;
		this.model = model;
		this.year = year;
		this.price = price;
	}
	
	public Car(){
		this.make = null;
		this.model = null;
		this.year = 0;
		this.price = 0.0;
	}
}