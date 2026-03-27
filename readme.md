# 🚀 Smart Route Planner using A* and Dijkstra (Java Swing)


## 📌 Project Overview

The **Smart Route Planner** is a Java-based desktop application that finds the shortest path between locations using advanced graph algorithms.  
It implements and compares **Dijkstra’s Algorithm** and **A\*** (A-Star) algorithm to analyze performance and efficiency.

This project demonstrates real-world application of **Data Structures and Algorithms**, aligning with concepts such as graphs, heaps, and searching techniques.


## 🎯 Objectives

- Implement graph-based pathfinding system  
- Compare Dijkstra and A* algorithms  
- Analyze performance (time, nodes visited, cost)  
- Visualize routes using Java Swing GUI  
- Apply core DSA concepts in a real-world problem  


## ⚙️ Features

- 📍 Add and manage nodes (locations)  
- 🛣️ Add weighted edges (roads)  
- 🔍 Find shortest path between source and destination  
- ⚡ Run Dijkstra Algorithm  
- 🚀 Run A* Algorithm with heuristic  
- 📊 Compare:
  - Path cost  
  - Execution time  
  - Nodes visited  
- 🖥️ Interactive GUI for visualization  


## 🧠 Data Structures Used

- Graph (Adjacency List)  
- Priority Queue (Min Heap)  
- HashMap  
- ArrayList  
- Set (Visited nodes)  


## 🧮 Algorithms Implemented

### 🔹 Dijkstra Algorithm

- Guarantees shortest path  
- Explores all possible paths  
- No heuristic used  

### 🔹 A* Algorithm

- Uses heuristic function  
- Faster than Dijkstra in most cases  
- Formula:  
  ```f(n) = g(n) + h(n)```


## 📊 Algorithm Comparison

| Metric        | Dijkstra | A*      |
|--------------|----------|---------|
| Speed        | Slower   | Faster  |
| Accuracy     | Optimal  | Optimal |
| Heuristic    | No       | Yes     |
| Nodes Visited| More     | Less    |


## 🖥️ Tech Stack

- **Language:** Java  
- **GUI:** Java Swing  
- **IDE:** IntelliJ IDEA / Eclipse  
- **Concepts:** Graph, Heap, Searching Algorithms  


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



## ▶️ How to Run

1. Clone the repository  

```
git clone https://github.com/your-username/smart-route-planner.git
```


2. Open project in your IDE (IntelliJ / Eclipse / VSCode ) 

3. Navigate to:
```
src/main/Main.java
```

4. Run the application  


## 📸 Output

The application displays:

- Shortest path  
- Total distance (cost)  
- Time taken  
- Nodes explored  
- Visual graph representation  


## 👥 Team Members

- Student 1 – Graph & Data Structures  
- Student 2 – Algorithms (Dijkstra & A*)  
- Student 3 – GUI Development (Swing)  
- Student 4 – Integration & Testing  


## 📌 Future Enhancements

- Real-world map integration (Google Maps API)  
- Web-based version (Spring Boot + React)  
- Traffic-based dynamic routing  
- Multi-destination routing  


## 📚 Conclusion

This project demonstrates how data structures like graphs and algorithms like Dijkstra and A* can be applied to solve real-world routing problems efficiently.  
It highlights the importance of choosing the right algorithm based on performance and use case.


## ⭐ Acknowledgment

This project is developed as part of the **Data Structures using Java** course to apply theoretical concepts in practical scenarios.