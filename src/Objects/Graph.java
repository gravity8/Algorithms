package Objects;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
public class Graph {
    private Map<String, List<String>> adjList;

    public Graph(){
        adjList = new HashMap<>();
    }
    public void addVertex(String vertex){
        adjList.putIfAbsent(vertex, new ArrayList<>());
    }

    public void addEdges(String source, String destination){
        adjList.putIfAbsent(source, new ArrayList<>());
        adjList.putIfAbsent(destination, new ArrayList<>());
        adjList.get(source).add(destination);
        adjList.get(destination).add(source);
    }

    public int size(){
        return adjList.size();
    }
    public List<String> get(String s){
        if (adjList.get(s)!=null) {
            return adjList.get(s);
        }
        return new ArrayList<>();
    }
}