import Objects.DGraph;

import java.util.*;
import Objects.Edge;

public class Djikstra {
    //To keep track of the shortest path to all visited nodes
    private Map<String, Integer> shortestPath= new HashMap<>();
    //To keep track of the current Edge with smallest node
    private PriorityQueue<Edge> Smallest
            = new PriorityQueue<>(Comparator.comparing(Edge::getWeight));
    //To keep track of the visited Nodes
    private List<String> visited = new ArrayList<>();
    //To know if I have gotten to the end of the graph
    private boolean end = false;
    //To know if I have found the Destination node.
    private boolean found = false;

    Map<String, Integer> search(String start, String destination, DGraph dGraph){
        //Initializing all nodes.
        InitializeAllNode(dGraph, start);

        //If the start is the destination, I return.
        if (start.equals(destination)){
            return shortestPath;
        }
        //Recaculating the shortest distance after first node
        Relaxation(dGraph,start);

        //Traversing through the Graph
        traverse(start, dGraph, destination);

        return shortestPath;
    }

    //This function initializes all Node with Integer.Max apart from the Start Node which is 0.
    void InitializeAllNode(DGraph dGraph, String start){
        dGraph.getList().keySet().forEach(node -> {
            if(node.equals(start)){
                shortestPath.put(node, 0);
            }
            else{
                shortestPath.put(node, Integer.MAX_VALUE);
            }
        });
    }

    //This Function is used to calculate the distance between Start node and every Node I visit.
    void Relaxation(DGraph dGraph, String current){
        dGraph.get(current).forEach(Edge->{
            //Ensuring that I follow the shortest path.
            if (
                    shortestPath.get(current)+Edge.getWeight()
                            < shortestPath.get(Edge.getDestination())
            ) {
                shortestPath.put(
                        Edge.getDestination(),
                        shortestPath.get(current)+Edge.getWeight()
                );
            }
            //Preventing visited nodes from being added to the Queue again.
            if (!visited.contains(Edge.getDestination())){
                Smallest.add(Edge);
            }
        });
    }

    //This function is to traverse through the graph.
    void traverse(String start, DGraph dGraph, String destination){
        System.out.print(start+"-->");
        //For every node I visit I add it to the "Visited" List.
        visited.add(start);
        if (Smallest.isEmpty()){
            end = true;
            System.out.println("destination not found");
            return;
        }
        //Getting the Edge/Path with shortest path
        String next = Smallest.peek().getDestination();
        //Clearing the Priority Queue for next set of Edges to avoid conflict.
        Smallest.clear();
        //I return the true as soon as I find Destination node.
        if (next.equals(destination) || found){
            found = true;
            return;
        }
        //If I get to the end of the Graph I flag.
        if(dGraph.getList().get(next).size()==0){
            end = true;
            System.out.println("destination not found");
            return;
        }
        //Calculating the distance
        Relaxation(dGraph, next);

        //I recursively traverse until I get to end of graph or until i find destination node.
        while (!end && !found){
            traverse(next, dGraph, destination);
        }
        return;
    }
}