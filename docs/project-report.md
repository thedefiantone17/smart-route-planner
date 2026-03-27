# 📘 SMART ROUTE PLANNER USING A* AND DIJKSTRA ALGORITHM


## 📌 Abstract

The Smart Route Planner is a Java-based application that determines the shortest path between locations using graph-based algorithms. This project implements and compares Dijkstra’s Algorithm and A* (A-Star) Algorithm to evaluate their performance in terms of path cost, execution time, and nodes visited.

The system uses an adjacency list to represent graphs and provides a graphical interface using Java Swing to visualize routes. The project demonstrates how data structures and algorithms can be applied to solve real-world routing problems efficiently.


## 📌 Introduction

With the increasing need for efficient navigation systems, shortest path algorithms play a vital role in applications such as GPS navigation, network routing, and logistics.

This project focuses on implementing two widely used shortest path algorithms:
- Dijkstra’s Algorithm
- A* Algorithm

The system allows users to input a source and destination and computes the optimal path using both algorithms, providing a comparative analysis.


## 🎯 Objectives

- To implement graph data structures using adjacency lists  
- To apply Dijkstra and A* algorithms for shortest path finding  
- To compare algorithm performance based on efficiency  
- To design a GUI-based application using Java Swing  
- To demonstrate real-world application of DSA concepts  


## 🧠 Data Structures Used

- Graph (Adjacency List Representation)  
- Priority Queue (Min Heap)  
- HashMap  
- ArrayList  
- Set (Visited Nodes)  


## 🧮 Algorithms Used

### 🔹 Dijkstra Algorithm
- A greedy algorithm that finds the shortest path from a source node to all other nodes  
- Works with non-negative weights  
- Guarantees optimal solution  

### 🔹 A* Algorithm
- An extension of Dijkstra with heuristic optimization  
- Uses function:  
  f(n) = g(n) + h(n)  
- Faster in practical scenarios  


## ⚙️ System Design

The system is divided into multiple layers:

- Graph Layer → Manages nodes and edges  
- Algorithm Layer → Implements Dijkstra and A*  
- GUI Layer → Handles user interaction  
- Utility Layer → Provides helper functions  


## 📂 Project Structure
```
smart-route-planner/
├── src/
│ ├── graph/
│ ├── algorithm/
│ ├── gui/
│ ├── util/
│ └── main/
│
├── docs/
├── README.md
└── .gitignore
```


## 🔄 Working Methodology

1. User selects source and destination  
2. Graph is loaded into memory  
3. Algorithm is selected (Dijkstra / A*)  
4. Shortest path is computed  
5. Result is displayed in GUI  
6. Performance metrics are compared  


## 📊 Algorithm Comparison

| Parameter       | Dijkstra Algorithm | A* Algorithm |
|----------------|------------------|-------------|
| Speed          | Slower           | Faster |
| Accuracy       | Optimal          | Optimal |
| Heuristic      | Not used         | Used |
| Nodes Visited  | More             | Less |


## 🖥️ Implementation Details

- Programming Language: Java  
- GUI Framework: Java Swing  
- IDE Used: IntelliJ IDEA / Eclipse  
- Data Input: File-based or manual input  


## 📸 Output

The system displays:
- Shortest path  
- Total distance  
- Execution time  
- Number of nodes visited  
- Graphical route visualization  


## 📌 Advantages

- Efficient shortest path computation  
- Modular and scalable design  
- Easy to understand and use  
- Demonstrates real-world application of DSA  


## ❌ Limitations

- Works only with predefined graph data  
- No real-time traffic handling  
- GUI is basic  


## 🚀 Future Enhancements

- Integration with real-world map APIs  
- Web-based implementation  
- Traffic-aware routing  
- Multi-destination optimization  


## 📚 Conclusion

This project successfully demonstrates the implementation of graph-based shortest path algorithms. Dijkstra provides reliable results, while A* improves efficiency using heuristics. The comparison highlights the importance of choosing the right algorithm based on the problem context.


## 👥 Team Members

- Student 1 – Graph & Data Structures  
- Student 2 – Algorithms (Dijkstra & A*)  
- Student 3 – GUI Development  
- Student 4 – Integration & Testing  


## 📖 References

- Data Structures and Algorithms in Java – Robert Lafore  
- Data Structures with C – Seymour Lipschutz  
- Algorithm Design Techniques (Course Material)  

