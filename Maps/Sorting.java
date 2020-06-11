import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;

public class Main
{
    public static void main (String[] args)
    {
            Integer [] m = {5,6,-64, -119,313,12,65,3,2};
    		//Arrays.sort(varNam,starting position, ending position(not including this),)
    		//Arrays.sort(m,1,6);
            
            //To sort the entire array
            Arrays.sort(m,0,9);
            for(int i:m)
            {
                System.out.print(i+" , ");
            }
    }
}

