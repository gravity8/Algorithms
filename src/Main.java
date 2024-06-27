import Objects.DGraph;
import Objects.Edge;
import Objects.WGraph;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        WGraph myGraph = new WGraph();

        myGraph.addEdge("A","B", 6);
        myGraph.addEdge("A","C", 5);
        myGraph.addEdge("A","D", 5);
        myGraph.addEdge("C","B", -2);
        myGraph.addEdge("D","C", -2);
        myGraph.addEdge("D","G", -1);
        myGraph.addEdge("B","E", -1);
        myGraph.addEdge("C","E", 1);
        myGraph.addEdge("E","F", 3);
        myGraph.addEdge("G","F", 3);

        BellmanFord bellmanFord = new BellmanFord();

        Map<String, Integer> shortestPath = bellmanFord.search("A", myGraph);

        System.out.println(shortestPath);
    }
}