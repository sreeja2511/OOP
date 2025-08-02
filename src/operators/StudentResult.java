package operators;

public class StudentResult {
	public static void main(String args[]) {
		int theoryMarks = 45, practicalMarks = 30;
        if (theoryMarks >= 35 && practicalMarks >= 25) {
            System.out.println("Student Passed both Theory and Practical");
        } else {
            System.out.println("Student Failed");
        }
	}

}
