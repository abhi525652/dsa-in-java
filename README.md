# 🚀 Data Structures & Algorithms (DSA) Master Roadmap

Welcome to my DSA repository! This project serves as a comprehensive roadmap and code library tracking my journey through foundational and advanced computer science concepts. 

---

## 📊 Repository Tracker
Use these markers to track your progress:
- 🟩 **Complete**
- 🟨 **In Progress**
- ⬛ **Not Started**

---

## 🛠️ Part 1: Data Structures

### 1. Linear Data Structures
- [ ] Arrays & Strings 🟩
  - [ ] Static vs. Dynamic Arrays
  - [ ] Two Pointers Technique
  - [ ] Sliding Window (Fixed & Variable)
  - [ ] Prefix Sum / Kadane's Algorithm
- [ ] Linked Lists 🟨
  - [ ] Singly Linked List
  - [ ] Doubly Linked List
  - [ ] Circular Linked List
  - [ ] Fast & Slow Pointers (Floyd's Cycle Detection)
- [ ] Stacks & Queues ⬛
  - [ ] Stack (LIFO) implementation (Array/Linked List)
  - [ ] Queue (FIFO) implementation
  - [ ] Circular Queue & Deque (Double-ended Queue)
  - [ ] Monotonic Stack / Monotonic Queue

### 2. Hierarchical & Non-Linear Data Structures
- [ ] Trees ⬛
  - [ ] Binary Tree & Binary Search Tree (BST)
  - [ ] AVL Trees & Red-Black Trees (Self-balancing)
  - [ ] Segment Trees & Fenwick Trees (Binary Indexed Tree)
  - [ ] N-ary Tree & Trie (Prefix Tree)
- [ ] Heaps / Priority Queues ⬛
  - [ ] Min-Heap & Max-Heap implementation
  - [ ] Heap Sort
- [ ] Graphs ⬛
  - [ ] Graph Representations (Adjacency Matrix & List)
  - [ ] Directed vs. Undirected, Weighted vs. Unweighted

### 3. Hash-Based Data Structures
- [ ] Hashing ⬛
  - [ ] Hash Maps & Hash Sets
  - [ ] Collision Resolution (Chaining & Open Addressing)

---

## 🧠 Part 2: Algorithms

### 1. Foundational Algorithms
- [ ] Searching Algorithms ⬛
  - [ ] Linear Search
  - [ ] Binary Search (and variants like Search in Rotated Array)
  - [ ] Ternary Search
- [ ] Sorting Algorithms ⬛
  - [ ] Bubble, Selection, & Insertion Sort ($O(n^2)$)
  - [ ] Merge Sort & Quick Sort ($O(n \log n)$)
  - [ ] Radix & Counting Sort (Linear time)

### 2. Algorithmic Paradigms
- [ ] Recursion & Backtracking ⬛
  - [ ] Base cases & Stack Overflow prevention
  - [ ] Subsets, Permutations, & Combinations
  - [ ] N-Queens, Sudoku Solver, Knight's Tour
- [ ] Greedy Algorithms ⬛
  - [ ] Fractional Knapsack
  - [ ] Huffman Coding
  - [ ] Interval Scheduling
- [ ] Divide and Conquer ⬛
  - [ ] Binary Search variants
  - [ ] Matrix Multiplication (Strassen's)

### 3. Advanced Tree & Graph Traversals
- [ ] Graph & Tree Traversals ⬛
  - [ ] Breadth-First Search (BFS)
  - [ ] Depth-First Search (DFS) - Pre, In, and Post-order
- [ ] Advanced Graph Algorithms ⬛
  - [ ] Topological Sort (Kahn's Algorithm & DFS)
  - [ ] Shortest Path: Dijkstra, Bellman-Ford, Floyd-Warshall
  - [ ] Minimum Spanning Tree (MST): Prim's & Kruskal's
  - [ ] Disjoint Set Union (DSU) / Union-Find
  - [ ] Strongly Connected Components (Tarjan's & Kosaraju's)

### 4. Dynamic Programming (DP)
- [ ] Intro to DP ⬛
  - [ ] Memoization (Top-Down) vs. Tabulation (Bottom-Up)
  - [ ] Identifying Overlapping Subproblems & Optimal Substructure
- [ ] Classic DP Patterns ⬛
  - [ ] 0/1 Knapsack & Unbounded Knapsack
  - [ ] Longest Common Subsequence (LCS) & Longest Increasing Subsequence (LIS)
  - [ ] Matrix Chain Multiplication (MCM)
  - [ ] DP on Trees & DP with Bitmasking

---

## ⚡ Part 3: Mathematics & Advanced Topics

- [ ] Bit Manipulation ⬛
  - [ ] Bitwise operators (`AND`, `OR`, `XOR`, `NOT`, shifts)
  - [ ] Checking/Setting/Clearing bits
  - [ ] Bitmasking patterns
- [ ] Number Theory & Math ⬛
  - [ ] GCD & LCM (Euclidean Algorithm)
  - [ ] Sieve of Eratosthenes (Prime generation)
  - [ ] Modular Arithmetic & Fast Exponentiation
- [ ] String Advanced Algorithms ⬛
  - [ ] KMP Algorithm (Pattern Matching)
  - [ ] Rabin-Karp (Rolling Hash)
  - [ ] Z-Algorithm

---

## ⏱️ Complexity Cheat Sheet

| Data Structure / Algorithm | Average Time (Search) | Average Time (Insert) | Space Complexity |
| :--- | :--- | :--- | :--- |
| **Array** | $O(n)$ | $O(1)$ *(at end)* | $O(n)$ |
| **Binary Search Tree** | $O(\log n)$ | $O(\log n)$ | $O(n)$ |
| **Hash Table** | $O(1)$ | $O(1)$ | $O(n)$ |
| **Merge Sort** | $O(n \log n)$ | — | $O(n)$ |
| **Quick Sort** | $O(n \log n)$ | — | $O(\log n)$ |

---

## 📈 How to Use This Repo
1. **Clone the repo:** `git clone <your-repo-url>`
2. Pick a topic from the roadmap above.
3. Code the solution in your language of choice inside structured folders (e.g., `/Data-Structures/Arrays/`).
4. Update the checkbox `[ ]` to `[x]` and match the status emoji!