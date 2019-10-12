package day17;

import java.util.Arrays;

public class NumebersTable {
	public static void main(String[] args) {
		int[][] table = 
			{
			 {1532,1113,1124,1134,1145},
		     {1158,1191,1208,1225,1242},
			 {1216,1174,1191,1208,1225},
			 {1276,1262,1286,1311,1335},
			 {1340,1338,1370,1403,1436}
			};
		
		//sumsOfTheTable(table);
		//avValOfTable(table);
		System.out.println(getMax(table));
	}
	
	public static int getMax(int[][] table) {
        int max = 0;
		for(int[] row : table) {
			
			for(int i = 0; i < row.length; i++) {
				if(max < row[i]) {
					max = row[i];
				}
			}
			
		}
		return max;
	}
	
	public static void avValOfTable(int[][] table) {
		int totalSum = 0;
		int numberOfElements = 0;
		for(int row = 0; row < table.length; row++) {
			
			int sumOfRow = 0;
			
			for(int col = 0; col < table[row].length; col++) {
				sumOfRow += table[row][col];
			}
			
			totalSum += sumOfRow;
			numberOfElements += table[row].length;
			
			int avOfRow = sumOfRow/table[row].length;
			System.out.println(Arrays.toString(table[row]) + " = "+avOfRow);
		}
		System.out.println("The average of whole table is "+totalSum / numberOfElements);
		
	}
	
	public static void sumsOfTheTable(int[][] table) {
		// Find sum of each row separately and print them
		System.out.println("================");
		
		//int sumOfRow = 0;
		int sumTotal = 0;
		// outer
		for(int j = 0; j < table.length; j++) {
			int sumOfRow = 0;
			
			//inner
			
			for(int i = 0; i < table[j].length; i++) {
				sumOfRow += table[j][i];
			}
			
			sumTotal = sumTotal + sumOfRow;
			System.out.println(Arrays.toString(table[j])+" = "+sumOfRow);
		}
		System.out.println("Sum of whole table is "+sumTotal);
	}
}
