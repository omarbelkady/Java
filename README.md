# Java
I created this repository because my friend who taught me C++ 
and advanced programming concepts advised me to learn java and he is a 6342 56837.
After, performing research I found out java is very popular and use a lot in the industry. 
Thank you 6342 56837. Java is Method Naming Camel case= blaBlaBla. 
Java Class Naming is Pascal Case=BlaBlaBla


## Class Naming is Pascal Case:
```java
	class OmrutiLovesToReadTextbooks{}
```

## Method is Camel Case:
```java
	public void sayHello()
	{
		logln("Hello y\'all my major is "+ major+ ". My name is " + firstName + " " + lastName);
	}
```

## How to compile and run Java on terminal

- $javac *.java
- $java <MAIN_CLASS>

## Way #2
- Only do this if you're using chromebooks, which are trash computers
```bash
root@omarbelkady:$~ java callingProgram.java MethodProgram.java
```
## Error Codes and Meaning

### 1- cannot find symbol PART 1
Raised when you try to call an undeclared variable
```java
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
```java
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
```java
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

```java
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
```java
public class Great{
    public static void main(String [] args)
    {
        Scanner useInput= new Scanner();
        int l = useInput.nextInt();
    }
}
```

In line 4 we are using the scanner but we never imported the library that enables us to use it 
```java
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

```java
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
```java
    public class Test { 
        System.out.println("Hello!");
    
        public static void main(String[] args) {
            System.out.println("World!");
        }
    }
```
 
To fix I just place the print Statement of hello inside of main

```java
    public class Test { 
        public static void main(String[] args) {
            System.out.println("Hello!");
	    System.out.println("World!");
        }
    }
```

### 6- illegal start of expression

An "illegal start of expression" error occurs when the compiler when we start a expression before closing the previous one.
```java
    public class Test {
        public static void main(String[] args) {
            my_method();
    
    
        public static void my_method() {
            System.out.println("Hello, world!");
        }
    } 
```

To fix this piece of code, I simply add a closing curly brace for the main method. To know we are doing the right thing, just look at the lines of code before the error, there may be a missing closing paranthesis or a missing closing curly brace. This would give us what the error is.
```java
public class Test
{
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

### 7- incompatible types

The incompatible types error is raised when we are facing with data type errors. We can overcome this, by converting say a char to an int. We can convert a double to an integer with typecasting. BUt WE CANNOT convert between primitive types and objects. A primitive type is say a: null, undefined, boolean, number, string or char. However objects can be: Arrays, Maps, Sets, Functions, Regular Expression or Date..
```java
public class Test 
{
	public static void main(String[] args) 
	{
		int num = "Hello, world!";
	}
}
```
The above code is an error because we are assigning the string Hello World to the variable num of type int.
To fix this error I must put a integer within the quotes and use the ParseInt method. This is not a syntax error but a logical error.
Step 1: Change the String value from Hello, world! to 500
```java
public class Test
{
	public static void main(String[] args) 
	{
		int num = "500";
        }
}
```
	
Step 2: Use parsing to convert the string to an integer
```java
public class Test
{
	public static void main(String[] args) 
	{
            int num = Integer.parseInt("500");
        }
}
```
	


### 8- invalid method declaration; return type required

Every method in Java requires that you explicitly state the return type of the method. Even methods that do not return a value must explicitly say void in the method signature, just as the main method does.
When a method declaration does not contain a return type, this error will occur:
```java
public class Test
{
        public static void main(String[] args) 
	{
		int x = getValue();
		System.out.println(x);
        }
    
        public static getValue() 
	{
            return 10;
        }
}


 ```
To fix this, simply insert the appropriate return type in the method signature and the error will go away:


```java
public class Test 
{
        public static void main(String[] args) 
	{
            int x = getValue();
            System.out.println(x);
        }
    
