package Vanhack.DFS;

public class GraphShow {
    public static void main(String[] args) {
/*[["USA","BRA"],["JPN","PHL"],["BRA","UAE"],["UAE","JPN"]]*/
        Graph graph = new Graph(false);
        Node a = new Node(0, "USA");
        Node b = new Node(1, "BRA");
        Node c = new Node(2, "PHL");
        Node d = new Node(3, "UAE");
        Node e = new Node(4, "JPN");

        graph.addEdge(a,b);
        graph.addEdge(e,c);
        graph.addEdge(b,d);
        graph.addEdge(d,e);

        System.out.println("If we were to use our previous DFS method, we would get an incomplete traversal");
        graph.depthFirstSearch(b);
        graph.resetNodesVisited(); // All nodes are marked as visited because of
                                   // the previous DFS algorithm so we need to
                                   // mark them all as not visited

        System.out.println();
        System.out.println("Using the modified method visits all nodes of the graph, even if it's unconnected");
        graph.depthFirstSearchModified(b);
    }
}