# Constructor
Sometimes when we setup a class we want to send it different pieces of information to setup the class. So my cat class gets name, age and food. 
However, say I want: name and age or say just name. A constructor is a special type of subroutine called to create an object. It prepares the new object for use,
often accepting arguments that the constructor uses to set required member variables. A constructor is similar to a method except we do not put a return type. We 
invoke a constructor by using the new keyword.
```
User u = new User();
```
The User keyword after the new keyword is the constructor and the above line of code is how we invoke a constructor.  Notice, that it is the exact same as how we
invoke/call a method except that the method is prefixed with the new keyword. It has the exact same implementation as a method except that there is no return or
return type. REMEMBER WHEN WE CREATE A CONSTRUCTOR THE NAME HAS TO MATCH THE CLASS NAME.

To define what a constructor does we do this. THIS IS KNOWN AS THE DEFAULT CONSTRUCTOR because it doesn't take any arguments.
```
public User()
{

}
```
The benefit of using a constructor within our code implementation is so that we can initialize the object with certain values like below
```
User n = new User(“Nabila”);
```

```
public User(string h)
{
	firstName = h;
}
```
This guarantees us that at the very beginning of our implementation of the User object we ensure that the User has a valid value.
