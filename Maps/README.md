
## Maps

  

- A map is an object that maps keys and values

- Cannot contain the same keys

- similar to a dictionary in Python and a Key-Value pair in JS

- Keys must be unique within a map

- Maps are very important to know when dealing with Abstraction in OOP

  

### Java has three types of maps: HashMap , TreeMap and and LinkedHashMap

  

### Ordering:

  

<br  />

1. HashMap
  
- Check if Empty: isEmpty()
- Remove a particular key: .remove()
- Does Not Maintain Insertion Order
- Holds A Value Depending on A Key
- Only Holds Unique Elements
- Lookup & Insertion: O(1)
- Only allowed to store 1 Null Key
- Allowed to store multiple null values

2. TreeMap
  
- Key Order
- Only Holds Unique Elements
- Lookup & Insertion: O(log(n))
- Cannot Store Null as a key
- Allowed to store multiple null values
- Maintains Ascending Orders

3. LinkedHasMap:

- Only Holds Unique Elements
- Allowed to store only one null key
- Allowed to store multiple null values.
- Maintains Insertion Order
- FIFO
  
  

```java

import java.util.*;
public  class  HashMap
{
	public  static  void  main(String  args[])
	{
		//HashMap Declaration
		//HashMap<DT of Key, DT of Value> nameOfHashMap= new HashMap<DT of Key, DT of Value>();

		HashMap<Integer,String> myHashMap=new  HashMap<Integer,String>();//Creating HashMap.

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

  
```java
import java.util.*;

public  class  Main
{
	public  static  void  main(String  args[])
	{
		//Tree Declaration

		//TreeMap<DT of Key, DT of Value> nameOfTreeMap= new HashMap<DT of Key, DT of Value>();

		TreeMap<Integer,String> myTreeMap=new  TreeMap<Integer,String>();//Creating HashMap.

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

  

```java
import java.util.*;
public  class  Main
{
	public  static  void  main(String  args[])
	{
		//LHM Declaration

		//LinkedHashMap<DT of Key, DT of Value> nameOfLinkedHashMap= new LinkedHashMap<DT of Key, DT of Value>();

		LinkedHashMap<String,String> myLHashMap=newLinkedHashMap<String,String>();//Creating Linked HashMap.

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