import static java.util.Objects.*;
public class User implements Comparable<User>
{
    private final String firstName;
    private final String lastName;

    public User(String fN, String lN)
    {
        firstName = fN;
        lastName = lN;
    }


    // overriden from java.lang.Object
    @Override
    public String toString(){return firstName+" "+ lastName;}

    @Override
    public boolean equals(Object o)
    {
        if (!(o instanceof User))
            return false;

        if (o == this)
            return true;

        User u = (User) o;
        return this.firstName.equals(u.firstName)
        && this.lastName.equals(u.lastName);
    }

    @Override
    public int hashCode(){return hash(firstName, lastName);}

    //overriden from java.lang.Comparable
    @Override
    public int compareTo(User arg0) 
    {
        if (arg0 == this)
            return 0;
        
        // we want to sort by first AND last name
        return this.firstName.compareTo(arg0.firstName)+
        this.lastName.compareTo(arg0.lastName);
    }

}