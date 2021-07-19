package sudoku2;

import java.util.*;

public class puzzle_generator extends user_input{
	
	public int[][] func(puzzle_generator obj) {  //method having object as a parameter 
		
		return super.input();					//calling super class method 
	
	}
	
	public int[][] gen() {
		
		Random rand= new Random();				//creating a random class
    	
        int k=0;
        int count =1;
        int sub=1;

        int[][] a=new int[9][9];				//declaring 9*9 matrix

        for (int i=0;i<9;i++){
        	
        	if(k==3){
        		
        		k=1;
        		sub++;
        		count=sub;
        	}
        
        	else{
        		k++;
        		if(i!=0)
        			count=count+3;
        	}
        
        for(int j=0;j<9;j++){
        	
            if(count==9){
                a[i][j]=count;
                count=1;
                
            }
            
            else{
                a[i][j]=count++;				//filling the matrix rows
            }
            
        }
        System.out.println();
        
    }
    
    System.out.println("Select the difficulty level\n1 for easy\n2 for medium\n3 for hard");			//selecting the difficulty level of the puzzle
    int ch;
    Scanner sc = new Scanner(System.in);
    ch= sc.nextInt();
    
    int r,c;
    
    if (ch==1) {								
    	
    	r=5;									//initializing r and c bases on the difficulty level chosen
    	c=5;
    }
    
    else if(ch==2) {
    	r=7;
    	c=7;
    }
    
    else {
    	r=10;
    	c=10;
    }
    
    
    for(int i1=0;i1<r;i1++) {
    	
    	for(int j1=0;j1<c;j1++) {
    		
    		int r1= rand.nextInt(9);				//selecting random locations and initializing them to 0

            int r2= rand.nextInt(9);
     
            a[r1][r2]=0;

    	}
 
    }
    sc.close();										//closing the scanner class
    
    return a;
	
	}
}
