public class Worker {
	public String name;
	public int ID;
	Worker (String name,int ID){
		this.name=name;
		this.ID=ID;
	}
	public static void main(String[] args) {
		Worker w1=new Worker("Nusret",1901);
		Worker w2=w1;		// We are not creating new object. We assign like new variable.
		w2.name="Gon";		// Here we are changing s1 and s2. Because they point same adreess.
		System.out.println(w1.name);	// We'll get Gon . 
	}
}
