import java.util.*;

/**
 * I will be using a data structure that is the fastest to access 
 * js equivalent: JS Object, key: arg to fin and value: return val
 * in Java it would be a Hash Map
 */
public class Fib{
    
    static void log(Object o)
    {
   		System.out.print(o);
	}

    static void logln(Object o)
	{
        System.out.println(o);
    }

    //take in a number and return the nth number in the fibonacci sequence
    static int fibon(int x,Object memo = HashMap<Integer>())
    {
        if (x in memo)
        {
            return memo(x)
        }
        // if(x<=2)
        //     return 1;
        
        // return fibon(x-1) + fibon(x-2);
    }
    
    public static void main(String [] args){
        System.out.println(fibon(4));
        //Time Complexity: O(2^n) => Exponential
        /**Space Complexity: O(n) => Linear
         * Say I want to calculate the 5th fifth fibonacci number
         * that means fib(5) which  means 5,4, 3,2,1, 1
         * whenever I made a call to the leftmost 1 this stack frame
         * is popped from the stack. Since, I called the left one and popped it from 
         * the stack I would go and add the right most one (1)in the stack 
         * to be explored
         * 
         * As it is seen, the number of stack frames I use is exactly equal
         * to the height of the tree i.e. n ! This mean that the maximum
         * depth of my stack is also n.There for I have n operations
         * in space complexity which comes from the call stack
         * 
         */
    }
}