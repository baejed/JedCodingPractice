package SecondYear2ndSem.DFS;

import java.util.*;

public class Graph {
    ArrayList<GraphNode> nodeList = new ArrayList<GraphNode>();
    int[][] adjacencyMatrix;

    public Graph(ArrayList<GraphNode> nodeList) {
        this.nodeList = nodeList;
        adjacencyMatrix = new int[nodeList.size()][nodeList.size()];
    }

    public void addUndirectedEdge(int i, int j) {
        adjacencyMatrix[i][j] = 1;
        adjacencyMatrix[j][i] = 1;
    }

    public String toString() {
        StringBuilder s = new StringBuilder();
        s.append("\t");
        for (int i = 0; i < nodeList.size(); i++) {
            s.append(nodeList.get(i).name + " ");
        }
        s.append("\n");
        for (int i = 0; i < nodeList.size(); i++) {
            s.append(nodeList.get(i).name + ": ");
            for (int j : adjacencyMatrix[i]) {
                s.append((j) + " ");
            }
            s.append("\n");
        }
        return s.toString();
    }

    public void unvisitNodes(){
        for(GraphNode node : nodeList) node.isVisited = false;
    }

    public ArrayList<GraphNode> getNeighbors(GraphNode node) {
        ArrayList<GraphNode> neighbors = new ArrayList<GraphNode>();
        int nodeIndex = node.index;
        for (int i = 0; i < adjacencyMatrix.length; i++) {
            if (adjacencyMatrix[nodeIndex][i] == 1) {
                neighbors.add(nodeList.get(i));
            }
        }
        return neighbors;
    }

    public void dfs(){
        Stack<GraphNode> stack = new Stack<>();
        stack.push(nodeList.get(0));
        dfs(stack);
        this.unvisitNodes();
    }

    private void dfs(Stack<GraphNode> stack){
        printStack(stack);
        GraphNode currentNode = stack.pop();
        ArrayList<GraphNode> currentNodeNeighbors = this.getNeighbors(currentNode);

        System.out.println("Current node: " + currentNode.name);

        currentNode.isVisited = true;

        for(GraphNode node : currentNodeNeighbors){
            if(!node.isVisited) stack.push(node);
        }

        if(stack.isEmpty()) return;

        dfs(stack);
    }

    public void bfs(){
        Queue<GraphNode> queue = new LinkedList<>();
        queue.add(nodeList.get(0));
        bfs(queue);
        this.unvisitNodes();
    }

    private void bfs(Queue<GraphNode> queue) {
        printQueue(queue);
        GraphNode currentNode = queue.remove();
        ArrayList<GraphNode> currentNodeNeighbors = this.getNeighbors(currentNode);

        System.out.println("Current node: " + currentNode.name);

        currentNode.isVisited = true;

        for (GraphNode node : currentNodeNeighbors) {
            if (!node.isVisited) queue.add(node);
        }

        if (queue.isEmpty()) return;

        bfs(queue);
    }

    /*
    THE DFS AND BFS IS INEFFICIENT
     */

    public void printStack(Stack<GraphNode> stack){
        System.out.println("----STACK----");
        for(GraphNode node : stack){
            System.out.println(node.name);
        }
        System.out.println("-----END-----");
    }

    public void printQueue(Queue<GraphNode> queue){
        System.out.println("----QUEUE----");
        for(GraphNode node : queue){
            System.out.println(node.name);
        }
        System.out.println("-----END-----");
    }

}