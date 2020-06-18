### A map is an object that maps keys and values
### A map cannot contain the same keys
### A map is similar to a dictionary in Python and a Key-Value pair in JS
### Each key must be unique within a map
### Maps are very important to know when dealing with Abstraction in OOP 
### Java has three types of maps: HashMap , TreeMap and and LinkedHashMap 
### Ordering:
        1- HashMap:Key Order
        2- TreeMap: Key Order
        3- LinkedHasMap: Reverse Insertion Order FIFO

### HashMap: 
    ```
      Key Order
    ```
```
import java.util.*;
public class HashMap
{
          public static void main(String args[])
          {
              //HashMap Declaration
              //HashMap<DT of Key, DT of Value> nameOfHashMap= new HashMap<DT of Key, DT of Value>();
              HashMap<Integer,String> myHashMap=new HashMap<Integer,String>();//Creating HashMap.
              
              myHashMap.put(2,"Papaya"); //Putting elements in Map.
              myHashMap.put(3,"Mango");
              myHashMap.put(1,"Apple");
              myHashMap.put(4,"Lemon");
              
              System.out.println(myHashMap);
          }
          
           //Output: {1=Apple, 2=Papaya, 3=Mango, 4=Lemon} meaning Key Order
}
```
### TreeMap
  ```
import java.util.*;
public class Main
{
          public static void main(String args[])
          {
              //Tree Declaration
              //TreeMap<DT of Key, DT of Value> nameOfTreeMap= new HashMap<DT of Key, DT of Value>();
              TreeMap<Integer,String> myTreeMap=new TreeMap<Integer,String>();//Creating HashMap.
              
              myTreeMap.put(2,"Papaya"); //Putting elements in Map.
              myTreeMap.put(3,"Mango");
              myTreeMap.put(1,"Apple");
              myTreeMap.put(4,"Lemon");
              
              System.out.println(myTreeMap);
          }
          
           //Output: {1=Apple, 2=Papaya, 3=Mango, 4=Lemon}
           //meaning Key Order
}
  
  
      
  ```
### LinkedHashMap
  ```
      Ordered by Insertion FIFO
  ```
  
```
import java.util.*;
public class Main
{
          public static void main(String args[])
          {
              //LHM Declaration
              //LinkedHashMap<DT of Key, DT of Value> nameOfLinkedHashMap= new LinkedHashMap<DT of Key, DT of Value>();
              LinkedHashMap<String,String> myLHashMap=new LinkedHashMap<String,String>();//Creating Linked HashMap.
              
              myLHashMap.put("MW","Calculus3"); //Putting elements in Map.
              myLHashMap.put("MWF","OrgCh1");
              myLHashMap.put("T","DS");
              myLHashMap.put("F","Music");
              
              System.out.println(myLHashMap);
          }
          
           //Output: {MW=Calculus3, MWF=OrgCh1, T=DS, F=Music}
           //meaning Reverse Insertion Order FIFO
}
  ```
