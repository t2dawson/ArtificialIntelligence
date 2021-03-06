package bfs;

import java.util.List;
import java.util.ArrayList;

public class Vertex {

	private int data;
	private List<Vertex> neighbours;
	private boolean visited;
	
	
	public Vertex(int data) {
		
		this.data = data;
		this.neighbours = new ArrayList<>();
		
	}
	
	public void addNeighbour(Vertex neighbour) {
		
		this.neighbours.add(neighbour);
	}

	public int getData() {
		return data;
	}

	public void setData(int data) {
		this.data = data;
	}

	public boolean isVisited() {
		return visited;
	}

	public void setVisited(boolean visited) {
		this.visited = visited;
	}

	public List<Vertex> getNeighbours() {
		return neighbours;
	}
	
	@Override
	public String toString() {
		
		return "" + this.data;
	}
}
