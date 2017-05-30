package iterativeDeepeningDFS;

public class App {

	public static void main(String[] argv) {
		
		Node node1 = new Node("A");
		Node node2 = new Node("B");
		Node node3 = new Node("C");
		
		node1.addNeighbour(node2);
		node2.addNeighbour(node3);
		
		IterativeDepthFirstSearch idfs = new IterativeDepthFirstSearch(node3);
		idfs.runSearch(node1);
	}
}
