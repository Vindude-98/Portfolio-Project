import java.util.Scanner;
import java.util.ArrayList;

public class Automobile {
	private String make;
	private String model;
	private String color;
	private int year;
	private int mileage;
	
	ArrayList<Automobile> inventoryList = new ArrayList<>();
	Scanner scnr = new Scanner(System.in);

	// Default constructor
	public Automobile() {
		make = "make";
		model = "model";
		color = "color";
		year = 0;
		mileage = 0;
	}
	
	// Parameterized constructor
	public Automobile(String make, String model, String color, int year, int mileage) {
		this.make = make;
		this.model = model;
		this.color = color;
		this.year = year;
		this.mileage = mileage;
	}
	
	
	// Getter and Setter methods for 'make'
	public String getMake() {
		return make;
	}
	
	public void setMake(String make) {
		this.make = make;
	}
	
	// Getter and Setter methods for 'model'
	public String getModel() {
		return model;
	}
	
	public void setModel(String model) {
		this.model = model;
	}
	
	// Getter and Setter methods for 'color'
	public String getColor() {
		return color;
	}
	
	public void setColor(String color) {
		this.color = color;
	}
	
	// Getter and Setter methods for 'year'
	public int getYear() {
		return year;
	}
	
	public void setYear(int year) {
		this.year = year;
	}
	
	// Getter and Setter methods for 'mileage'
	public int getMileage() {
		return mileage;
	}
	
	public void setMileage(int mileage) {
		this.mileage = mileage;
	}
	
	// Method to list current vehicle information
	public String[] listVehicleInfo() {
		return new String[] {
				"Make: " + this.make,
				"Model: " + this.model,
				"Color: " + this.color,
				"Year: " + this.year, 
				"Mileage: " + this.mileage
		};
	}
	
	// Method to add new vehicle
	public String addNewVehicle(String make, String model, String color, int year, int mileage) {
		try {
			this.make = make;
			this.model = model;
			this.color = color;
			this.year = year;
			this.mileage = mileage;
			return "Vehicle added successfully!";
		} catch(Exception e) {
			return "Error adding vehicle: " + e.getMessage();
		}
	}
	
	// Method to remove a vehicle
	public String removeVehicle() {
		try {
			this.make = "";
			this.model = "";
			this.color = "";
			this.year = 0;
			this.mileage = 0;
			return "Vehicle removed succesfully!";
		} catch (Exception e) {
			return "Error removing veheicle: " + e.getMessage();
		}
	}
	
	// Method to update vehicle attributes
	public String updateVehicleAttributes(String make, String model, String color, int year, int mileage) {
		try {
			this.make = make;
			this.model = model;
			this.color = color;
			this.year = year;
			this.mileage = mileage;
			return "Vehicle updated successfully!";
		} catch(Exception e) {
			return "Error updating vehicle: " + e.getMessage();
		}
	}
}
