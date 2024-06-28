package Objects;

import java.util.*;
import java.util.stream.Collectors;

public class UndirectedWeightedGraph {
    private final Map<String, PriorityQueue<Edge2>> adjList;

    public UndirectedWeightedGraph() {
        this.adjList = new HashMap<>();
    }

    public void addEdge(String source, String destination, int weight) {

        Edge2 edge = new Edge2(source, destination, weight);
        adjList.putIfAbsent(source, new PriorityQueue<>(Comparator.comparing(Edge2::getWeight)));
        adjList.putIfAbsent(destination, new PriorityQueue<>(Comparator.comparing(Edge2::getWeight)));
        adjList.get(source).add(edge);
        adjList.get(destination).add(edge);
    }
    public Map<String, PriorityQueue<Edge2>> getList(){
        return adjList;
    }

    public void removeEdge(String source, String destination) {
        adjList.get(source)
                .removeIf(edge ->
                        edge.getDestination().equals(destination)
                                && edge.getSource().equals(source)
                );
        adjList.get(destination)
                .removeIf(edge ->
                        edge.getDestination().equals(destination)
                                && edge.getSource().equals(source)
                );
    }
}
