public class test5 {
	private final String name;
	private final int rollNumber;
	private final int[] marks;

	public test5(String name, int rollNumber, int[] marks) {
		this.name = name;
		this.rollNumber = rollNumber;
		this.marks = marks;
	}

	public void printMarksDetails() {
		String[] subjects = {"English", "Mathematics", "Science", "Social Studies", "Computer"};
		int total = 0;
		boolean passed = true;

		System.out.println("\n--- Student Marks Details ---");
		System.out.println("Name: " + name);
		System.out.println("Roll Number: " + rollNumber);

		for (int i = 0; i < marks.length; i++) {
			System.out.println(subjects[i] + ": " + marks[i]);
			total += marks[i];
			if (marks[i] < 35) {
				passed = false;
			}
		}

		double average = total / (double) marks.length;
		String grade;
		if (!passed) {
			grade = "F";
		} else if (average >= 90) {
			grade = "A+";
		} else if (average >= 80) {
			grade = "A";
		} else if (average >= 70) {
			grade = "B";
		} else if (average >= 60) {
			grade = "C";
		} else if (average >= 50) {
			grade = "D";
		} else {
			grade = "E";
		}

		System.out.println("Total Marks: " + total + " / " + (marks.length * 100));
		System.out.printf("Average: %.2f%%%n", average);
		System.out.println("Grade: " + grade);
		System.out.println("Result: " + (passed ? "Pass" : "Fail"));
	}

	public static void main(String[] args) {
		java.util.Scanner input = new java.util.Scanner(System.in);

		System.out.print("Enter student name: ");
		String name = input.nextLine();
		System.out.print("Enter roll number: ");
		int rollNumber = input.nextInt();

		String[] subjects = {"English", "Mathematics", "Science", "Social Studies", "Computer"};
		int[] marks = new int[subjects.length];
		for (int i = 0; i < subjects.length; i++) {
			System.out.print("Enter marks in " + subjects[i] + " (0-100): ");
			marks[i] = input.nextInt();
		}

		test5 student = new test5(name, rollNumber, marks);
		student.printMarksDetails();
		input.close();
	}
}
