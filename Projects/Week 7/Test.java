
public class Test {

	public static void main(String[] args) {
		Student s1=new Student("Nusret",1901,100,60);
		Student s2=new Graduate("Nusret",1901,90,60);
		Student s3=new Undergraduate("Nusret",1901,80,60);
		s1.EvaluateGrade();
		s2.EvaluateGrade();
		s3.EvaluateGrade();

	}

}
