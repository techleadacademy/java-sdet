package practice;

public class Swap {
   public static void main(String args[]) {
	   String sky = "yellow";
	   String sun = "blue";
	   String tmpStr = sky;
	   
	   //TODO
	   // Swap the values between two integers 
	  
	   sky = sun;
	   sun = tmpStr;
	   
	   System.out.println(sky);
	   System.out.println(sun);
	   
	   //output:
	   // blue
	   // yellow
   }
}
