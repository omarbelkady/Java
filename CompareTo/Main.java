import static java.lang.System.*;
import java.util.*;
public class Main 
{
    static void log(Object o){out.print(o);}
    static void logLn(Object o){out.println(o);}

    public static void main(String [] args)
    {
        TreeSet<User> users = new TreeSet<>();
        users.add(new User("Kevin", "Nguyen"));
        users.add(new User("Lyndon", "Nguyen"));
        users.add(new User("Vince", "Li"));
        users.add(new User("Alan", "Ngo"));
        users.add(new User("Varshika", "Pichela"));
        users.add(new User("Lucinda", "Nguyen"));
        users.add(new User("Carlos", "Ovalle"));
        users.add(new User("Smruti", "Shah"));

        logLn(users);
        // Should print
        // [Alan Ngo, Carlos Ovalle, Kevin Nguyen, Lucinda Nguyen, Lyndon Nguyen, Varshika Pichela, Vince Li, Smruti Shah]
    }
}