        public static int getValue() 
	{
            return 10;
        }
}
```
### 9-java.lang.ArrayIndexOutOfBoundsException: <X>

An ArrayIndexOutOfBoundsException is thrown when an attempt is made to access an index in an array that is not valid. This means that say an array has 8 elements and we know that the number of elements in index is 7. We start counting at 0. So, if I enter a value of 8 or greater to access, this will raise an error. 
```java
 public class Test {
        public static void main(String[] args) {
            int[] arr = {1, 2, 3};
            for (int i = 0; i <= arr.length; i++) {
                System.out.println(arr[i]);
            }
        }
    }
```
The code above errored due to the for loop iteration settings. The first element is index 0 which is fine however, the function's output of arr.length of our array named arr of type int is 3. However, we are using the comparison operator of <=. This means less than or equal to. If, we change it to < it will not error. The equal means it will try to access index 3 which is the 4th item in the array which we do not have.
```java
public class Test {
        public static void main(String[] args) {
            int[] arr = {1, 2, 3};
            for (int i = 0; i < arr.length; i++) {
                System.out.println(arr[i]);
            }
        }
}
```


### 10- StringIndexOutOfBoundsException 
The exception StringIndexOutOfBoundsException is thrown to the console when an attempt is made to access an index in 
the String that is not valid. The only valid index of the String we can access is from 0 to the (length of the String-1). This means that if the array 8 elements. The biggest number I can access is 7 not 8. If we enter any number greater than 7 for access will throws an outofBoundsException. This is an error in runtime not compile-time. It is accepted by the compiler because it is a logical error

``` java
public class Test 
{
        public static void main(String[] args)
	{
            String str = "Hello, world!";

            String a = str.substring(-1, 3);
            String b = str.charAt(str.length());
            String c = str.substring(0, 20);
        }
}

```

To fix this I simply change the String a declaration in line 7 from index -1 to 1. Then another error, will raise because str.length output is 13. The last index we can access is 12. Then, we must change the datatype of b because the operation will output a character not a string. The fourth change we must make is change 20. The biggest index we can access is 12.
Therefore the bottom code is bug free

```java
public class Test 
{
        public static void main(String[] args)
	{
            String str = "Hello, world!";

            String a = str.substring(1, 3);
            char b = str.charAt((str.length())-1);
            String c = str.substring(0, 6);
        }
}

```


### 11- illegal start of expression
``` java
    public class Omar {     
        public static void main(String[] args) {
            omarMethod(1.0, 2, "Hello!");
        }
    
        public static void omarMethod(double a, String b, int c) {
            System.out.println(a + " " + b + " " + c);
        }
    }
    
```

This errors because I have called the methods with the specified data types in the wrong order. I must call it in the right order
```java
public class Omar 
{     
        public static void main(String[] args) {
            omarMethod(1.0,"YOLO!", 2);
        }
    
        public static void omarMethod(double a, String b, int c) {
            System.out.println(a + " " + b + " " + c);
        }
}
```

### 12- Left out return statement
```java
 public class Omar 
{
	public static void main(String[] args) 
	{
		int x = doubleMyNum(5);
		System.out.println(x);
	}

	public static int doubleMyNum(int m) 
	{
		int value = 2 * m;
	}
 }
```
The above code errors because I have made the function behave like a void but my 3rd keyword indicates my return type should 
be of type int. To fix this, after storing the computation in a variable. I use the return keyword to return to the console. The output of the computation performed by the method.

```java
public class Omar 
{
	public static void main(String[] args) 
	{
		int x = doubleMyNum(5);
		System.out.println(x);
	}

	public static int doubleMyNum(int m) 
	{
		int value = 2 * m;
		return value;
	}
 }
```


### - Left out return statement in CASE#2
```java
 public class Omar 
{
	public static void main(String[] args) 
	{
		int x = myAwesomeAbsVal(-5);
		System.out.println(x);
	}

	public static int myAwesomeAbsVal(int m) 
	{
		if(m<0)
		{
			return -m;
		}

		if(m>0)
		{
			return m;
		}
	}
 }
