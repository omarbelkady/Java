#Sets
#### A set is a collection of unordered elements that are unique it cannot contain duplicate values.
#### Similar to a bubble it doesn’t know where they are, just knows that they exist there.

#### regardless of how many elements are within whether it is 10000000 elements or 2 elements.
#### As opposed to arrays the longer it gets the longer it will take to perform an operation within it
### There are three types of sets: 
- HashSet: <i>no particular order</i>
    - insertion: O(1)
    - removal: O(1)
    - contains: O(1)
- LinkedHashSet: <i>insertion order</i>
    - insertion: O(1)
    - removal: O(1)
    - contains: O(1)
- TreeSet: <i>sorted order</i>
    - insertion: O(n*logn)
    - removal: O(n*logn)
    - contains: O(n*logn)
### We use a set when we don’t care how many times something exists or where it exists.
### We use sets over arrays because it is faster and simpler to do operation on. 
