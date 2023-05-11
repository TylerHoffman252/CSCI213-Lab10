/**
 * This is the Car class
 * @author Tyler Hoffman
 */
public class Car extends Vehicle{
	//declares instance variables
	private int numDoors;
	private int numPassengers;
	
	public Car(String make, String model, String plate, int doors, int passengers){
		//calls the super constructor
		super(make, model, plate);
		//sets the instance variables
		this.numDoors = doors;
		this.numPassengers = passengers;
	}
	
	public int getDoors(){
		return this.numDoors;
	}
	
	public int getPassengers(){
		return this.numPassengers;
	}
	
	/**
	 * Returns a string of Car class
	 * @return the string of Car Class
	 */
	@Override
	public String toString() {
		String result = String.format("%d - door %s %s with license %s", this.numDoors, super.getMake(), super.getModel(), super.getPlate());
		return result;
	}
	
	@Override
	public boolean equals(Object obj) {
		//if the obj is not a Car type
		if(!(obj instanceof Car)){
			return false;
		}
		
		//type casts the obj to Defense
		Car other = (Car) obj;
		
		//checks to see if all the instance variables of both are equal
		if(this.numDoors == other.numDoors){
			if(this.numPassengers == other.numDoors){
				return super.equals(other);
			}
		}
		
		return false;
	}
	
	public Car copy() {
		//creates a new object with the same variables
		Car newCar = new Car(super.getMake(), super.getModel(), super.getPlate(), this.numDoors, this.numPassengers);
		
		//returns the copy
		return newCar;
	}
}