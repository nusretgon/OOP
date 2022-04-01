package employee;

public class employe {
	int fee;
	int id;
	String name;
	employe (int fee,int id,String name){
		this.fee=fee;
		this.id=id;
		this.name=name;
	}
	public void whoAmI() {
		System.out.println("My name is "+name+" and my id is "+id+".");
	}

}
