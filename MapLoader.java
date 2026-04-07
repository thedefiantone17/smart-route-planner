import java.io.*;
import java.util.*;

public class MapLoader {

    public static Graph loadGraph(String filePath) {
        Graph graph = new Graph();

        try (BufferedReader br = new BufferedReader(new FileReader(filePath))) {

            String line;

            while ((line = br.readLine()) != null) {

                line = line.trim();

                // Skip empty or comment lines
                if (line.isEmpty() || line.startsWith("#")) continue;

                String[] parts = line.split(",");

                if (parts[0].equals("NODE")) {
                    int id = Integer.parseInt(parts[1]);
                    String name = parts[2];
                    double x = Double.parseDouble(parts[3]);
                    double y = Double.parseDouble(parts[4]);

                    graph.addNode(new Node(id, name, x, y));
                }

                else if (parts[0].equals("EDGE")) {
                    int src = Integer.parseInt(parts[1]);
                    int dest = Integer.parseInt(parts[2]);
                    double weight = Double.parseDouble(parts[3]);

                    graph.addEdge(src, dest, weight);
                }
            }

        } catch (IOException e) {
            e.printStackTrace();
        }

        return graph;
    }
}