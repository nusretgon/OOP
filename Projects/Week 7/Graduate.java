
public class Graduate extends Student{

	Graduate(String name, int ID, double mid_term, double final_exam) {
		super(name, ID, mid_term, final_exam);
		System.out.println("I am a graduate student.");
	}
	public void EvaluateGrade() {
		double grade=(mid_term*0.2)+(final_exam*0.8);
		if (grade>70) {
			System.out.println("You passed.");
		}
		else {
			System.out.println("You failed.");
}
}
}

