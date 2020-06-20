/*
A linked Hash map maintains the order at which we declare the dictionary values NOT in alphabetical order
*/
import java.util.*;
public class LinkedHashMapTest
{
   /**
     * LinkedHashMap maintain insertion order 
     *  
     * */ 
    public static void main (String[] args)
    {
            Map<String, Integer> m = new LinkedHashMap<>();
            m.put("Timothy",5);
            m.put("Joey",10);
            m.put("Dennis",66);
            m.put("Varshika",-54);
            m.put("Sanjna",-524);
            System.out.println(m);
        
    }
}
