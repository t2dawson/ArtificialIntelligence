package iterativeDeepeningDFS;

import java.util.ArrayList;
import java.util.List;

public class Node {

	private String name;
	private int depthLevel = 0;
	private List<Node> adjacencyList;

	public Node(String name) {

		this.name = name;
		this.adjacencyList = new ArrayList<>();
	}

	public void addNeighbour(Node neighbour) {

		this.adjacencyList.add(neighbour);
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getDepthLevel() {
		return depthLevel;
	}

	public void setDepthLevel(int depthLevel) {
		this.depthLevel = depthLevel;
	}

	public List<Node> getAdjacencyList() {
		return adjacencyList;
	}

	@Override
	public String toString() {

		return this.name;
	}

}
