### Things You Must Know In DS And Algo w/t Java

- 78 63526

#### DS You Must Know

##### ★★★★★Most Popular Data Structures★★★★★

- Array [Linear and Non-Primitive]

- Char [Primitive]
- Double [Primitive]
- Float [Primitive]
- Graph [Non-Linear and Non-Primitive]
- Integer [Primitive]
- Linked List [Linear and Non-Primitive]
- Stack [Linear and Non-Primitive]
- String [Primitive]
- Tree [Non-Linear and Non-Primitive]
- Queue [Linear and Non-Primitive]

##### Things You Must Know To Understand Java
- Abstract
- Arrays And ArrayList
- Collections
- Conditionals
- Default
- Enum
- Exception Handling
- Final Keyword
- Generics
- Interfaces
- Loops
- Maps
- OOP(Abstraction, Encapsulation, Inheritance, Polymorphism)
- Passing By Value Vs. Passing By Reference
- Reference Types Vs Primitive Types
- Sets
- Static
- ToString & Equals & Hashcode

<br />

##### ★★★★Operations You Can Perform On A Data Structure★★★★


- Delete: Remove an item from the data structure
- Insert: Add an item to the data structure at any location
- Merge: Combining the items within data structure A and data structure B into a single one(i.e. call it C)
- Search: Look up an item's location within the data structure
- Sort: Arrange items within the data structure in a specific order
- Traverse: Visit each item in the data structure to perform some operation(e.g. search/sort)


##### Big O, Big Omega, Big Theta

- O(n): A Measure of the longest amount of time for an algorithm to complete(...e.g. <=)
    - Used in the worst case
- Ω(n): A Measure of the shortest amount of time for an algorithm to complete(...e.g. >=)
    - Used in the Best Case
- Θ(n): A Measure of the average amount of time for an algorithm to complete(...e.g. ==)
    - Used in the Average Case


##### DS Operations

- Traverse: Visiting each item in the DS once AND ONLY ONCE
- Search: Finding an item in the DS which satisfies one or more conditions
- Insert: Adding items of the same type in the DS
- Delete: Removing items of the same type in the DS
- Sort: Sort the items within the DS in ascending or descending order
- Merge: Storage of items which are in two different data file by joining them into one data file



1. **Stack**

- Linear
- LIFO/FILO
- Dinner Plates 
- When items are pushed they are placed on the top
- Only can push/pop an element from this DS at one end only
- Requires You To Have One Reference Pointer i.e. "TOP"
- Applications:
    - Redoing/Undoing stuff within your application
    - Memory Management
- Allows you to fully control how memory is allocated and deallocated
- Pitfalls of Stack:
    - Cannot access a random element
    - Not able to be scaled i.e. not flexible

```java
import java.util.*;

Stack<Integer> myStack= new Stack<Integer>();
```


2. **Linked List**

- Sequential Order
- No Random Access
- Better alternative to Sets because they are dynamic
- Chain of nodes. Every node contains data and a pointer to the subsequent node
- Each unit is called a node
- A Node is composed of data and a pointer
- Last node has a null pointer i.e. the pointer is used but doesn't point to anything 
- Folders on your computer(i.e. last folder is null because it has no folder within it)
- Node[0] = Head
- Node[n-1] = Tail


```java
import java.util.*;
/*
How To Declare:
LinkedList<dataType>nameOfLL = new LinkedList<dataType>() */
LinkedList<String> mylist=new LinkedList<String>();
```

3. **Array**

- Indexed
- When Size increases performance decreases
- All the elements in the DS must be of the same type
- Muffin/Egg Tray
- Rectangular in shape
- Good For Storing Multiple items in it
- Address in Memory increases by the size of the datatype you store
- I.e. say I have 6 ints location in memory of the first is 104 second is 108 third is 112
- because an int = 4 bytes that's why you increment by 4
- Searching an Array by index is super fast, supply to an idx to the array and it will be super fast to locate it
- Calc of Mem Address Runtime is: O(1)
- Downsides: Static, failure to know size if too large: waste memory too small: array gets filled quickly
- And If I fill it up quickly I must create a 2nd array and copy the elements of the first array into the second

