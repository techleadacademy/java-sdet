package day23_assignment;

public class TLA {
	public static void main(String[] args) {
		
		Course tla = new Course("TLA",30);
		
		tla.addStudent(new Student("Carmine","Rackers",1,99));
		
		tla.addStudent(new Student("Timothy","Heck",2,80));
		tla.addStudent(new Student("Claudette","McBryde",3,78));
		tla.addStudent(new Student("Debra","Estevez",4,91));
		tla.addStudent(new Student("Henry","Romano",5,100));
		tla.addStudent(new Student("Sarah","Benitez",6,62));
		tla.addStudent(new Student("Mollie","Keane",7,44));
		tla.addStudent(new Student("John","Ponce",8,56));
		tla.addStudent(new Student("Matthew","Sarver",9,72));
		tla.addStudent(new Student("Jean","Conway",10,72));		
		tla.addStudent(new Student("Stephaine","Snyder",11,77));		
		tla.addStudent(new Student("Jessica","Peterson",12,94));
		tla.addStudent(new Student("Charlotte","Brown",13,90));
		tla.addStudent(new Student("Elizabeth","Gonzales",14,66));
		
		System.out.println(tla.getStudentWithHighestScore());
		
		
		System.out.println("Number of Students: "+tla.getActualNumberOfStudents());
		tla.printAllStudents();

		System.out.println("======= after rm =====");
		
		tla.removeStudent(11);
		tla.removeStudent(8);
		tla.removeStudent(6);
		tla.removeStudent(2);
		tla.removeStudent(1);
		tla.printAllStudents();
		System.out.println("Number of Students: "+tla.getActualNumberOfStudents());
		
	}
}

