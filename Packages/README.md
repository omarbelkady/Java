```
a package is a group/dir of similar types of classes, interfaces and sub-packages
```

```
some packages in java
- java.lang: used to bundle the fundamental classes
- java.io: used for the classes for input, output functions which are bundled in
this package
```

```
java.lang sub-package contains:
- System.class
- String.class
```

```
Two Types Of Packages:
- Built-in package already available in java language
- the programmer can create their own package which
can be imported to other classes

```

```
java.util sub-package contains:
- ArrayList.class
- Map.class
```

```
java.awt sub-package contains:
- Button.class
```

```
Use a package when you want access protection.
Also java package removes naming collision
```

### How to create a package
```java
package omruti;
```

### How To Create subpackage
```java
package omruti.fortnite;
```

### How To Compile a java package
```bash
javac -d directoryName javafilename.java
```


### How to instantiate a function within a package 
```java
//we always write the package name before the class name
nelanenjoysllp.favparad pintoslover = new nelanenjoysllp.printfavparad("Imperative");
```

### The above code can be tedious sometimes
```java
import nelanenjoysllp.printfavparad;
printfavparad pintoslover = new printfavparad("Imperative");
```


### Important Concepts with Access Modifiers in Regards to Packages
```
1- A Private class's methods/functions are not accessible to any other class
within the same package nor to any other package

2- A public class's method/function is accessible to any other class within
the same package and to any outside packages

3- A Protected class's method/function is accessible within the same package
to any other class but not to another class within another package

4- Default access modifier's methods/functions are accessible to any other
class within the same package but not to any other class defined in another 
package
```
