package maze_solver;

import java.util.Scanner;
import java.io.File;

public class FileReader {

	
	private int map[][];
	private String pathName;
	private int numRows;
	private int numColumns;
	private int startPosRow;
	private int startPosCol;
	
	public FileReader(String path, int numRows, int numColumns) {
		
		this.pathName = path;
		this.numColumns = numColumns;
		this.numRows = numRows;
		this.map = new int[numRows][numColumns];
		
	}

	public void parseFile() {
		
		try {
			
			Scanner scanner = new Scanner(new File(this.pathName));
			
			for (int i = 0; i < this.numRows; i++) {
				
				for (int j = 0; j < numColumns; j++) {
					
					map[i][j] = scanner.nextInt();
					
					if(map[i][j] == 2) {
						
						this.startPosRow = i;
						this.startPosCol = j;
					}
				}
			}
			
			
			scanner.close();
		} catch(Exception e) {
			
			e.printStackTrace();
		}
		
		
	}

	public int[][] getMap() {
		return map;
	}

	public int getStartPosRow() {
		return startPosRow;
	}

	public int getStartPosCol() {
		return startPosCol;
	}
}
