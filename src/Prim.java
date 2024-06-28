import java.util.ArrayList;
import java.util.List;

import java.util.*;
import Objects.*;

public class Prim {
    private final Set<String> visited = new HashSet<>();
    private final PriorityQueue<Edge2> edgePriorityQueue = new PriorityQueue<>(Comparator.comparing(Edge2::getWeight));

    public void search(String start, UndirectedWeightedGraph graph) {
        //we add the start node to "visited".
        visited.add(start);
        System.out.print(start+"-->");
        //Add all edges connected to the start node to the priority Queue.
        addEdgesToQueue(start, graph);

        while (!edgePriorityQueue.isEmpty()) {
            Edge2 minEdge = edgePriorityQueue.poll();

            //Because we are dealing with undirected graph this ensures we are not perambulating.
            if (visited.contains(minEdge.getSource()) && visited.contains(minEdge.getDestination())) {
                continue;
            }

            //This is just picking the next node depending on if we are on the source node or destination.
            String newVertex = visited.contains(minEdge.getSource()) ? minEdge.getDestination() : minEdge.getSource();
            visited.add(newVertex);
            System.out.print(newVertex+"-->");
            //Then we add the edges of the current node to the queue.
            addEdgesToQueue(newVertex, graph);
        }
    }

    //This is to add edges of the vertex passed to the priority queue.
    private void addEdgesToQueue(String vertex, UndirectedWeightedGraph graph) {
        for (Edge2 edge : graph.getList().get(vertex)) {
            if (!visited.contains(edge.getDestination()) || !visited.contains(edge.getSource())) {
                edgePriorityQueue.add(edge);
            }
        }
    }
}