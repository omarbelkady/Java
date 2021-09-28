## Static Keyword In Java


- SUPER IMPORTANT
- Anything I label static means the class can access it directly

- Instead of:
	- Creating An Object
	- THEN ACCESSING IT

- I can:
	- Create a variable to store data
	- Create a static method

```java
import java.util.*;

public  class  User{
	private  String  _name;
	private  String  _membership;
	public  static  List<User> administrators;
}
```

### Main Class

```java
import java.util.*;

public  class  Main{

	public  static  void  main(String [] args){
		User.administrators = new  ArrayList<User>();
		User.administrators.add(new  User("Abraham"));
		User.administrators.add(new  User("DJ32"));
	}
}
```


 <br />

### Static Methods

  

- I access data members directly on the User class

- System.out.println where **out** is a static data member of the System class

- e.g. Whenever you want to read Data from a file You can associate it to a user
    - Instead of creating a function I create a static method return a list

- Example:

```java
public class User{
    public static List<User> administrators;

    public static void print_the_admins(){
        
        /*
        since List and print_the_admins are both static
        I can omit User.administrators

        */
        //for(User j: User.administrators)
        for(User j: administrators){
        
            System.out.println(j.get_The_Names())
        }
    }
}

```