- Cost of Lookup: O(1)
- Cost of Insertion: O(n)
- Cost Of Removal: O(n)

1. Best Case: I remove from the end of the array and I delete that index
2. Worst Case: I remove from the beginning of the array and shift all the items in the right one index less to fill
3. Therefore, for the worst case it is O(n) when removing an item in the array


- Dynamic Array DS in Java: ArrayList
- Grows by 50% of its size everytime I add sth to it
- synchronous aka one 7652626 thread at a time

#### Declaring an array in Java
```java
import java.util.*;
public class Arr{
    public static void main(String [] args){
        /*
            1. declare the data type of the array
            2. indicate that I want an array data structure by using the brackets.. MUST BE EMPtY
            3. give it a name
            4. use the new operator to allocate memory for the array
            5. repeat the data type of the array
            6. indicate the size of the array 

        */
        int [] myArr = new int[7];
        //this output the memory location of the array
        //System.out.println(myArr);

        /*
        if you know the vals:

        */
        int [] myArrTw = {7, 6, 5, 2, 6, 2, 6}

        //proper way to output
        System.out.println(Arrays.toString(myArr))
    }
}
```

4. **Vector** : Grows by 100% of its size everytime I add sth to it... asynchronous aka multiple threads at a time


5. **Queues**

- People waiting in line in the Movie Theatre
- Linear
- FIFO
- Has Side A and Side B
- Pushes On Side A i.e. Enqueue
- Pops On Side B i.e. Dequeue
- Ordered Collection
- Operations: add(), remove()
- Part of the java.util.* package
- Part of the collection Interface
- Two Classes Implement the Queue Interface:
    - Linked List
    - Priority Queue
- Supports all the methods in the Collection Interface
- Element & Remove Method Throws NoSuchElementException if the queue is empty
- Poll Method removes the head of the queue and returns it
	- if the queue is empty the poll method call returns null
- Requires You To Have Two Reference Pointers i.e. "FRONT" & "REAR"

```java
//How To Declare a Priority Queue of type String
import java.util.*;

public class queueimpl{
    public static void main(String [] args){
        Queue<String> mypq = new PriorityQueue<>();
    }
}

```

6. **Hash Table**


- Contains an index and its corresponding Hash_Value
- All items within it are unique
- Cannot store null as a key nor as a value
- First parameter within your Hash Table declaration is the data type of the key
- Second parameter within your Hash Table declaration is the data type of the value
- Restaurant Pager i.e. you give your name and they assign a number to you when a seat frees up you get an empty table

```java
/*
How To Declare a Hash Table of type:
- Integer for the key
- String for the value
*/

import java.util.*;

public class HashTable{
    public static void main(String [] args){
        Integer mystr;
        Hashtable<Integer,String> myhashtable = new Hashtable<Integer,String>();
        myhashtable.put(1,"Blue");
        myhashtable.put(2,"Red");
        myhashtable.put(3,"Yellow");

        //Storage of the keys in the HashTable Set
        Set<Integer> keys = myhashtable.keySet();

        Iterator<Integer> itr = keys.iterator();


        while (itr.hasNext()) { 
            // Getting Key
            mystr = itr.next();
            System.out.println("Key: "+mystr+"\nValue: "+myhashtable.get(mystr));
         } 
    }
}

```

7.**Trees**

