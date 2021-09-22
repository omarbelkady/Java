### Interfaces

<br />

- Similar in concept to Inheritance.
- defines behavior. So we have an object and right after it is a biiiig barrier, this barrier is the interface
- The barrier serves as to limit on how we interact with the object. We use an interface to work with an object.

- I tell the class that the object has to meet the requirements imposed by interface. Say I have a class Dog. The dog has the following behaviors which are: 
	- walk()
	- woof()
	- eat()
- We can define the behaviors thanks to interfaces. All in all, interfaces define behavior/characteristics that classes need to implement. 
- We can define how an animal eats/walks within the interface. Then the class can implement the interface.

- A class does not extend an interface, it implements it. Whenever we work with multiple classes as a team of developer. We must believe that every developer will do their part to implements the works of the interface of the designated class they are working on. 

- Say for example, a class that implements the interface walking well then we can trust that class that it can walk properly and not limp. 

- An interface can extend interfaces but cannot extend/implement the class.