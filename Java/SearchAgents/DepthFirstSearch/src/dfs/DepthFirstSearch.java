package dfs;

import java.util.Stack;


public class DepthFirstSearch {

	private Stack<Vertex> stack;
	
	public DepthFirstSearch() {
		
		this.stack = new Stack<>();
	}
	
	public void dfs(Vertex root) {
		
		stack.add(root);
		root.setVisited(true);
	
		while(!stack.isEmpty()) {
			
			Vertex currVertex = stack.pop();
			System.out.print(currVertex + "-");
			
			
			for(Vertex v: currVertex.getAdjacencyList()) {
				
				if(!v.isVisited()) {
					
					v.setVisited(true);
					v.setPredecessor(currVertex);
					stack.push(v);
				}
			}
		}
	}
}
