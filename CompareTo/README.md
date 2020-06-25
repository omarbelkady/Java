# Comparing Objects

#### class needs to implement java.lang.Comparable

```java
public class Student implements Comparable<Student>
{
    ...
}
```

useful for 
- sorting
- TreeSet
- TreeMap

Need to implement

```java
@Override
public int compareTo(Student arg0) 
{
    if (arg0 == this)
        return 0;
    
    // logic goes here
    ...
}
```