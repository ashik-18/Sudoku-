package sudoku;

public class backtrack extends checking{

	
     protected boolean solve(int grid[][]) {					//method overloading
    	 
        int i2 = 0, j2 = 0;
        boolean emptycell = false;
        
        inter iface = new checking();							//creating interface object
        
        for (int i = 0; i < 9 && !emptycell; i++) {
        	
            for (int j = 0; j < 9 && !emptycell; j++) {
            	
                if (grid[i][j] == 0) {							//checking for empty cells/locations
                	
                    emptycell = true;
                    i2 = i;
                    j2 = j;
                }
            }
        }

        if (!emptycell) 										//returns true when all is done
            return true;										
        

        for (int x = 1; x < 10; x++) {

            if (iface.check(i2, j2, x , grid)) {				//interface implementation
            	
                grid[i2][j2] = x;

                if (solve(grid)) 								//backtraking using recurrsion
                    return true;
                

                grid[i2][j2] = 0; 
            }

        }

        return false; 
    }
	
}