- Hierarchical Structure where data is org in a hierarchy and everything is linked together
- Not the same as linked list because LL is linear
- Log(n) runtime complexity where n is the number of levels
- Trees are faster to access than a LL because they are non-linear
- Node: person who holds our data
- Child Node: person who has a parent
- Leaf: person who has no children
- Edge: person who connects two nodes
- Root: person who is the topmost node
- Node Height: # of edges from the node to the deepest leaf node
- Node Depth: # of edges from the root to the node
- Tree Height: Depth of the deepest node
- Degree of A Node: Total # of branches of that node
- Leaves: Person who has no children
- Use when you want to store items in a hierarchial fashion
- Quicker to access/search than a LL but slower than an Array
    - AVL Tree:
        - Self-balanced trees
        - Searching, Inserting, Deleting in the worst case is logarithmic time complexity
        - Balance factor is determined by the height of the right subtree tree
        - ... minus the height of the left subtree
        - I have a height of 1 in the left subtree ... I have a height of 1 in the right subtree
        - balance factor = 0
        - Objective: make sure every node is balanced i.e. bf = -1,0,1
        - all nodes must be balanced ... if one node is not balanced the whole tree is unbalanced
        - balance factor in relation to its neighboring subtree
        - -1 means the right subtree is greater than the left subtree
        - 1 means the left subtree is greater than the right subtree
        - 0 means the left subtree and right subtree have equal lengths
        - LL rotation means I inserted a node in the left subtree of the left subtree of A
        - LR rotation means I inserted a node in the right subtree of the left subtree of A
        - RR rotation means I inserted a node in the right subtree of the right subtree of A
        - RL rotation means I inserted a node in the left subtree of the right subtree of A
        - Binary Tree
        - Can Have 0,1,2 nodes
        - right child is always larger & left child is always smaller
    - Binary Search Tree:
        - Used for sorting, getting and searching data
        - Non-linear
        - Arranged in some order
        - no duplicate vals
        - val on the left most subtree of the node is always smaller than the val on its immediate right
    - B-tree
        - every b-tree has an order i.e. the number of levels
        - Root node must have a minimum of two children
        - A leaf in a b-tree the i.e. the parent to the last level in a b-tree(i.e. child nodes)
        - ...must always have more nodes than the child so as the keys(1 key... 2 child nodes, 2 keys, 3 child nodes)
        - the keys cannot be larger than the leaf nodes
        - All leaf nodes must be at the same level
        - whenever you delete a leaf node all you have to do is do a rotation to the values
        - if you delete a middle value you must do rebalancing
        - whenever one of the rules is violated, I have to rebalance and restructure my tree
        - ... by shifting the center value
        - once you access one element in the block you have access to all the elements in the block 
    - B*-tree
        - Values in the middle are not essentially referred to as value
        - they are just navigation values(go left, go down, go right)
        - the parent is always the largest value of its left child subtree
        - the number of values I am allowed to store at the leaf level is determined by a parameter k*
        - so if k* = 2 that means I am allowed to have a max of 2k* elements at the leaf level
        - ...and a minimum of 2
        - m is the order of the tree i.e. the number of the levels
        - B* trees have a smaller height than Btrees because all the data is stored in the leaf level
- Node on the left is always less than the node on the right
- Linux File Structure
- Classification Tree in Biology

- Runtime of Operations Performed on A Balanced Tree

| Operation   | Runtime |
| ----------- | ----------- |
| Inserting   | log(n)      |
| Deleting    | log(n)      |
| Rebalancing | log(n)      |
| Searching   | log(n)      |
#### 4 Cases of AVL Trees of Balance Factors

- We will never have to make more rotations than the number of levels
- Number of level is log<sub>2</sub>(n)

##### Case A
```
	    A(-2)
	  /    \
   B(-1)    C(0)          height of 3 vs height of 1 
   /   \               ∴ BF=-2
 D(-1)  E(0) 
 /
F(0)     
```

- Balance Factor of: -2
- The left most subtree has a height that is 2 levels greater than the  right subtree
- Perform a single right rotation

```
      B(0)
	 /   \
   D(0)  A(0)           
   /     / \
 F(0)  E(0) C(0)
     
```
<br />
<br />


