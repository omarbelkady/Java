
import java.util.*;
public class ObjectType 
{
    public static void logLn(Object o){System.out.println(o);}

        public static void main(String[] args)
        {
            /**
             * OBJECT TYPES EXTEND java.lang.Object IMPLICITLY
             * ARRAYS ARE ALSO OBJECTS
             */ 
            List<String> li = new ArrayList<>();
            li.add("spongebob");
            li.add("patrick");
            logLn(li);
        }
}
         