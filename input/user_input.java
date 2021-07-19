package sudoku2;

import java.util.*;

public class user_input{

	public int[][] input(){
		
		int[][] grid = new int[9][9];					
		
		Scanner sc = new Scanner(System.in);
		
		for(int i=0;i<9;i++) {
			
			for(int j=0;j<9;j++) {
				
				grid[i][j] = sc.nextInt();				//getting input from the user
				
			}
		}
		sc.close();										//closing scanner class
		return grid;
	}
	
}
