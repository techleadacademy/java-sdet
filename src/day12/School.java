package day12;

public class School {
   public String name;
   public String address;
   public static boolean isSummer;
   public static String currentDate;
   
   public void printDetails() {
	   System.out.println("name: "+name);
	   System.out.println("address: "+address);
	   System.out.println("isSummer: "+isSummer);
	   System.out.println("currentDate: "+currentDate);
   }
}
