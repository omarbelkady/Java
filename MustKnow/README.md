### Things You Must Know In DS And Algo w/t Java

- 78 63526


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

### Example: Binary Search

1. We start by searching in the middle of the array. Is the item in the middle smaller or bigger than the elem I am searching for?

2. If it is smaller, I truncate the left partition and search the right partition of the array. This narrows by search by 1/2

3. The runtime of Binary Search Is O(log(n)) because I reduce my work in half in every step.

### Exponential Growth: O(2^n) ... i.e. opposite of Logarithmic growth

1. Logarithmic growth slows down as the input size growth i.e d/dx[ln(x)] = 1/x whereas d/dx[2^n]= 2^nln(2)

2. exponential growth as you can see increases at an increasing rate whereas logarithmic growth increases at a decreasing rate

3. However, exponential growth becomes slow sooner than logarithmic growth


## Ideal when creating an Algo: super fast and scalable and take the least amount of Mem
- However, there is always a tradeoff either I save space or I save 


### Space Complexity

- I do not look at the original algo I look at the additional things I will append to my algo
- Then, I infer how much space I have to further allocate for the additional stuff I added

- How To Find Ways to preserve memory when you have limited space


### Arrays:

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

### When Wanting to Build A Dynamic Array Use:
1. ArrayList: Grows by 50% of its size   ... synchronous aka one 7652626 thread at a time
2. Vector: Grows by 100% of its size ... asynchronous aka multiple threads at a time