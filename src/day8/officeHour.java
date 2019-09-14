package day8;

import java.util.Scanner;

public class officeHour {

	public static void main(String[] args) {
		
//		String str="hi how are you";
//		str=str.replace(" ", "");
//		System.out.println(str);
//		System.out.println(str.length());
		
//		   Scanner sc = new Scanner(System.in);
//	        
//	        System.out.println("Hey let me show you i can count:");
//	        String word1 = sc.nextLine(); //hi
//	        System.out.println("word1: "+word1);
	        
//	        //int count1 = word1.length();
//	        String word2 = word1.replaceAll(" " , "");
//	        
//	        
//	        System.out.println("Your word is: " + word2.length() + " Characters long.");
		
		
		
		
		
		
		
		/**
		 * take 2 string from console 
		 * if the first 2 letters are the same 
		 * then we print "first 2 are the same"
		 * if not  print "first 2 are NOT the same"
		 * 
		 */
		
		// apple  ap   
		
//		-Scanner and get 2 strings
//		-cutting off the first 2 chars 
//		-create if statement
		
		
		/*
		 * Scanner and get 2 strings
		 * if statement (int he condition compare 2 chars)
		 * 
		 */
		
		
		

		
//		boolean a=true;
//		boolean b=false;
		
//		a && b
//		a || b
//		!(a&&b)
		
//		String s1="apple";
//				String s2="avocado";
		
			//						TRUE
		//		 true							false
//		if(s1.charAt(0)==s2.charAt(0)  ||  s1.charAt(1)==s2.charAt(1)) {
//			System.out.println("1");
//		}else {
//			System.out.println("2");
//		}
		
		//					   FALSE	
		//		 		true                      false					
//		if(s1.charAt(0)==s2.charAt(0)  &&  s1.charAt(1)==s2.charAt(1)) {
//			System.out.println("1");
//		}else {
//			System.out.println("2");
//		}
		
		
		
//			Scanner sc=new Scanner(System.in);
//			String str3=sc.next();    //  next word only
//			System.out.println(str3);
//			System.out.println("============");
//			
//			Scanner sc1=new Scanner(System.in);
//			String str4=sc1.nextLine();    //  whole line
//			System.out.println(str4);
		
				
				// diff between println print
				
//				System.out.println("hi");
//				System.out.println(" how");
//				System.out.println(" are");
//				

				
				
				/*
				 * 
				 * str1=cherry   //str.length() -2 
				 * str2=cherries   ||
				 * 
				 * 
				 * 
				 */
				
				
				
				               //false
				/*     false                true
				 * if(true && false   &&   true || false )
				 * 
				 */
				
		//length    123456	    		
				//	cherry
		//index     012345
				
//				String str="kfjdlsfsfds"; 
//				System.out.println(str.substring(str.length()-2));
				
				
//				String last2=str.substring(str.length()-2);
//				String first2=str.substring(0,2);
//				System.out.println(last2);
//				System.out.println(first2);
				
				
		
		String str1="hherra";
		String str2="hhedda";
		
		
		if(str1.charAt(0)==str2.charAt(0) &&  str1.charAt( str1.length()-1 ) ==str2.charAt( str2.length()-1 )) {
			System.out.println("first and the last are the same");
		}else if(str1.charAt(0)==str2.charAt(0) ||  str1.charAt( str1.length()-1 ) ==str2.charAt( str2.length()-1 )) {
			System.out.println("one of them are the same");
		}else {
			System.out.println("none of them are match");
		}
		
		
				
		
	}

}
