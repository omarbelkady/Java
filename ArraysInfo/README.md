## Fill with one value
```
    int [] ramoArray= {41,14,191,1,23,190};
    Arrays.fill(ramoArray, 23);
    //When printing an array allways to String method or else it will error
    System.out.println(Arrays.toString(ramoArray));

```

## Sort
```
import java.util.Arrays;
import java.util.Scanner;
import java.util.ArrayList;

public class ArraySort
{
      public static void main(String [] args)
      {
      int [] omarArray= {41,14,191,1,23,190};
      Arrays.sort(omarArray);
      //if omarArray was multidim
      //Arrays.parallelSort(omarArray);
      System.out.println(Arrays.toString(omarArray));
      }
}
```
