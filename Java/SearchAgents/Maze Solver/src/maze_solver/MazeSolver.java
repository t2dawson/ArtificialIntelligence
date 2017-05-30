package maze_solver;


public class MazeSolver {

	private int [][] mazeMap;
	private boolean [][] visited;
	private int startPosCol;
	private int startPosRow;
	
	public MazeSolver(int [][] mazeMap, int startPositionCol, int startPositionRow) {
		
		this.mazeMap = mazeMap;
		this.visited = new boolean[mazeMap.length][mazeMap.length];
		this.startPosCol = startPositionCol;
		this.startPosRow = startPositionRow;
		
	}
	
	public void findMazeExit() {
		
		try {
			
			dfs(startPosRow, startPosCol+1);
			System.out.println("No Solution Found!");
		} catch (RuntimeException e) {
			
			System.out.println("Route to Exit Found!");
		}
		
	}
	
	private void dfs(int i, int j) {
		
	
		if(this.mazeMap[i][j] == 3) {
			System.out.println("Visiting i = " + i + ", j = " + j);
			throw new RuntimeException();
		}
		
		int end = this.mazeMap.length - 1;
		
		if(visited[i][j])
			return;
		else if(i < 0 || i >= end)
			return;
		else if ( this.mazeMap[i][j] == 1)
			return;
		else {
		
			System.out.println("Visiting i = " + i + ", j = " + j);
			this.visited[i][j] = true;
			
			dfs(i+1, j); // move down
			dfs(i, j+1); // move right
			dfs(i, j-1); // move left
			dfs(i-1, j); // move up
		}
	
	}
	
}
