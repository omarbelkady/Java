# Sets

- A set is a collection of:
    - unordered elements
    - unique elements

- Doesn’t know where they are, just knows that they exist there.
- No performance decrease when sample size increase as opposed to an Array



### When To Use:

- don’t care how many times something exists or where it exists
- Use sets over arrays because it is faster and simpler to performs operations on it 



- A set is a collection of:
    - unordered elements
    - unique elements

- Doesn’t know where they are, just knows that they exist there.
- No performance decrease when sample size increase as opposed to an Array


### Operations You Can Perform On A Set:

- .add()
    - only appends to the set if the element is not present
    - if it is present you get a boolean return type back of false

- .addAll(collection)
    - add to my set all the elements from specified collection

- .clear()
    - removes all the elements from the set

- .hashCode()
    - give the hashCode of the instance of my set

- .isEmpty()
    - checking to see if my set is empty or not

- .remove()
    - throw out a specific item from my set

- .size()
    - output to me the size of my set

- .toArray()
    - generate an Array for me of all the items within my set

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
