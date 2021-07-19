package sudoku;

public class solver extends backtrack implements Runnable{

	int[][] grid = new int[9][9];
	
	solver(int grid[][]) {          // parameterized constructor 
		
		this.grid=grid;				// using this keyword
		
	}
	
	public void run() {										//thread implementation
		
		System.out.println("Fully solved puzzle:");
		
		for (int i = 0; i < 9; i++) {

            for (int j = 0; j < 9; j++) {
            	
            	try {
    				
    					Thread.sleep(100);    				// making the thread sleep for 100ms before printing each output data
    			}
            	
    			catch(InterruptedException e){				//exception handling
    				
    				System.out.println("Program interrupted "+ e);
    			}
            	
                System.out.print(grid[i][j] + " ");         //printing the solved puzzle
            }
            System.out.println();
       }
		
	}
	void solve() {									//method overloading

		 super.solve(grid);							//calling super class method 

		 Thread t = new Thread(new solver(grid));			//creating a thread object 
		 t.start();											//stating the thread

	}
	
}
