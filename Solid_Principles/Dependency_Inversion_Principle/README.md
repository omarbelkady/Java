### Dependency Inversion Principle
```
High-level modules should not depend on low-level modules. Both should depend on abstractions
```

### Important concepts to remember
```
This Principle uses a design pattern called dependency-injection used in Spring and Springboot.
This dependency injection uses a class into another one because that class depends
on the use of the first class that I injected into the class. 

The problem with dependency injection design pattern is that when I inject an object of 
type bird I must use animals in this class where we will be implementing the injection. 
But if I inject just birds I am given just the opportunity to use just the birds of the class.

Dependency inversion principle states that high level modules shall not depend on low level modules 
both shall depend on abstractions.

The main idea is to use abstraction to inject into classes in order to pass whether some types of
interfaces or those abstractions can. If I pass it as a parameter and inject as a parameter an abstraction of various subtypes of classes then I can pass into the class the various subtypes of that abstraction. 
```

### How To Know If the Principle was violated
```
If a defined field or attribute of a class has a specific type I am forcing the class
to use this exact type or this exact variation of the type
```
