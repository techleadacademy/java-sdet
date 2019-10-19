package day21;

public class School {
	
	Student[] studentList;
	String schoolName;
	String address;
	
	public static void main(String[] args) {
		
		School tla = new School();
		tla.studentList = new Student[10];
		
		Student s1 = new Student("Bob","Doe");
		Student s2 = new Student("John","Doe");
		Student s3 = new Student("Beknazar","Doe");
		s2.setAge(25);
		
		
		tla.studentList[0] = s1;		
		tla.studentList[1] = s2;
		tla.studentList[2] = s3;
		
		for(Student student : tla.studentList) {
			System.out.println(student);
		}
		
        // BREAK 11:17 
		
	}
	
}
