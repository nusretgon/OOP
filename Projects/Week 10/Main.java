package Week10;

import java.util.ArrayList;

public class Cnt {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList<Fly> list1= new ArrayList<Fly>();
		
		ArrayList<Animal> list2= new ArrayList<Animal>();
		
		Animal f1 = new  Anm1();
		list2.add(f1);
		
		Tiger f2 = new Tiger();
		list2.add(f2);

		f1 = new  Anm1();
		list2.add(f1);

		f1 = new  Anm1();
		list2.add(f1);

		f1 = new  Anm1();
		list2.add(f1);
		int i=0;
		for(Animal a: list2) {
			i++;
			System.out.println(i);
			a.Speak();
			if (a instanceof Fly ) {
				list1.add((Fly)a);
			}
			
			if (a instanceof Anm1 ) {
				
			}
		}
		
		System.out.println("Fly object number is " + list1.size());
	}

}
