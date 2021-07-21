## Sudoku-puzzle-solver

Sudoku solver and generator using java

The project solves the sudoku puzzles given by the user or generates the puzzles based on the difficulty level selected by the user.

Backtracking method is used to solve the puzzles.

### Generating a puzzle: 
    First a fully solved puzzle is created and stored in a 2D array.
    Later random locations are choosen and initialized to 0.
    The number of random locations choosen are dependent on the difficulty level selected by the user.
    
### Solving the generated puzzle or input puzzle given by the user:
    Backtracking algorithm is used to solve the puzzles.
    Everytime an empty (0) location is found, all numbers (1-9) are checked for compatability, i.e across the row , along the column and in the 3*3 sub-grid.
    This is recursivly done until all the locations are filled.
    The solved puzzle is then printed using Threads.
