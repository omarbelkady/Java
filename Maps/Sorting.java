import java.util.*;

public class Sorting
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

