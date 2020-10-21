```
"Let φ(x) be a property provable about objects x of type T. Then φ(y) should be true for objects y of Type S, where S is a subtype of T"
This is saying to regard parameter passed as an object(x) has a type T. Then we have another object which carries the type
S. Well S is a subtype of T. If we pass an object of type T and it outputs true then it should also output true for the type S because it is a subset of T.
```

```
φ(x) is a function where x is the parameter of the function and φ(y) is a function with a different parameter y. S and T in this case are just objects.
```


### How To Know If We Are Violating This Principle
```
Say That I have a Base Class X and a Class Y where Y is a derived class Of X. Well Class X has a function,
which means every subclass of it must override it, this tells me that Class X is abstract. Soon though you found the class Y cannot do the desired functionality as the function in class X or isn't even used in the derived class Y. In other words, you override it but . Then you know you have violated this principle.
```

