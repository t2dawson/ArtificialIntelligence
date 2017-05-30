package maze_solver;


public class App {

	public static void main(String[] args) {
		String path = System.getProperty("user.dir") + "/maze.txt";
		System.out.println(path);
		
		FileReader file = new FileReader(path,5,5);
		
		file.parseFile();
		MazeSolver mazeSolver = new MazeSolver(file.getMap(), file.getStartPosRow(), file.getStartPosCol());
		mazeSolver.findMazeExit();
		
	}
}
