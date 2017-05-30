package iterativeDeepeningDFS;

import java.util.Stack;

public class IterativeDepthFirstSearch {

	private Node targetNode;
	private boolean targetFound;
	
	public IterativeDepthFirstSearch(Node targetNode) {
		
		this.targetNode = targetNode;
	}
	
	public void runSearch(Node startNode) {
		
		int depth = 0;
		
		while(!targetFound) {
			
			System.out.println();
			dfs(startNode,depth);
			depth++;
		}
	}
	
	public void dfs(Node startNode, int depth) {
		
		Stack<Node> stack = new Stack<>();
		startNode.setDepthLevel(0);
		stack.push(startNode);
		
		while(!stack.isEmpty()) {
			
			Node currNode = stack.pop();
			System.out.print(currNode + "-");
			
			if(currNode.getName().equals(this.targetNode.getName())) {
				
				System.out.println("\nNode Found!..");
				this.targetFound = true;
				
				return;
			}
			
			if(currNode.getDepthLevel() >= depth) 
				continue;
			
			for(Node node: currNode.getAdjacencyList()) {
				
				node.setDepthLevel(currNode.getDepthLevel() + 1);
				stack.push(node);
			}
		}
		
	}
}
