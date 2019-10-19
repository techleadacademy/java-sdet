package day20;

public class Student {
	private String firstName;
	private String lastName;
	private String subject;
	private int score;
	private String address;
	
	public Student(String firstName, String lastName, String subject, int score, String address) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.subject = subject;
		this.score = score;
		this.address = address;
	}
	
	public String printDetails() {
		return firstName+" "+lastName+" "+subject+" "+score+" "+address;
	}
}
