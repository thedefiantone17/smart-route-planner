public class Main {

    public static void main(String[] args) {

        // Step 1: Load graph from file
        Graph graph = MapLoader.loadGraph("MapData.txt");

        System.out.println("=== GRAPH LOADED SUCCESSFULLY ===");

        // Step 2: Test node lookup
        testNodeLookup(graph);

        // Step 3: Print full graph
        printGraph(graph);

        // Step 4: Validate graph
        validateGraph(graph);
    }

    // 🔹 Test: Node lookup using ID
    public static void testNodeLookup(Graph graph) {
        System.out.println("\n=== NODE LOOKUP TEST ===");

        Node node = graph.getNode(1);

        if (node != null) {
            System.out.println("Node ID 1: " + node.getName());
        } else {
            System.out.println("Node not found!");
        }
    }

    // 🔹 Test: Print adjacency list
    public static void printGraph(Graph graph) {
        System.out.println("\n=== GRAPH STRUCTURE ===");

        for (Node node : graph.getAllNodes()) {

            System.out.println(node.getName() + " connects to:");

            for (Edge edge : graph.getNeighbors(node)) {
                System.out.println("  -> " +
                        edge.getDestination().getName() +
                        " (Cost: " + edge.getWeight() + ")");
            }
        }
    }

    // 🔹 Test: Validate graph integrity
    public static void validateGraph(Graph graph) {
        System.out.println("\n=== VALIDATION ===");

        boolean isValid = true;

        for (Node node : graph.getAllNodes()) {
            for (Edge edge : graph.getNeighbors(node)) {

                if (edge.getDestination() == null) {
                    System.out.println("Error: Broken edge at node " + node.getName());
                    isValid = false;
                }

                if (edge.getWeight() < 0) {
                    System.out.println("Error: Negative weight detected!");
                    isValid = false;
                }
            }
        }

        if (isValid) {
            System.out.println("Graph is valid and ready for algorithms!");
        } else {
            System.out.println("Graph has errors!");
        }
    }
}