package Week10;

public class Animal1 extends Animal implements Fly, Runable{
	@Override
	public void Flying() {
		System.out.println("Flying");
	}
	
	@Override
	public void Run() {
		System.out.println("Run");
	}
	
	@Override
	public void Speak() {
		System.out.println("Speak");
	}
}
