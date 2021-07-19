package sudoku;

import java.util.*;
import sudoku2.*;						//importing package

public class input {

	public static void main(String[] args) {
        
        int[][] puzzle = new int[9][9];
        
        Scanner sc = new Scanner(System.in);
		System.out.println("Select 1 for generating a sudoku puzzle\nSelect 2 for solving a puzzle");			
		
		int choice = sc.nextInt();
		
		puzzle_generator obj= new puzzle_generator();		//creating object 
		
		if(choice ==1) {

	    	puzzle=obj.gen();								//method that returns the sudoku puzzle
	    	
			System.out.println("Generated puzzle:");
	    	
			
	    	for(int i=0;i<9;i++) {
	    		
	    		for(int j=0;j<9;j++) {
	    			
	    			System.out.print(puzzle[i][j] +", ");   //printing the generated puzzle
	    		}
	    		
	    		System.out.println();
	    	}
	    	
		}
		
		
		else {
			
			System.out.println("Input the puzzle");
			puzzle=obj.func(obj);						//passing objects as parameters	
														//method that stores and returns the puzzle given by the user
		}

		
		solver obj2= new solver(puzzle);				//creating object and passing grid as parameter
		
		obj2.solve();									//method that solves the sudoku
		sc.close();										//closing scanner class			
	}

}
