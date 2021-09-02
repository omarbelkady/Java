import java.util.*;

public class HashTable {
    static void log(Object o)
    {
   		System.out.print(o);
	}

    static void logln(Object o)
	{
        System.out.println(o);
    }

	public static void main(String[] args) {
        Hashtable<String, String> licenplates = new Hashtable<>();
        Enumeration people;
        String output;

        licenplates.put("David", new String("6543ML"));
        licenplates.put("Tracy", new String("6UN274"));
        licenplates.put("Bob", new String("37KU42"));

        //Retrieve All License Plates
        people = licenplates.keys();

        while(people.hasMoreElements()) {
            output = (String) people.nextElement();
            System.out.println(output + ": " + licenplates.get(output));
         }  


        //Outputs the number of elements within the hashtable
        logln(licenplates.size());
    }
}