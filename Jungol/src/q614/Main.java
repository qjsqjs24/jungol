package q614;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String school = sc.next();
		int grade = sc.nextInt();
		sc. close();
		
		Student s1 = new Student();
		Student s2 = new Student();
		
		s1.setVar("Jejuelementary", 6);
		s2.setVar(school, grade);
		
		s1.print();
		s2.print();		
	}

}
 class Student {
	
	private String school;
	private int grade;
	
	public void setVar(String school, int grade) {
		this.school = school;
		this.grade = grade;
	}
		public void print() {

			System.out.print(grade+ " " + "grade in" + " " + school  + "School");
			
			
			
			
		}
}