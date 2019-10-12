package day17;

import java.util.Arrays;

public class MArray {
	public static void main(String[] args) {
		
		String[][] teams = new String[5][4];
		
		String[] goSmart = {"Yulduz","Mark","Daniel","Akylbek"};
		teams[0] = goSmart;
		
		teams[1][0] = "Ariuna";
		teams[1][1] = "Frank";
		teams[1][2] = "Nurgazy";
		teams[1][3] = "Anna";
		
		teams[2][0] = "Selvin";
		teams[2][1] = "Meerim";
		teams[2][2] = "Gulzhana";
		teams[2][3] = "Rocio";
		
		teams[3][0] = "Job";
		teams[3][1] = "Evelyn";
		teams[3][2] = "Edil";
		teams[3][3] = "Aizhamal";
		
		//System.out.println(Arrays.deepToString(teams));
		
		for(String[] str : teams) {
			System.out.println(Arrays.toString(str));
		}
	
	}
}
