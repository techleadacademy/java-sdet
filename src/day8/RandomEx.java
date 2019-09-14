package day8;
import java.util.*;

public class RandomEx {
	public static void main(String[] args) {
       Random random = new Random();
       int num = random.nextInt(2000);
       
       /**
        *  if range 0 - 100, print "inside 100"
        *  if range 101 - 200, print "inside 200"
        *  if range 201 - 400, print  "inside 400"
        *  if range 401 - 1000, print  "inside 1000"
        *  for others, print "inside 2000"
        */
       
       System.out.println(num);
       if(num < 100) {
    	   System.out.println("inside 0 - 100");
    	   
       }else if(num >= 101 && num <= 200) {
    	   System.out.println("inside 101 - 200");
       }else if(num >= 201 && num <= 400) {
    	   System.out.println("inside 201 - 400");
       }else if(num >= 401 && num <= 1000) {
    	   System.out.println("inside 401 - 1000");
       }else if(num > 1000) {
    	   System.out.println("inside 2000");
       }  
       
       
	}
}
