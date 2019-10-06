package day15;

public class StringBuilder1 {
   public static void main(String[] args) {	   
//	   StringBuilder word = new StringBuilder("Java is Awesome");
//	   System.out.println(word);
//	   
//	   word.append(", Pyhton is Good");
//	   System.out.println(word);
//	   
//	   
//	   // 
//	   StringBuilder asteriks = new StringBuilder();
//	   for(int i = 0; i < 10; i++) {
//		   asteriks.append("*");
//	   }
//	   System.out.println(asteriks);
	   
	   printAsteriks(8);
	  	   
   }
   
   // create static void method which accepts 1 int arg
   // print asteriks * in the same line using string builder 
   // number of asteriks are the same as arg number
   
   public static void printAsteriks(int number) {
	   
	   StringBuilder s = new StringBuilder();
	   for(int i = 0; i < number; i++) {
		   s.append("*");
	   }
	   System.out.println(s);
	   
   }
   
   
}
