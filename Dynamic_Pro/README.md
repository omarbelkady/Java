### Dynamic Programming



#### Fibonacci Algorithm

- A Tree like data structure
- Any computation I made within the tree that I plug into the formula ...
- I shouldn't have to compute again thanks to memoization it stores the value
- in an object and spits it out whenever there is a call to it
- I store the answer within the memo and caches that result
- My key is the nth number in the fibonacci sequence
- My value is the value i.e. output
- When making recursive calls, thanks to memoization, it outputs a stored value
    - and doesn't have to travel through any further subtrees
- So memoizing my fib function ends up reducing the number of recursive calls I make

##### Runtime Complexity

- Memoizing my algo I see a linear functional call pattern
- i.e. I have n node and that's why the runtime complexity is O(n)
- where n is the top level call

##### Space Time Complexity

- O(n)


#### Grid Traveler

- You want to travel
- You start at the top left corner and your goal is to end in the bottom right corner
- You can only go down or to the right
- You CANNOT move up or left or diagonally 
- Find the # of different ways you can travel
- gridTravelTo(2,3) means how many different ways you can travel
- ...from the top left to bottom right in a 2x3(2 rows by 3 columns)
    - 3 dif ways:
        - right, right, down
        - right,down, right,
        - down, right, right
- gridTravelTo(1) means do nothing because you are already there
- gridTravelTo(0,1) means 0 rows and 1 column i.e. the grid is empty
- gridTravelTo(1,0) means 1 row and 0 columns i.e. the grid is empty
- gridTravelTo(8,0) means 8 rows and 0 columns i.e. the grid is empty
- gridTravelTo(0,0) means 0 rows and 0 columns i.e. the grid is empty
- base case: if one of your dimensions is empty then there is no grid
