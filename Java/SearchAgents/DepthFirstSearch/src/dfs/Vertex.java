package dfs;

import java.util.List;
import java.util.ArrayList;

public class Vertex {

	private String name;
	private boolean visited;
	private List<Vertex> adjacencyList;
	private Vertex predecessor;
	
	public Vertex(String name) {
		
		this.name = name;
		this.adjacencyList = new ArrayList<>();
	}
	
	public void addNeighbour(Vertex vertex) {
		
		this.adjacencyList.add(vertex);
	}
	
	@Override
	public String toString() {
		
		return this.name;
		
	}

	public boolean isVisited() {
		return visited;
	}

	public void setVisited(boolean visited) {
		this.visited = visited;
	}

	public Vertex getPredecessor() {
		return predecessor;
	}

	public void setPredecessor(Vertex predecessor) {
		this.predecessor = predecessor;
	}

	public List<Vertex> getAdjacencyList() {
		return adjacencyList;
	}
	
}
