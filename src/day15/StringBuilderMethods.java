package day15;

public class StringBuilderMethods {
   public static void main(String[] args) {
	   //                                 //0123456
	  StringBuilder sb = new StringBuilder("animals");
	//  System.out.println(sb);
	  
	  sb.insert(4, "123");

	 // System.out.println(sb);
	  
//	  printWithEnd("animals","A");
//	  printWithEnd("apple","B");
//	  printWithEnd("ID","123123123123");
	  
	  //                                     012345
	  StringBuilder sb1 = new StringBuilder("abcdef");
	  sb1.delete(1, 3);
	  // first index inclusive
	  // second index before that char
	  System.out.println(sb1);
	  
	  //                                     012345678910
	  StringBuilder sb2 = new StringBuilder("smartInsert");
	  sb2.delete(3, 7);
	  System.out.println(sb2);
	  
	  StringBuilder sb3 = new StringBuilder("Ariuna");
	  sb3.reverse();
	  
	  System.out.println(sb3);
	  // Break  2:10
   }
   
   // printWithEnd("animals", "A")  -> animalAs
   // printWithEnd("apple", "B")  -> applBe
   
   public static void printWithEnd(String word, String strEnd) {
	  StringBuilder sb = new StringBuilder(word);
	  sb.insert(word.length()-1,strEnd);
	  System.out.println(sb);
   }
}
