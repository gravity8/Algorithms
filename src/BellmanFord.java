import Objects.Edge2;
import Objects.WGraph;
import java.util.HashMap;
import java.util.Map;

public class BellmanFord {
    Map<String, Integer> shortestPath = new HashMap<>();

    Map<String, Integer> search(String start, WGraph graph){

        //Initializing the shortest path to all Nodes
        for (String node : graph.getNodes()){
            shortestPath.put(node, Integer.MAX_VALUE);
        }
        shortestPath.put(start, 0);

        //Looping through all the node |V| - 1 times.
        for (int i=1; i<graph.getNodes().size(); i++){
            //For each iteration, I will loop through each of the nodes and relax them.
            for(Edge2 edge : graph.getEdges()){
                String source = edge.getSource();
                String destination = edge.getDestination();
                int weight = edge.getWeight();

                //if the weight of the shortest path of source and weight of node is less than the
                //shortest path of the destination then we relax the destination node.
                if (shortestPath.get(source) != Integer.MAX_VALUE &&
                        shortestPath.get(source)+weight<shortestPath.get(destination))
                {
                    shortestPath.put(
                            destination,
                            shortestPath.get(source)+weight
                    );
                }
            }
            System.out.println("Iteration "+ i +": "+shortestPath);
        }

        //I will loop through each of the nodes once again to know if there is negative cycle.
        for(Edge2 edge : graph.getEdges()){
            String source = edge.getSource();
            String destination = edge.getDestination();
            int weight = edge.getWeight();

            //if the weight of the shortest path of source and weight of node is less than the
            //shortest path of the destination then we flag negative cycle.
            if (shortestPath.get(source) != Integer.MAX_VALUE &&
                    shortestPath.get(source)+weight<shortestPath.get(destination))
            {
                System.out.print("A negative cycle is present.");
                break;
            }
        }

        return shortestPath;
    }
}
