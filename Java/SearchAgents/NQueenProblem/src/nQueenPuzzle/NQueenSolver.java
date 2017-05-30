package nQueenPuzzle;

public class NQueenSolver {

	private int[] queens;
	private int numQueens; // numQueens == numCols || numRows 
	
	public NQueenSolver(int numQueens) {
		
		queens = new int[numQueens];
		this.numQueens = numQueens;
		
	}
	
	public void solveQueensProblem() {
		
		arrangeQueens(0);
		
	}
	
	public void arrangeQueens(int row) {
		
		for(int i = 0; i < numQueens; i++) {
			
			if(isPlacementValid(row,i)){
				
				queens[row] = i;
				
				if(row == numQueens - 1)
					printQueens();
				else
					arrangeQueens(row+1);
			}
		}	
	}
	
	public boolean isPlacementValid(int row, int col) {
		
		for(int i = 0; i < row; i++) {
			
			if(queens[i] == col)
				return false; // queens can attack in the same column
			
			if((queens[i] - col) == (i - row) || (col - queens[i]) == (i - row))
				return false;
		}
		
		return true;	
	}
	
	public void printQueens() {
		
		for(int i = 0; i < numQueens; i++) {
			
			for(int j = 0; j < numQueens; j++) {
				
				if(queens[i] == j)
					System.out.print(" Q ");
				else
					System.out.print(" - ");
			}
			
			System.out.println();
		}
		
		System.out.println();
		
	}
}

