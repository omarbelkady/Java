import java.util.*;
public class Caching 
{
    static void logLn(Object o){System.out.println(o);}
    static void log(Object o){System.out.print(o);}
    /**
     * naive implementation, takes a long time
     * @param n
     * @return fibonaci of the number
     */
    static long fib(long n)
    {
        if (n==0)
            return 0;
        
        if (n == 1 || n == 2)
            return 1;
        
        return fib(n- 1) + fib(n-2);
    }
    /**
     * optimized implementation using HashMap as cache
     * @param n
     * @return fibonaci of the number
     */
    static Map<Long, Long> cache = new HashMap<>();
    static long optFib(long x)
    {
        long zero = 0;
        long one = 1;
        long two = 2;
        cache.put(zero,zero);
        cache.put(one, one);
        cache.put(two, one);

        if (cache.containsKey(x))
            return cache.get(x);

        cache.put(x, optFib(x-1)+optFib(x-2));
        return cache.get(x);
    }

    public static void main(String [] args)
    {
        for (long i =0; i<100; i++)
        {
            logLn(i + ": "+ optFib(i));
        }
    }
}