package Objects;

import javax.xml.soap.Node;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class DGraph{
    private final Map<String, List<Edge>> adjList;

    public DGraph(Map<String, List<Edge>> adjList) {
        this.adjList = adjList;
    }

    public int size(){
        return adjList.size();
    }

    public void addVertex(String vertex) {
        adjList.putIfAbsent(vertex, new ArrayList<>());
    }

    public List<Edge> get(String s){
        return adjList.getOrDefault(s, new ArrayList<>());
    }
    public Map<String, List<Edge>> getList(){
        return adjList;
    }

    public void addEdge(String source, String destination, int weight){
        adjList.putIfAbsent(source,new ArrayList<>());
        adjList.get(source).add(new Edge(destination,weight));
    }
}