##### Case B
```
	 A(-2)
	/   \
  B(1)  C(0)
  / \   
D(0) E(1) 
      \   
       F(0)  
```
<br />
<br />

- Perform a single left rotation on the subtree
- Make E the root node of the left subtree
- Make B the left child node of E
- Make F the right child node of E
```
		 A(-2)
		/   \
	   E    C(0)
	 /   \  
	B     F 
   /
  D    
```




##### Case C

```
	 A(-2)
	/   \
  B(1)  C(0)
        /  \   
      D(0) E(1) 
             \   
             F(0)
```

- Perform a single left rotation
- Make A the root node of the left subtree
- Make E the root node of the right subtree
- Make F the child node of E
- Make B the left child node of  A
- Make D the right child node of  A

```
	 C(0)
	/    \
  A(0)   E(1)
 /   \     \
B(0) D(0)  F(0)  
       
```




##### Case D

```
	  A
	/  \
   B    C
       / \   
      D   E 
     /      
    F         
```

1. Perform a single right rotation now we are in Case C
2. That means To Solve Case D I perform a double right-left rotation

```
	  A
	/  \
   B    D
       / \   
      F   C       
           \
            E
```







8. **Heap**

- Special Tree Based DS
- Binary Tree
- Parent node makes a comparison with its child nodes and are arranged accordingly
- Two Scenarios:
    - Key present at the root node is the greatest among all of its children and successors
    - Key present at the root node is the smallest among all of its children and successors
- Patients Being Admitted to the Hospital
    - Patients with life-threatning situation get taken care of first
    - Patients that don't have threatening situation wait in line


9. **Graphs**

- Finite set of vertices, nodes and edges. The edges are what connect one vertex with another
- Graphs are connected in a network form
- Vertex: Circle
- Edge: Arrow
- Non-linear
- Nodes are the vertices(i.e. endpoints)
- Edges are the lines/arcs that connect one node with another node
- Types:
    - **Directed**: no particular direction and two-way relation
      - e.g. Friends on Facebook
    - **Undirected**: Particular Direction and one-way relation
      - e.g. who you're following on Twitter
    - **Unweighted**: Every edge has no particular weight
    - **Weighted**: Each edge has a respective value this is referred to as weight
      - e.g. distance between cities
- **Note** A (directed/undirected )graph is independent of being weighted or not 
- We can have:
  - Direct Weighted Graphs
  - Direct Unweighted Graphs
  - Undirected Weighted Graphs
  - Undirected Unweighted Graphs
## Important Algorithms
- Graph Algorithms:
    - BFS
    - DFS
    - Dijkstra(Shortest Path)
- Simple Graph: Each edge connects to two different vertices whereby no two edges connect to the same group of vertices
- Multi-graph: An edge can connect to the same pair of vertices
- Google Maps Usage of Connecting Roads i.e. vertex  therefore, I use an algo to determine the shortest path between vertex A & B

### Sorting
- Bubble Sort
- Bucket/Insertion Sort
  - Runtime: O(n^2) ... ie terrible
  - useful when paired with other more complex sorting algo
  - i.e. Quicksort, Merge Sort
  - good for ordering a small sample size
  - Step 1: iterate from the 2nd array to the nth array over the array
  - Step 2: compare the element which you are at with its parent/predecessor
  - Step 3: if the key is less than its predecessor compare it to the preceding elements
  - Step 4: Move the greater element up one spot to give space for the modified element
- Counting Sort
- Heap Sort
- Merge Sort
- Quick Sort
- Selection Sort



<br />

## Search Algorithms

1. Breath First Search[Graphs]
2. Depth First Search[Graphs]
3. Binary Search[Linear]
4. Linear Search

**Other**
- Recursive Algorithms
- Hashing Algorithms
- Randomized Algorithms



1. When the sample size increases of an Array what should you do?
   - Use A Linked List DS because it increases performance and isn't slow as the sample size increases

