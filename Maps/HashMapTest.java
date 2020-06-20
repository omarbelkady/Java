import java.util.*;
public class HashMapTest
{
       /**
     * HashMap are not ordered
     *  
     * */ 
    public static void main (String[] args)
    {
        Map<String, Integer> m = new HashMap<>();
        m.put("Timothy",5);
        m.put("Joey",10);
        m.put("Dennis",66);
        m.put("Varshika",-54);
        m.put("Sanjna",-524);
        System.out.println(m);
    }

}
