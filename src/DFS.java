import Objects.Graph;

import java.util.ArrayList;
import java.util.List;
public class DFS {
    private static List<String> visited = new ArrayList<String>();
    private static boolean found = false;

    static boolean search(String start, String destination, Graph adjList){
        visited.add(start);
        System.out.print(start+"-->");
        for(String node : adjList.get(start)){
            if (node.equals(destination)){
                found=true;
            }
            if(visited.contains(node)){
               continue;
            }
            search(node, destination, adjList);
        }
        return found;
    }
}
