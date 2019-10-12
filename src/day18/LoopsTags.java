package day18;

import java.util.Arrays;

public class LoopsTags {
	public static void main(String[] args) {
		int[][] table = 
			{
			 {1532,1113,1124,1134,1145},
		     {1158,1191,1208,1225,1242},
			 {1216,1174,1191,1208,1225},
			 {1276,1262,1286,1311,1335},
			 {1340,1338,1370,1403,1436}
			};
		
		OUTER:
		for(int i = 0; i < table.length; i++) {
			
			INNER:
			for(int j = 0; j < table[i].length; j++) {
				
				if(table[i][j] == 1286) {
					break OUTER;
				}
				System.out.print(table[i][j]+" ");
			}
			System.out.println();
		}		
		
	}
}
