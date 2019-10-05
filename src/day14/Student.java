package day14;

public class Student {
	private String firstname;
	private String lastname;

//  public String toString() {
//	  return firstname+" "+lastname;
//  }

	// if you dont declare any constructor java will provide
	// similar constructor

	public Student() {
	   this("Bob", "Doe");
       System.out.println("Here in the empty constructor");
       //this("Bob", "Doe");
	}

	public Student(String initfirstname, String initLastname) {
		if(initfirstname.length() > 5) {
			
			System.out.println(initfirstname+" not acceptable");
		}else {
			this.firstname = initfirstname;
			this.lastname = initLastname;
		}
		
	}
	

	


}