2. For Loop Runtime: O(n) where n is the size of the input

3. Function with 1 operation: O(1)

4. Say I have a print statement before a for loop and after what's the runtime:
   - Print statement: O(1)
   - For Loop: O(n)
   - Print statement: O(1)

Total: O(1+n+1)= O(n+2)

But actually the runtime is O(n) because when we calculate runtime we drop the constants

5. Say I have two for loops what's the runtime:

- for loop 1: O(n)
- for loop 2: O(n)
- Total: O(n+n) = O(2n)
- I drop the constant because I want an approximation of the runtime ∴ O(n)


6. Say I have a function that takes not one but two args the first is an integer array and the second is a string array

- First For Loop: O(n)
- Second For Loop: O(n)
- Total: O(n+n)= O(2n) = O(n) aka linear time


7. Nested For Loop Runtime: O(n *n) = O(n^2) which is Quadratic Time


8. O(n) vs O(n^2) .. Which is Faster?
- O(n) is faster because O(n^2) is faster at the beginning but is slow after
- All in all, the more for loops we nest the slower our algorithm becomes aka 1 for loop with 2 nested for loops = 3 therefore O(n^3) is slower.

### O(logn)

- More scalable and more efficient than an algorithm that runs in linear or quadratic time


### Example: Linear Search
- We are searching for 10 in a sorted array of 10 numbers
- We search one index at a time and that's why its linear i.e. O(n).
- In the worst case scenario, if the number I am looking for is at the end of the array then I have to inspect one index at a time
- The more items I have the longer the operation will take

```java
import java.util.*;

public class LinSearch{
    
    public static void main(String [] args){
        int [] myArr = {18, 34, 65, 92, 32, 94, 15, 10, 16, 8, 26};  
        int elem,elemExistsTimes=0;   
        Scanner sc = new Scanner(System.in);  
        System.out.println("Enter The Element You Are Hunting For: ");  
        elem = sc.nextInt();  

        for(int x = 0; x<10; x++){
            if(myArr[x] == elem){
                elemExistsTimes= x + 1;
                break;
            }

            else{
                elemExistsTimes = 0;
            }
        }

        if(elemExistsTimes != 0)  
        {  
            System.out.println("I found the item at location: "+elemExistsTimes);  
        }

        else{
            System.out.println("Not Found Man");
        }
    
    }
    
}
```

```java
public class Main{
    
    public void logLn(Object o){
        System.out.println(o);
    }

    public void log(Object o){
        System.out.print(o);
    }
    
    public void printArr(int [] arr){
        logLn(arr[0]); //has one operation and takes constant time to run ===> O(1)
        logLn(arr[0]); //has two operation but still O(1)
    }

    /*
    small small will run fast but as the sample size increase e.g. 1,000,000 items then you will have it running slowly
    
    cost of algo: linear and is directly proportional to the size of the input therefore the runtime complexity O(n)
    */
    public void logging(int [] nums){
        for(int i=0; i<nums.length; i++){
            logLn(nums[i]);
        }
    }

    public static void main(String [] args){

    }
}
```



### Example: Binary Search

1. We start by searching in the middle of the array. Is the item in the middle smaller or bigger than the elem I am searching for?

2. If it is smaller, I truncate the left partition and search the right partition of the array. This narrows by search by 1/2

3. The runtime of Binary Search Is O(log(n)) because I reduce my work in half in every step.

### Hash Function

- If I have an array that can store N key-val pairs. Then I will need a function that will give me an index of an element in my array
- After I supplied it with a key 


### Exponential Growth: O(2^n) ... i.e. opposite of Logarithmic growth

1. Logarithmic growth slows down as the input size growth i.e d/dx[ln(x)] = 1/x whereas d/dx[2^n]= 2^nln(2)

2. Exponential growth as you can see increases at an increasing rate whereas logarithmic growth increases at a decreasing rate

3. However, exponential growth becomes slow sooner than logarithmic growth


