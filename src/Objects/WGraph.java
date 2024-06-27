package Objects;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class WGraph {
        private final List<Edge2> edges;
        private final Set<String> nodes;

        public WGraph() {
            edges = new ArrayList<>();
            nodes = new HashSet<>();
        }

        public void addEdge(String source, String destination, int weight) {
            edges.add(new Edge2(source, destination, weight));
            nodes.add(source);
            nodes.add(destination);
        }

        public List<Edge2> getEdges() {
            return edges;
        }

        public Set<String> getNodes() {
            return nodes;
        }
}
