# 🏗️ System Design


## 📌 Overview

The **Smart Route Planner** is designed using a modular architecture where different components handle graph representation, algorithms, user interface, and utilities independently.

This separation ensures:
- Scalability  
- Maintainability  
- Easy team collaboration  


## 🧱 System Architecture

The system follows a **layered architecture**:
```
User Interface (GUI - Swing)
↓
Controller / Integration Layer
↓
Algorithm Layer (Dijkstra, A*)
↓
Graph Layer (Node, Edge, Graph)
↓
Data Layer (File Input / Map Data)
```


## 📂 Module Breakdown

### 1. Graph Layer (`graph/`)
Handles core data structure representation.

**Classes:**
- `Node.java` → Represents a location (with coordinates)
- `Edge.java` → Represents a connection with weight
- `Graph.java` → Stores adjacency list and manages graph


### 2. Algorithm Layer (`algorithm/`)
Implements pathfinding logic.

**Classes:**
- `Dijkstra.java` → Shortest path using Dijkstra
- `AStar.java` → Optimized pathfinding using heuristic
- `PathResult.java` → Stores result (path, cost, nodes visited)


### 3. GUI Layer (`gui/`)
Handles user interaction and visualization.

**Classes:**
- `MainFrame.java` → Main application window
- `MapPanel.java` → Graph visualization
- `ControlPanel.java` → Buttons and controls


### 4. Utility Layer (`util/`)
Provides helper functionalities.

**Classes:**
- `TimerUtil.java` → Measures execution time
- `FileLoader.java` → Loads graph data from file


### 5. Main Layer (`main/`)
Application entry point.

**Class:**
- `Main.java` → Launches application and initializes components


## 🔄 Data Flow
```
User Input (Source, Destination)
↓
GUI triggers algorithm
↓
Algorithm fetches graph data
↓
Shortest path is calculated
↓
Result sent to GUI
↓
Path displayed visually



## 🧠 Design Decisions

### 1. Adjacency List for Graph
- Efficient for sparse graphs  
- Reduces memory usage  


### 2. Priority Queue (Min Heap)
- Used in both Dijkstra and A*  
- Ensures optimal no
```


## 🧠 Design Decisions

### 1. Adjacency List for Graph
- Efficient for sparse graphs  
- Reduces memory usage  


### 2. Priority Queue (Min Heap)
- Used in both Dijkstra and A*  
- Ensures optimal node selection  


### 3. Separation of Concerns
- Each module handles one responsibility  
- Reduces dependency and conflicts  


### 4. Heuristic in A*
- Euclidean distance used  
- Improves performance significantly  


## 📊 Class Relationship (Conceptual)
```
Graph → contains → Node, Edge
Algorithm → uses → Graph
GUI → interacts with → Algorithm
Main → initializes → GUI + Graph
```


## ⚙️ Scalability Considerations

- Can integrate real-world map APIs  
- Can extend to web-based architecture  
- Can support dynamic weights (traffic, time)  


## 🔐 Error Handling

- Invalid node selection handled  
- Empty graph conditions checked  
- File read exceptions managed  


## 📌 Conclusion

The system is designed with a clean separation between data, logic, and presentation layers.  
This modular approach ensures that the project is easy to maintain, extend, and scale in future implementations.
