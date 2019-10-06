package day15;

public class StringBuilderPractice {
   public static void main(String[] args) {
	  // StringBuilder is mutable 
	  StringBuilder sb = new StringBuilder("apple");
	  System.out.println(sb);
	  sb.append(" ,banana");
	  //Only one object is created
	  
	  
	  // String is immutable
	  String str = "apple";
	  str = str + " ,banana";	  
	  //Java is creating 3 String objects to perform above action
	  
	  

	 
   }
}
