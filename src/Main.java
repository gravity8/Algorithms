import Objects.DGraph;
import Objects.Edge;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        DGraph myGraph = new DGraph(new HashMap<>());


        myGraph.addVertex("A");
        myGraph.addVertex("B");
        myGraph.addVertex("C");
        myGraph.addVertex("D");
        myGraph.addVertex("E");
        myGraph.addVertex("F");

        myGraph.addEdge("A","B", 10);
        myGraph.addEdge("B","A", 10);
        myGraph.addEdge("A","C", 50);
        myGraph.addEdge("C","B", 9);
        myGraph.addEdge("B","D", 15);
        myGraph.addEdge("D","C", 20);
        myGraph.addEdge("D","E", 35);
        myGraph.addEdge("E","D", 30);
        myGraph.addEdge("C","E", 10);
        myGraph.addEdge("A","E", 45);
        myGraph.addEdge("F","D", 3);

        Djikstra djikstra = new Djikstra();
        Map<String, Integer> result = djikstra.search("A","F", myGraph);
        System.out.println(result);
        System.out.println("The shortest path between A and C is: " + result.get("C"));
    }
}