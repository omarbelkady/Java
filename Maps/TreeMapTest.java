
import java.util.*;
public class TreeMapTest
{
    /**
     * TreeMaps maintain sorted order by keys
     *  
     * */ 
    public static void main (String[] args)
    {
	        
            Map<String, Integer> m = new TreeMap<>();
            m.put("Timothy",5);
            m.put("Joey",10);
            m.put("Dennis",66);
            m.put("Varshika",-54);
            m.put("Sanjna",-524);
            System.out.println(m);
    }
}
/*
In the console we will have the sorted dictionary in 
alphabetical order: Dennis(the key)=value of dennis, 
Joey(the key)=value of Joey, Timothy(the key)=value of Timothy
*/

