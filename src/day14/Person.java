package day14;

public class Person {
   public String firstname;
   public String lastname;
   public int age;
   
   
   // constructor creation
   public Person() {
	   //System.out.println("here in constructor");
   }
   
   public Person(String firstname, String lastname, int age) {
	  this.firstname = firstname;
	  this.lastname = lastname;
	  this.age = age;
   }
   
   public String toString() {
	   return firstname +" "+lastname+" "+age;
   }
   
   public static void main(String[] args) {	  
	   
	  Person person = new Person("John","Doe",45);
	  System.out.println(person);

   }
}
