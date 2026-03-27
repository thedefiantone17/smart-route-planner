# 🧮 Algorithm Explanation

---

## 📌 Overview

This project implements two fundamental shortest path algorithms:

- **Dijkstra’s Algorithm**
- **A\* (A-Star) Algorithm**

Both algorithms are used to find the shortest path between a source and destination in a graph.  
The project also compares their performance based on efficiency and nodes explored.

---

## 🔹 Dijkstra’s Algorithm

### 📖 Description
Dijkstra’s Algorithm is a **greedy algorithm** used to find the shortest path from a source node to all other nodes in a weighted graph with non-negative weights.

It explores all possible paths and guarantees the shortest path.

---

### ⚙️ Working Steps

1. Initialize distance of all nodes as infinity  
2. Set source node distance = 0  
3. Use a **priority queue (min-heap)**  
4. Extract node with smallest distance  
5. Update distances of adjacent nodes  
6. Repeat until all nodes are visited  

---

### ⏱️ Time Complexity

- Using Priority Queue:  
  **O((V + E) log V)**

---

### ✅ Advantages

- Always gives optimal solution  
- Works for all graphs with non-negative weights  

---

### ❌ Disadvantages

- Explores unnecessary nodes  
- Slower compared to A* in large graphs  

---

## 🔹 A\* (A-Star) Algorithm

### 📖 Description
A\* is an extension of Dijkstra’s Algorithm that uses a **heuristic function** to guide the search.

It is faster because it prioritizes nodes that are closer to the destination.

---

### ⚙️ Formula
```
f(n) = g(n) + h(n)
```

Where:
- **g(n)** = cost from start to current node  
- **h(n)** = estimated cost to destination (heuristic)  
- **f(n)** = total cost  

---

### 📐 Heuristic Used

In this project, we use **Euclidean Distance**:
```
h(n) = √((x1 - x2)² + (y1 - y2)²)
```

---

### ⚙️ Working Steps

1. Initialize open set (priority queue)  
2. Add source node  
3. Calculate f(n) for nodes  
4. Pick node with lowest f(n)  
5. Update neighbors  
6. Repeat until destination is reached  

---

### ⏱️ Time Complexity

- Worst case:  
  **O((V + E) log V)**  
- Practically faster due to heuristic  

---

### ✅ Advantages

- Faster than Dijkstra  
- Explores fewer nodes  
- Efficient for real-world maps  

---

### ❌ Disadvantages

- Depends on heuristic accuracy  
- May behave like Dijkstra if heuristic is poor  

---

## 📊 Comparison: Dijkstra vs A*

| Feature        | Dijkstra Algorithm | A* Algorithm |
|---------------|------------------|-------------|
| Type          | Greedy           | Heuristic-based |
| Speed         | Slower           | Faster |
| Accuracy      | Optimal          | Optimal |
| Heuristic     | Not used         | Used |
| Nodes Visited | More             | Less |
| Use Case      | General graphs   | Pathfinding (maps, games) |

---

## 📌 Conclusion

Both algorithms are effective for shortest path problems:

- **Dijkstra** is reliable and guarantees optimal results  
- **A\*** is more efficient and faster in practical scenarios  

In this project, A* performs better due to the use of heuristics, making it suitable for real-time route planning systems.

---