## Ideal when creating an Algo: super fast and scalable and take the least amount of Mem
- However, there is always a tradeoff either I save space or I have save time


### Space Complexity

- I do not look at the original algo I look at the additional things I will append to my algo
- Then, I infer how much space I have to further allocate for the additional stuff I added

- How To Find Ways to preserve memory when you have limited space

### Time Complexity

- Amount of time it takes for an algorithm in terms of the input size to the algo
- Number of memory accesses performed, the number of times you compared ints, the number of nested loops are executed
- ... or any unit related to the amount of time the algorithm will take


#### Searching A LL value Time C

- O(n) because the val we are searching for maybe stored in the last node aka n that is worst case.


#### Searching A LL index Time C

- O(n) because the val we are searching for maybe stored in the last node aka n that is worst case.





#### Insertion Sort Implementation

```java
//Compares two adjacent items
public class InsertionSort{
    public void sortMyArr(int [] arrayNum){
        int myNumber = arrayNum.length;
        for(int begin=0; begin < myNumber; ++begin){
            int keyVal = arrayNum[begin];
            int beta = begin - 1;
            while(beta >= 0 && arrayNum[beta] > keyVal)
            {
                arrayNum[beta+1] = arrayNum[beta];
                beta = beta - 1;
            }
            arrayNum[beta + 1] = keyVal;
        }
    }

    static void displayMyArr(int [] arrayNum){
        int number = arrayNum.length;
        for(int start=0; start < number; start++){
            System.out.print(arrayNum[start] + " " );
        }
        System.out.println();
    }

    public static void main(String [] args){
        int [] myArrInp = { 60, 45, 32, 47, 86, 30};
        InsertionSort myFirstObj = new InsertionSort();
        myFirstObj.sortMyArr(myArrInp);
        displayMyArr(myArrInp);
    }
}

/*
Best Case TC: O(n) for comparison and O(1) when performing a swap
Worst Case TC: O(n^2) for comparison and O(n^2) when performing a swap
Average Case TC: O(n^2) for comparison and swap
Space C: O(1) because I am adding a var


*/
```


#### Selection Sort Implementation

```java
import java.util.*;

public class Selectionso {
    public static void Selectionso(int myArr[])
    {
        /*
            0. take an unsorted num of elements within an array
            1. find the minimum and place it on its own
            2. find the second min and place it after the min in the other array
            3. repeat till you have one left(i.e. largest) and place it at the end of the array
         */
        int arr_size = myArr.length;
        for(int x=0;x<arr_size-1;x++){
                int min_pos = x;
                for(int y = x+1; y<arr_size ; y++) {
                    if (myArr[y] < myArr[min_pos]) {
                        min_pos = y;
                    }
                }
                    
                /*
                switch the min 
                item with the 
                first item
                 */
                int temporary = myArr[min_pos];
                myArr[min_pos] = myArr[x];
                myArr[x] = temporary;
        }
    }

    public static void PrintMyArray(int myArr[])
    {
        for(int i=0; i<myArr.length;i++)
        {
            System.out.print(myArr[i]+ " ");
        }
        System.out.println();
    }


    public static void main(String [] args)
    {
        int thisArr [] = {16,12, 7, 19, 30};
        Selectionso(thisArr);
        PrintMyArray(thisArr);
    }
}
```

#### Merge Sort Implementation

