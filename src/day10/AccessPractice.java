package day10;

public class AccessPractice {
   public static void main(String[] args) {
	   
	   AccessModifiers obj = new AccessModifiers();
	   obj.strPublic = "word";
	   //obj.strPrivate = "word1";
	   
	   obj.sayGood();
	   obj.sayAwesome();

   }
}
