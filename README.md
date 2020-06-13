# Java
I created this repository because my friend who taught me C++ 
and advanced programming concepts advised me to learn java and he is a 6342 56837.
After, performing research I found out java is very popular and use a lot in the industry. 
Thank you 6342 56837. Java is Method Naming Camel case= blaBlaBla. 
Java Class Naming is Pascal Case=BlaBlaBla

## Error Codes and Meaning

### 1- cannot find symbol PART 1
Raised when you try to call an undeclared variable
```
public class Omar{
    public static void main(String [] args)
    {
        int a = 1;
        int b= 2;
        int c= 3;
        mean = (a+b+c)/2;
        System.out.println(mean);
    }
}
```

In line 8 we try to print to the console mean we have set the value of mean but we never declared it
To solve we do this
```
public class Omar{
    public static void main(String [] args)
    {
        int a = 1;
        int b= 2;
        int c= 3;
        double mean = (a+b+c)/2;
        System.out.println(mean);
    }
}
```
### 2- cannot find symbol PART 2
Raised when you try to call an undeclared variable
```
public class Great{
    public static void main(String [] args)
    {
        the_best_method;
    }
    
    public static void the_best_method()
    {
      System.out.println("This is the best method in the world");
    }
    
}
```

In line 4 we are incorrectly calling the_best_method but we forget the parenthesis. To fix this error I must place the open and close parenthesis

```
public class Great{
    public static void main(String [] args)
    {
        the_best_method();
    }
    
    public static void the_best_method()
    {
      System.out.println("This is the best method in the world");
    }
    
}
```
### 3- cannot find symbol : 
### symbol: class Scanner 
### location: class Great
Raised when you are using the scanner
```
public class Great{
    public static void main(String [] args)
    {
        Scanner useInput= new Scanner();
        int l = useInput.nextInt();
    }
}
```

In line 4 we are using the scanner but we never imported the library that enables us to use it 
```
import java.util.Scanner;
public class Great{
    public static void main(String [] args)
    {
        Scanner useInput= new Scanner();
        int l = useInput.nextInt();
    }
}
```

### 4- class <.x.> is public, should be declared in a file named <X>.jav
### Ignore the .x. its <x> how its displayed this error is raised when I do this:

```
public class Thebest
{     
     public static void main(String[] args) {
          System.out.println("Hello, world!");
     }
}
```  
## SOOO, I save the file and I name it Lemon.java well, it will error because our class is Thebest so that means
## our file name should be Thebest.java



