
public abstract class Car {       // It's abstract class.
	public int numOfGear;
	public String brand;
	abstract void maxSpeed();
	void engineVoice() {		// If we want we can add body to function in abstract class. Our choice.
		System.out.println("Engine Voice");
	}
}
