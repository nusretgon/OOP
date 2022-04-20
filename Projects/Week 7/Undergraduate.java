public class Undergraduate extends Student{

	Undergraduate(String name, int ID, double mid_term, double final_exam) {
		super(name, ID, mid_term, final_exam);
		System.out.println("I am a Undergraduate student.");
	}
	public void EvaluateGrade() {
		double grade=(mid_term*0.4)+(final_exam*0.6);
		if (grade>60) {
			System.out.println("You passed.");
		}
		else {
			System.out.println("You failed.");
}
}
}