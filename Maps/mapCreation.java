/*
Maps are like dictionaries in python
Maps are like key-value pairs if coming from JS
There are three types of maps: hashMap, treeMap, linkedHashMap
Maps are similar to key-value pairs unlike arrays, instead of indexing keys by an index we index them by a key. The key can be a String, Number, Char, Float. This key links us to a value
Unlike, treeMap and linkedHashMap, a Hash Map does not retain an order. All the elements will contain unique elements/keys.
*/

package tutorial

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class Main
{
	public static void main(String [] args)
	{
		//Map creation Syntax
		Map m= new HashMap();
		//Now Since I did that I have to make a few import of libraries
		
		//How to append to a map/HashMap
		//m.put(key0,val0);
		m.put("Rasmus",6);
		
		System.out.println(m);//shows {Rasmus=6}
		
		//How to retrieve a value based on a key input
		System.out.println(m.get("Richard"));

		//We can append any data type to map and we won’t be restricted
		m.put("Speed", 65);

		//We can append say Id number and DOB
		m.put(1657015, 03301994);
		
		//Doing this will not add a 2nd key-value pair to the list. Instead it is 
    //overwriting. We cannot have two of the same keys existing in the map
		m.put(1657015, 03301995);


		
	}
	

}

