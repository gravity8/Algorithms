import Objects.*;

class Main {
    public static void main(String[] args) {
        UndirectedWeightedGraph myGraph = new UndirectedWeightedGraph();

        myGraph.addEdge("A","B", 2);
        myGraph.addEdge("B","C", 7);
        myGraph.addEdge("A","F", 5);
        myGraph.addEdge("A","D", 4);
        myGraph.addEdge("B","D", 1);
        myGraph.addEdge("B","F", 8);
        myGraph.addEdge("B","G", 4);
        myGraph.addEdge("B","E", 3);
        myGraph.addEdge("F","G", 1);
        myGraph.addEdge("D","E", 2);
        myGraph.addEdge("E","C", 10);
        myGraph.addEdge("C","G", 6);

        Kruskal kruskal = new Kruskal();
        int weight = kruskal.search("A", myGraph);
        System.out.println("The minimum weight of spanning tree is: "+weight);

    }
}