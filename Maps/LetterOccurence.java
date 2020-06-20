//This program calculates the number of letters in a string

import java.util.*;

public class LetterOccurence
{
    public static void main (String[] args)
    {
    		Map<Character, Integer> m = new HashMap<>();	
            String str = "Hello My Name is Omar and I am super social";
            for(char x:str.toCharArray())//take the string and place it inside a character Array
            {
                //Now we will check how many times a character exists within the array
               
                //If it already exists have it update the value
                if(m.containsKey(x))
                {
                    int old=(int)m.get(x);
                    m.put(x,old+1);
                }
                
                //If it doesn't exist create a new key and give it a value of 1
                else
                {
                    m.put(x,1);
                }
                
            }
            //Print the occurence of the letters to the console
            System.out.println(m);
        
    }
}
