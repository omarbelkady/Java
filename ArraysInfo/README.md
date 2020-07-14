## Fill with one value
```java
    int [] ramoArray= {41,14,191,1,23,190};
    Arrays.fill(ramoArray, 23);
    //When printing an array allways to String method or else it will error
    System.out.println(Arrays.toString(ramoArray));

```

## Sort
```java
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
## Array List
ArrayList<DT>name = new ArrayList<DT>();
<> means generic it is used to work with many types(classes, objects, primitives…)
	
```java
public class GenericMethodTest {
   	// generic method printArray
	public static < E > void printArray( E[] inputArray)
	{
		// Display array elements
		for(E element : inputArray)
		{
			System.out.printf("%s ", element);
		}
		System.out.println();
	}
}
```

We put the data type wrapper class not INT

To append to the array list name.add(); to push to the array list

To obtain a value from AL name.get(indexGOESHERE)

To update a value from AL name.set(index,newVal)

To obtain the size of the AL name.size() DO NOT FORGET THE PARENTHESIS BECAUSE ITS A METHOD

To get the key of the Al System.out.println(name.indexOf(7));

If you pass in a value that doesn’t exist in the Al you get -1 returned to you NOT ERROR!!!

The .contains method returns a boolean if the value exists it returns true if it doesn’t exist it returns false.

To check if the value exists within the arraylist to execute a condition
if(nameOfArrList.contains(Value))
{
//execute this bit of code
}


If you try to run the nameOfArrList.get(valueGoesHere) and the value doesn’t exist you get an Index out of Bounds error thrown to the console.

To remove an element in an array list we can use a while loop
```java
while(!nameOfArrList.isEmpty())
{
	System.out.println(nameOfArrList.remove(0))
}
```
To remove the entire content of an Arr List
```java
nameOfArrList.clear();
```
