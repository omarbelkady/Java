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
## SOOO, I save the file and I name it Lemon.java well, it will error because our class is Thebest so that means our file name should be Thebest.java


### 5- < identifier> expected
This error is raised when I try to write code outside of a method which is unintentionally done.
```
    public class Test { 
        System.out.println("Hello!");
    
        public static void main(String[] args) {
            System.out.println("World!");
        }
    }
```
 
To fix I just place the print Statement of hello inside of main

```
    public class Test { 
        public static void main(String[] args) {
            System.out.println("Hello!");
	    System.out.println("World!");
        }
    }
```

### 6- illegal start of expression

An "illegal start of expression" error occurs when the compiler when we start a expression before closing the previous one.
```
    public class Test {
        public static void main(String[] args) {
            my_method();
    
    
        public static void my_method() {
            System.out.println("Hello, world!");
        }
    } 

    
    5 errors found:
    File: Test.java  [line: 6]
    Error: Test.java:6: illegal start of expression
    File: Test.java  [line: 6]
    Error: Test.java:6: illegal start of expression
    File: Test.java  [line: 6]
    Error: Test.java:6: ';' expected
    File: Test.java  [line: 6]
    Error: Test.java:6: ';' expected
    File: Test.java  [line: 9]
    Error: Test.java:9: reached end of file while parsing
```

To fix this piece of code, I simply add a closing curly brace for the main method. To know we are doing the right thing, just look at the lines of code before the error, there may be a missing closing paranthesis or a missing closing curly brace. This would give us what the error is.
```
    public class Test {
        public static void main(String[] args) 
	{
            my_method();
        }   
    
        public static void my_method() 
	{
            System.out.println("Hello, EVERYONEEEE!");
        }
    } 
```

### 6- incompatible types

