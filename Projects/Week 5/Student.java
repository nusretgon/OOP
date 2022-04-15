
public class Student {

	String name,surname;
	long id;
	static int count;
	
	Student(String name)
	{
		this.name=name;
	}
	Student(String name,String surname)
	{
		this(name);	// We are using constructor chain.
		this.surname=surname;
		
	}
	Student(String name,String surname,long no)
	{
		this(name,surname);
		count++;
		this.id=no;
	}
	Student (Student obj)	// We can clone our object to another object
	{
		this(obj.name,obj.surname,obj.id);	
	}
	public static void toUpper(Student obj)
	{
		obj.name=obj.name.toUpperCase();
		obj.surname=obj.surname.toUpperCase();
	}
	public static void main(String [] args)
	{
		Student s1=new Student("Nusret","Gon",1901);
		Student s2=new Student(s1);
		s2.id=12345678900L;
		s2.name="John";
		s2.surname="Doe";
		toUpper(s2);
		System.out.printf("%s%d", "Number of Students:",Student.count);
		
	}
}
