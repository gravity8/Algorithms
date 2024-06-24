import Objects.Graph;

import java.util.*;
public class BFS {
    private final Set<String> visited = new HashSet<>();
    private final Queue<String> queue = new LinkedList<>();
    private boolean found = false;
    public Boolean search(String start, String destination, Graph adjList) {
            System.out.print(start+"-->");
            if(start.equals(destination))  {
                found = true;
                return true;
            }
            if(!queue.contains(start)){
                queue.add(start);
            }
            for (String e : adjList.get(start)){
                if(e.equals(destination))  {
                    found = true;
                    return true;
                }
                if(!visited.contains(e)){
                    queue.add(e);
                }
            }
            visited.add(queue.remove());
            if(!queue.isEmpty() && !found){
                search(queue.peek(), destination, adjList);
            }
            return found;
    }
}