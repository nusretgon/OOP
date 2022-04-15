
 class Product extends Item{	// Inheritance


	Product(String name, double price, int amount) {
		super(name, price, amount);
	}

	public double ComputeTaxedPrice()	// Polymorphism
	{
		return total+total*0.18;
	}
}
