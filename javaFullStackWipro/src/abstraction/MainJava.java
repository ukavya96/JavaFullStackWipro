package abstraction;

public class MainJava {

	 public static void main(String[] args) {
		    // Create an instance of Car as a Vehicle
		    Vehicle car = new Car();
		    // Create an instance of Motorcycle as a Vehicle
		    Vehicle motorcycle = new Motorcycle();

		    // Call the startEngine method on the car object
		    car.startEngine();
		    // Call the stopEngine method on the car object
		    car.stopEngine();

		    // Call the startEngine method on the motorcycle object
		    motorcycle.startEngine();
		    // Call the stopEngine method on the motorcycle object
		    motorcycle.stopEngine();
		  }
		} 