```java
public class MergeSort
{
	// Merges two subarrays of arr[].
	// First subarray is arr[left half..middle index]
	// Second subarray is arr[middle+1..right half]
	void merge(int arr[], int l, int m, int r)
	{
		// Find sizes of two subarrays to be merged
		int n1 = m - l + 1;
		int n2 = r - m;

		/* Creating two temporary arrays */
		int L[] = new int [n1];
		int R[] = new int [n2];

		/*
		Copy the 
		info into 
		temporary arrays
		*/
		for (int i=0; i<n1; ++i)
			L[i] = arr[l + i];
		for (int j=0; j<n2; ++j)
			R[j] = arr[m + 1+ j];


		// Initializing the indexes of the two subarrays
		int i = 0, j = 0;

		// Initial index of merged subarray array
		int k = l;
		while (i < n1 && j < n2)
		{
			if (L[i] <= R[j])
			{
				arr[k] = L[i];
				i++;
			}
			else
			{
				arr[k] = R[j];
				j++;
			}
			k++;
		}

		/* Copy remaining elements of L[] if any */
		while (i < n1)
		{
			arr[k] = L[i];
			i++;
			k++;
		}

		/* Copy remaining elements of R[] if any */
		while (j < n2)
		{
			arr[k] = R[j];
			j++;
			k++;
		}
	}

	// Main function that sorts arr[l..r] using
	// merge()
	void sort(int arr[], int l, int r)
	{
		if (l < r)
		{
			// Find the middle point
			int m = (l+r)/2;

			// Sort first and second halves
			sort(arr, l, m);
			sort(arr , m+1, r);

			// Merge the sorted halves
			merge(arr, l, m, r);
		}
	}

	/* A utility function to print array of size n */
	static void printArray(int arr[])
	{
		int n = arr.length;
		for (int i=0; i<n; ++i){
		    System.out.print(arr[i] + " ");
		}
		System.out.println();
	}


	public static void main(String args[])
	{
		int arr[] = {12, 11, 13, 5, 6, 7};

		System.out.println("Array That I passed In: ");
		printArray(arr);


        System.out.println(" ");
		MergeSort obj = new MergeSort();
		obj.sort(arr, 0, arr.length-1);

		System.out.println("The Sorted array:");
		printArray(arr);
	}
}

```


#### Insertions at the End in a LL index Time C

- It depends where we want to insert the item if we want to insert at the end then we must have our original tail of the node point to the last item
- Then, I need the tail change reference from the old node to the new node
- O(1)

#### Insertions at the beginning of a LL Time C

- O(1)


#### Insertions at the middle of a LL Time C

- e.g. insert in the tenth node
1. find the node ==> O(n) operation
2. update the length ==> O(1) operation
3. Runtime: O(1)+O(n)=O(n)



### Deleting

From The Beginning:
0. Make the head of the LL point to the second node = O(1)
1. Remove the link from the previous head so there is no more reference = 
Failure to do so will make Java's garbage collector think this link is still in use
2. That's why I must unlink this object from the second object


From The End:
O(n)
0. I goto the tail but first I must know the preceding node to have the tail now point to the preceding node instead of the last node
1. Traverse the list from the head all the way to the tail as soon as I get to the second to last node I keep a ref to it
2. I unlink the second to last node from the last node
3. Have the tail point to the second to last node
4. Therefore the runtime Complexity: O(n)

From The Middle:
O(n)
1. Traverse the entire list
2. Goto the middle node 
3. Unlink the middle node from the list
4. Link the preceding node to the subsequent node
5. Remove the link of the middle node so that the link gets removed from memory by Java's garbage collector

## Sets in Java

#### HashSet

- does not maintain order
- no duplicates
- allowed to use null vals
- compare using .equals() method
- implementation of a HashMap more or less


#### LinkedHashSet

- maintains insertion order
- no duplicates
- allowed to use null vals
- compare using .equals() method


#### TreeSet

- maintains sorted order
- no duplicates
- no null values
- compare using .compareTo() method







#### Divide & Conquer

1. Break the problem into two or more sub problems until you can solve each one


### Space Complexity

```java
import java.util.*;
public class myclass{
    public static void main(String [] args){
        int a;
        int b;      //O(1)

        int n = 56;
        int myArr[n]; //O(n)

        int mySecArr[n][n];     //O(n^2)

        //Total: O(1) + O(n) + O(n^2) ≈ O(n^2)
    }
}
```