incompatible types error is raise when we are facing with data type errors. We can overcome this, by converting say a char to an int. We can convert a double to an integer with typecasting. BUt WE CANNOT convert between primitive types and objects. A primitive type is say a: null, undefined, boolean, number, string or char. However objects can be: Arrays, Maps, Sets, Functions, Regular Expression or Date..
```
incompatible types

This error occurs when there are type issues with your program. It is possible to convert between some kinds of types; for example, you can freely convert a char to an int and vice versa, and you can also convert a double to an int with some typecasting. However, you can not convert between primitive types and objects such as String. For example:
    public class Test {
        public static void main(String[] args) {
            int num = "Hello, world!";
        }
    }

    
    1 error found:
    File: Test.java  [line: 3]
    Error: Test.java:3: incompatible types
    found   : java.lang.String
    required: int
	
Typically, you cannot "fix" this error as you can for most other errors. This is not a syntax error, but rather an error in type logic. It usually does not make sense to try to put a String into an integer type. However, there are some applications where you need to do something like a String to int conversion, such as when the String is a representation of a number:
    public class Test {
        public static void main(String[] args) {
            int num = "500";
        }
    }
	
    
    1 error found:
    File: Test.java  [line: 3]
    Error: Test.java:3: incompatible types
    found   : java.lang.String
    required: int
	
To fix something like this, you might be able to depend on Java classes such as the Integer class, which is capable of taking a String that represents a number and converting it to an integer type:
    public class Test {
        public static void main(String[] args) {
            int num = Integer.parseInt("500");
        }
    }
However, this kind of solution to an "incompatible types" error is the exception and not the rule, as this error usually comes from a mistake in logic.

invalid method declaration; return type required

Every method in Java requires that you explicitly state the return type of the method. Even methods that do not return a value must explicitly say void in the method signature, just as the main method does.
When a method declaration does not contain a return type, this error will occur:

    public class Test {
        public static void main(String[] args) {
            int x = getValue();
            System.out.println(x);
        }
    
        public static getValue() {
            return 10;
        }
    }

	
    1 error found:
    File: Test.java  [line: 7]
    Error: Test.java:7: invalid method declaration; return type required
	
To fix this, simply insert the appropriate return type in the method signature:
    public class Test {
        public static void main(String[] args) {
            int x = getValue();
            System.out.println(x);
        }
    
        public static int getValue() {
            return 10;
        }
    }

java.lang.ArrayIndexOutOfBoundsException: <X>

An ArrayIndexOutOfBoundsException is thrown when an attempt is made to access an index in an array that is not valid. The only valid indices for an array arr are in the range [0, arr.length - 1]; any attempt to access an index outside of this range will result in this error. For example:
    public class Test {
        public static void main(String[] args) {
            int[] arr = {1, 2, 3};
            for (int i = 0; i <= arr.length; i++) {
                System.out.println(arr[i]);
            }
        }
    }
	
    
    java.lang.ArrayIndexOutOfBoundsException: 3
	at Test.main(Test.java:5)
	at sun.reflect.NativeMethodAccessorImpl.invoke0(Native Method)
	at sun.reflect.NativeMethodAccessorImpl.invoke(NativeMethodAccessorImpl.java:57)
	at sun.reflect.DelegatingMethodAccessorImpl.invoke(DelegatingMethodAccessorImpl.java:43)
	at java.lang.reflect.Method.invoke(Method.java:606)
	at edu.rice.cs.drjava.model.compiler.JavacCompiler.runCommand(JavacCompiler.java:272)
	
This error is quite similar to the java.lang.StringIndexOutOfBoundsException: String index out of range: <X> error that we have previously discussed. The error message for this kind of error is similarly irrelevant toward the end of the message. However, the first line lets you know that a problem with an array index was encountered, and the index in error was 3, in this case. The next line tells you that it encountered this error on line 5 of Test.java, inside the main method.
In this case, the error occurred because the for loop iterates too many times; the value of the loop index, i, reaches 4 and is therefore out of bounds. Instead, the upper bound should use the < boolean operator, or an equivalent statement.

    public class Test {
        public static void main(String[] args) {
            int[] arr = {1, 2, 3};
            for (int i = 0; i < arr.length; i++) {
                System.out.println(arr[i]);
            }
        }
    }
When dealing with an ArrayIndexOutOfBoundsException, it is usually helpful to print out the value of the index variable that is accessing the array and try to trace through to code to find out why it is reaching that (invalid) value.
java.lang.StringIndexOutOfBoundsException: String index out of range: v

A StringIndexOutOfBoundsException is thrown when an attempt is made to access an index in the String that is not valid. The only valid indices for a String str are in the range [0, str.length() - 1]; any attempt to access an index outside of this range will result in this error. For example:
    public class Test {
        public static void main(String[] args) {
            String str = "Hello, world!";

            String a = str.substring(-1, 3);
            String b = str.charAt(str.length());
            String c = str.substring(0, 20);
        }
    }
	
    
    java.lang.StringIndexOutOfBoundsException: String index out of range: -1
        at java.lang.String.substring(Unknown Source)
        at Test.main(Test.java:5)
        at sun.reflect.NativeMethodAccessorImpl.invoke0(Native Method)
        at sun.reflect.NativeMethodAccessorImpl.invoke(Unknown Source)
        at sun.reflect.DelegatingMethodAccessorImpl.invoke(Unknown Source)
        at java.lang.reflect.Method.invoke(Unknown Source)
        at edu.rice.cs.drjava.model.compiler.JavacCompiler.runCommand(JavacCompiler.java:271)
	
The error message for this kind of error becomes less relevant towards the end. However, the first line lets you know that a problem with a String index was encountered, and the index in error was -1. The next line tells you that it encountered this error while trying to perform the substring routine, which was called from the Test class on line 5. This "backtrace" of the error tells you the line numbers of the method calls involved so that you can trace your error to the source and correct it.
Note that all of a, b, and c would have thrown this error, but the program was halted after the first occurred.

This is not a compile-time error, but rather a runtime error. In other words, the compiler will accept this kind of error because it is a logical error. Additionally, it may not be known before the program is run that the error will occur. To fix this error, you often have to correct the logic of your program to ensure that the program will not try to access an invalid index.




### 6- illegal start of expression
