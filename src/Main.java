import Objects.Graph;

public class Main {
    public static void main(String[] args) {
        Graph myGraph = new Graph();

        myGraph.addEdges("A","B");
        myGraph.addEdges("A","G");
        myGraph.addEdges("B","C");
        myGraph.addEdges("B","D");
        myGraph.addEdges("B","E");
        myGraph.addEdges("E","F");
        myGraph.addEdges("G","H");
        myGraph.addEdges("H","I");
        myGraph.addEdges("I","J");

        BFS bfs = new BFS();
        System.out.println("Searching for J");
        System.out.println(bfs.search("A","J", myGraph));
    }
}