```

The above lines of code have an error in logic. We should switch the code to this:
 ```java
public class Omar 
{
	public static void main(String[] args) 
	{
		int x = myAwesomeAbsVal(-5);
		System.out.println(x);
	}

	public static int myAwesomeAbsVal(int m) 
	{
		if(m<0)
		{
			return -m;
		}

		else
		{
			return m;
		}
	}
}
```

### 13 - possible loss of precision
```java
public class Omar 
{
        public static void main(String[] args)
	{
            int theAwesomePi = 3.14159;
            System.out.println("The value of pi is: " + theAwesomePi);
        }
 }
```
There is an error above being raised being we are store double in an integer. An integer can only store 4
4 bytes in main memory. The value we are storing in it is a double which has a memory size of 8 bytes. The way to solve this issue. We will explictly cast the variable theAwesomePi to an int.
```java
public class Omar 
{
        public static void main(String[] args)
	{
            int theAwesomePi = (int)3.14159;
            System.out.println("The value of pi is: " + theAwesomePi);
        }
 }
```

### 14 - Reached end of file while parsing
```java
public class Omar 
{
        public static void main(String[] args)
	{
        	myWonderfulMethod();
        }
	
	public static void myWonderfulMethod()
	{
		System.out.println("How Awesome do you think my Method is?");
 	}
```
There is an error above being raised being we are not properly closing our class. To solve this issue we add a closing
curly brace. After, the closing curly brace of my method.
```java
public class Omar 
{
        public static void main(String[] args)
	{
        	myWonderfulMethod();
        }
	
	public static void myWonderfulMethod()
	{
		System.out.println("How Awesome do you think my Method is?");
 	}
}
```

### 15 - unreachable statement

An "unreachable statement" error takes place when the compiler sees that it is impossible to reacha a certain statement. This is caused by the following code. 
```java
public class Omar 
{
	public static void main(String[] args) 
	{
	    int theAwesomeNum = doubleMe(5);
	    System.out.println(theAwesomeNum);
	}
    
        public static int doubleMe(int a)
	{
            int doubleMe = 2 * a;
            return doubleMe;
            System.out.println("Returning " + doubleMe);
        }
}
```

The compiler will generate a number of errors. The first one to be listed is that it is unable to reach the print statement.
This is because whenever we create a method and use the keyword return the compiler says you are done with the method therefore, we can exit out of the method and execute the next line of code.
To fix this error I simply reverse the order of the print statement and the return statement.
```java
public class Omar 
{
	public static void main(String[] args) 
	{
	    int theAwesomeNum = doubleMe(5);
	    System.out.println(theAwesomeNum);
	}

	public static int doubleMe(int a)
	{
	    int doubleMe = 2 * a;
	    System.out.println("Returning " + doubleMe);
	    return doubleMe;
	}
}
```    
### 16 - Variable might not have been initialized 
An variable might not have been initialized error is triggered when we declare a variable and specify its type but
never give it an initial value;
```java
   public class Omar 
   {
        public static void main(String[] args) {
            int myNum = 16;
            int myNum2;
            System.out.println(myNum + myNum2);
        }
    } 
```

The compiler will generate the error  variable myNum2 might not have been initialized  because we declared it with
the specified data type but never gave it an initial value. To solve this, I simply give it an initial value.
```java
public class Omar 
{
	public static void main(String[] args) 
	{
	    int myNum = 16;
	    int myNum2=3;
	    System.out.println(myNum + myNum2);
	}
} 
```
### 17 - constructor X in class X cannot be applied to given types
Invoke the super method in your subclass constructor.
super()

### Default Values For DT:
#### 1- byte: 0
#### 2- short: 0
#### 3- int: 0
#### 4- long: 0L
#### 5- float: 0.0f
#### 6- double: 0.0d
#### 7- String(or any obj): null
#### 8- bool: false
