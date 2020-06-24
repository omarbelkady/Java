import java.util.*;
public class User
{
    private String fN;
    public String lN;
    
    static void log(Object o)
    {
        System.out.print(o);
    }

    static void logln(Object o)
    {
        System.out.println(o);
    }



    public String getFullName()
    {
        return getFirstName() + " "  + lN.toUpperCase();
    }

    public String output()
    {
        return "Hi, my name is "+ getFirstName() + " "  + getLastName() + ".";
    }
    
    //Now I will overload output
    public String output(boolean nice)
    {
        if(nice)
        {
            return "You\'re an awesome person"+ " "  + getFullName() + ".";

        }
        return "You\'re not a good person"+ " "  + getFullName() + ".";
    }
    
    public String getFirstName()
    {
        return fN;
    }

    //Setter not returning anything ∴ void
    public void setFirstName(String firstName)
    {
        //Assigning the fName value we pass in to the field firstName
        fN=firstName.trim();
        //the .strip remove any whitespaces before output.
        
    }

    public String getLastName()
    {
        return lN;
    }

    //Setter not returning anything ∴ void
    public void setLastName(String lastName)
    {
        //Assigning the lN value we pass in to the field lastName
        lN=lastName;
    }
    

    public static void printUsers(List<User> users)
    {
        //I want to iterate through the users
        //For each User o in users)
        for(User o:users)
        {
            logln(o.getFullName());
        }
    }

    public static int searchList(List<User> users, String fN, String lN)
    {
        return searchList(users, fN + " "  + lN);
    }

    //OVERLOAD
    public static int searchList(List<User> users, String fullName)
    {
        //iterate through the list
        for(int i=0;i<users.size();i++)
        {
            //Use .equals instead of ==
            if(users.get(i).getFullName().equals(fullName))
            {
                return i;
            }
        }

        //if no match
        return -1;
    }


   //Now I will override the ToString
    @Override
    public String toString()
    {
        //To override remember to give the method to override the same name
        return "  " + getFullName() + "]";
    }

    //Intended to put obj in a hash table ∴ turn the hash code into a number
    @Override
    public int hashCode()
    {
        final int prime = 19;
        int res = 1;
        res= prime * res + ((fN==null) ? 0 : fN.hashCode());
        res= prime * res + ((lN==null) ? 0 : lN.hashCode());
        return res;
    }

    @Override
    public boolean equals(Object obj)
    {
        if(this == obj)
            return true;
        if(obj == null)
            return false;
        if(getClass() != obj.getClass())
            return false;

        User other = (User) obj;

        if(fN == null){
            if(other.fN != null)
                return false; 
    }
    
    else if(!fN.equals(other.fN))
        return false;

    if(lN == null)
    {
        if(other.lN != null)
           return false; 
    }
    else if(!lN.equals(other.lN))
        return false;
    return true;    

    }
}
