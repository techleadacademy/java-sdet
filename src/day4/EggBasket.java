package day4;
import java.util.Scanner;

public class EggBasket {
  public static void main(String[] args) {
	 Scanner sc = new Scanner(System.in); 
	  
     int numberOfBaskets, eggsPerBasket, totalEggs;
     
     System.out.println("Enter number of baskets:");
     numberOfBaskets = sc.nextInt();
     
     eggsPerBasket = 6;
     
     totalEggs = eggsPerBasket * numberOfBaskets;
     
     System.out.println("If you have");
     System.out.println(eggsPerBasket+" eggs per basket and");
     System.out.println(numberOfBaskets+" baskets, then");
     System.out.println("The total number of eggs is "+totalEggs);
  }
}
