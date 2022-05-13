import java.util.ArrayList;
public class Main {

	public static void main(String[] args) {
		Interface1 intf1;
		ArrayList<Interface1> Lists = new ArrayList<Interface1>(10);
		for(int i=0;i<10;i++) {
			if (i%2==0) {
				intf1=new Cat();
			}
			else {
				intf1=new Dog();
			}
			Lists.add(intf1);
		}

		for(Interface1 i:Lists) {
			i.speak();
			i.swim();
			i.walk();
			
			/*
			if (i instanceof Cat){
			}
			else if (i instanceof Dog){
			}
			 
			 */
		}
	}

}
