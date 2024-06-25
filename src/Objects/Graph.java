package Objects;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
public class Graph {
    protected final Map<String, List<String>> adjList;

    public Graph(Map<String, List<String>> adjList){
        this.adjList = adjList;
    }
    public void addVertex(String vertex){
        adjList.putIfAbsent(vertex, new ArrayList<>());
    }

    public void addEdge(String source, String destination){
        adjList.putIfAbsent(source, new ArrayList<>());
        adjList.putIfAbsent(destination, new ArrayList<>());
        adjList.get(source).add(destination);
        adjList.get(destination).add(source);
    }

    public int size(){
        return adjList.size();
    }

    public List<String> get(String s){
        return adjList.getOrDefault(s,new ArrayList<>());
    }
}