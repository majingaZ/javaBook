import java.util.Scanner;

class School {
	private String name;
	private String school;
	private int grade;

	public School(String name, String school, int grade) {
		this.name = name;
		this.school = school;
		this.grade = grade;
	}

	public void print() {
		System.out.println("Name : " + name);
		System.out.println("School : " + school);
		System.out.println("Grade : " + grade);
	}
}

public class Main {
	 	// Songjunghyuk Beolmal 6
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String name = sc.next();
		String school = sc.next();
		int grade = sc.nextInt();
		sc.close();
		School sh = new School(name, school, grade);
		sh.print();
	}
}