
public class Service extends Item {	// Inheritance

	Service(String name, double price, int amount) {
		super(name, price, amount);
		// TODO Auto-generated constructor stub
	}

	public double ComputeTaxedPrice()	// Polymorphism
	{
		return total+total*0.01;
	}
}
