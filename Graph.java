import java.util.*;

public class Graph {

    private Map<Node, List<Edge>> adjacencyList;
    private Map<Integer, Node> nodeLookup; // FAST access by ID

    public Graph() {
        adjacencyList = new HashMap<>();
        nodeLookup = new HashMap<>();
    }

    // Add node
    public void addNode(Node node) {
        adjacencyList.putIfAbsent(node, new ArrayList<>());
        nodeLookup.put(node.getId(), node);
    }

    // Get node by ID
    public Node getNode(int id) {
        return nodeLookup.get(id);
    }

    // Add edge (undirected)
    public void addEdge(int sourceId, int destId, double weight) {
        Node source = getNode(sourceId);
        Node dest = getNode(destId);

        if (source == null || dest == null) {
            throw new IllegalArgumentException("Invalid node ID in edge");
        }

        adjacencyList.get(source).add(new Edge(source, dest, weight));
        adjacencyList.get(dest).add(new Edge(dest, source, weight));
    }

    public List<Edge> getNeighbors(Node node) {
        return adjacencyList.getOrDefault(node, new ArrayList<>());
    }

    public Set<Node> getAllNodes() {
        return adjacencyList.keySet();
    }
}