package day21;

public class StudentDemo {
	public static void main(String[] args) {
		Student st = new Student("Bob","Doe");
		st.setStudentId(554);
		st.setAge(18);
		st.setSubject("Java");
		
		System.out.println(st);
		
	}
}
