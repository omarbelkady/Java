# Equals and Hashcode

- If 2 objects are equal, they have the same hash code
- You have to override hashCode() if you override equals()

```java
public class Student
{
    // fields go here
    ...

    @Override
    public boolean equals(Object o)
    {
        if (!o(instatanceof Student))
            return false;

        if (o == this)
            return true;

        //logic goes here, compare fields
    }

    @Override
    public int hashCode()
    {
        // logic goes here, hash fields
    }
}
```

- Useful for
    - Lists
    - HashSet
    - HashMap 