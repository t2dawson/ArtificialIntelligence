package bfs;

import java.util.Queue;
import java.util.LinkedList;

public class BreathFirstSearch {

	public void bfs(Vertex root) {
		
		Queue<Vertex> queue = new LinkedList<>();
		
		root.setVisited(true);
		queue.add(root);
		
		while(!queue.isEmpty()) {
			
			Vertex currVertex = queue.remove();
			System.out.print(currVertex + "-");
			
			for(Vertex v : currVertex.getNeighbours()){
				
					if(!v.isVisited()) {
						
						v.setVisited(true);
						queue.add(v);
					}
				
			}
			
		}
		
		
	}
}
