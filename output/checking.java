package sudoku;

interface inter {											//interface
	
	boolean check(int i, int j, int x,int grid[][]);
	
}

public class checking implements inter{						//implementing interface inter

		public boolean check(int i2, int j2, int x,int grid[][]) {

        
        for (int j = 0; j < 9; j++) {
        	
            if (grid[i2][j] == x) {						//checking if x fits in i2 row
                return false;
            }
            
        }

        
        for (int i = 0; i < 9; i++) {
        	
            if (grid[i][j2] == x) {						//checking if x fits in j2 column
                return false;
            }
            
        }

        
        int row = i2 - i2 % 3;
        int column = j2 - j2 % 3;

        for (int i = 0; i < 3; i++) {
        	
            for (int j = 0; j < 3; j++) {
            	
                if (grid[row+i][column + j] == x) {			//checking if x fits in 3*3 subgrid
                    return false;
                }
                
            }
        }

        
        return true;
    }
}
