import Objects.Edge2;
import Objects.UndirectedWeightedGraph;
import java.util.*;
import Objects.*;

public class Kruskal {
    private PriorityQueue<Edge2> queue = new PriorityQueue<>(Comparator.comparing(Edge2::getWeight));
    private DisjointSet disjointSet = new DisjointSet();
    int totalWeight;
    public int search(String start, UndirectedWeightedGraph graph){
        addAllEdges(graph);
        for (String vertex : graph.getList().keySet()) {
            disjointSet.makeSet(vertex);
        }

        while (!queue.isEmpty() && disjointSet.getSize() > 1) {
            Edge2 current = queue.poll();
            String source = current.getSource();
            String destination = current.getDestination();

            if (disjointSet.union(source, destination)) {
                totalWeight += current.getWeight();
                System.out.println(source + " --> " + destination + " : " + current.getWeight());
            }
        }
        return totalWeight;
    }

    public void addAllEdges(UndirectedWeightedGraph graph){
        Set<Edge2> allEdges = new HashSet<>();
        for (Map.Entry<String, PriorityQueue<Edge2>> entry : graph.getList().entrySet()) {
            allEdges.addAll(entry.getValue());
        }
        queue.addAll(allEdges);
    }
}
