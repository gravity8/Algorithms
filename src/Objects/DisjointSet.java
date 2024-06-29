package Objects;

import java.util.HashMap;
import java.util.Map;

public class DisjointSet {
    private Map<String, String> parent = new HashMap<>();
    private Map<String, Integer> rank = new HashMap<>();
    private int count; // to track the number of sets

    public void makeSet(String vertex) {
        parent.put(vertex, vertex);
        rank.put(vertex, 0);
        count++;
    }

    public String find(String vertex) {
        if (parent.get(vertex).equals(vertex)) {
            return vertex;
        }
        String root = find(parent.get(vertex));
        parent.put(vertex, root);
        return root;
    }

    public boolean union(String vertex1, String vertex2) {
        String root1 = find(vertex1);
        String root2 = find(vertex2);

        if (root1.equals(root2)) {
            return false;
        }

        if (rank.get(root1) > rank.get(root2)) {
            parent.put(root2, root1);
        } else if (rank.get(root1) < rank.get(root2)) {
            parent.put(root1, root2);
        } else {
            parent.put(root2, root1);
            rank.put(root1, rank.get(root1) + 1);
        }

        count--;
        return true;
    }

    public int getSize() {
        return count;
    }
}