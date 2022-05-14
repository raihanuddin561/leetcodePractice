package Vanhack.DFS;

public class Node {
    int n;
    String name;
    boolean visited; // New attribute

   public Node(int n, String name) {
        this.n = n;
        this.name = name;
        visited = false;
    }

    // Two new methods we'll need in our traversal algorithms
   public void visit() {
        visited = true;
    }

   public void unvisit() {
        visited = false;
    }


    public boolean isVisited() {
       return visited;
    }
}