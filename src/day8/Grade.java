package day8;
import java.util.Scanner;

public class Grade {
    public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int score;
		char grade = '?';
		
		System.out.println("Please provide your score:");
		score = sc.nextInt();
		
		if(score > 100 || score < 0) {
			System.out.println("We accept only 0 - 100");
			
		}else if(score >= 90) {
			grade = 'A';
		}else if(score >= 80) {
			grade = 'B';
		}else if(score >= 70) {
			grade = 'C';
		}else if(score >= 60) {
			grade = 'D';
		}else {
			grade = 'F';
		}
		
		System.out.println("Score = "+score);
		System.out.println("Grade = "+grade);
		
	}
}
