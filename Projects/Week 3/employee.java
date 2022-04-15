public class employee {
	int fee;
	int id;
	String name;
	employee (int fee,int id,String name){ // This is constructor
		this.fee=fee;
		this.id=id;
		this.name=name;
	}
	public void whoAmI() {
		System.out.println("My name is "+name+" and my id is "+id+".");
	}

}
