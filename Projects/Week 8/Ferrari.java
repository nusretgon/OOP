public class Ferrari extends Car implements ICabrio{

	@Override
	public void TavanTipi() {
		System.out.println("Metal tavan");
	}
	@Override
	void maxSpeed() {
		 System.out.println("Max speed: 400 km.");
	}
	
	
	public static void main() {
		Ferrari f1=new Ferrari();
		f1.maxSpeed();
		f1.TavanTipi();
		f1.engineVoice();
	}

}

