package day23_assignment;


public class Course {
	private String name;
	private Student[] student;
	private int currentNumberOfStudents;
	
	public Course(String courseName, int courseCapasity) {
		if(courseName != null && !courseName.isEmpty() && courseCapasity > 0) {
			this.name = courseName;
			this.student = new Student[courseCapasity];
		} else {
			System.out.println("Wrong input. New Course did not created");
		}
	}
	
	public void addStudent(Student newStudent) {
		this.student[currentNumberOfStudents] = newStudent;
		currentNumberOfStudents++;
	}
	
	public void removeStudent(int studentId) {
		Student[] studentCopy = new Student[this.student.length - 1];
		
		for(int i = 0; i < this.student.length; i++) {
			if(this.student[i] != null && this.student[i].studetntId != studentId) {
				studentCopy[i] = this.student[i];
			}
		}
		
		this.student = studentCopy;
		this.currentNumberOfStudents--;
		
	}
	
	public int getActualNumberOfStudents() {
		// TODO your code goes here
		// Write a logic to get actual number of students from our array student
		// if we will use student.length we will get courseCapasity (max number)
		// but we need actual number of added students
		// Think about default value of String and how we can use loop with if else statements
		// Do not return currentNumberOfStudents. it would to easy :) 
		return currentNumberOfStudents;
	}
	
	public void printAllStudents() {
		System.out.println(this.name + " Course Students:");
		
		for(Student student : this.student) {
			if(student != null) {
				System.out.println(student);
			}
		}
		
	}
	
	public Student getStudentWithHighestScore() {
		Student max = this.student[0];
		
		for(Student st : this.student) {
			if(st != null && max.score < st.score) {
				max = st;
			}
		}
		
		return max;
	}
	
	public Student getStudentWithLowestScore() {
		// TODO your code goes here
		// Write a logic to return Student with lowest score 
		return null;
	}
	
	public double getAverageScore() {
		// TODO your code goes here
		// Write a logic to return average score from all students
		return 0.0;
	}
	
	

	@Override
	public String toString() {
		return "Course [name=" + name + ", student =" + student + ", currentNumberOfStudents="
				+ currentNumberOfStudents + "]";
	}
	
	
}