package Week10;

public class Tiger extends Animal implements  Runable{
	@Override
	public void Run() {
		System.out.println("Tiger can run");
	}

	public void Speak() {
		System.out.println("Heeeww");
	}

}
