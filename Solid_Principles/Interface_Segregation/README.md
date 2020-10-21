```
Multiple specific interfaces are better than only one general interface
Clients are not obliged to use interfaces they are not using
```

### How To Tell If I am Violating This Principle
```
Say I have a interface called IAsNelanPintosFB
and within this interface I have a method called 
passionForLowLevel so some Nelans code Pascal,
While Others code Assembly

So say I have a class called Alan and it inherits from the
IsANelanPintosFB interface. Obviously Alan is has a passion
for LowLevel but it also likes Imperative too.
```

### Example 2
```
Say I have a Parrot which implements Bird. Every Parrot is a Bird but the opposite 
is not true. Every bird can fly which means a parrot can fly too.
Say I have an ostrich and I know that every bird has wings, however,
an ostrich does have wings but cannot fly.
Also, ostriches can run but parrots on the other hand cannot.
However I have the method fly and I implement it in my Ostrich class
but this method is empty 

Also, I have run method in my interface which means I must implement it
in my ostrich and parrot class. However, the method doesn't do anything.
So now I have two methods run and fly that don't do anything. One in the 
parrot class(run) and one in the ostrich class(fly)

Then I have a third class called Penguin which implements Bird and the penguin
indeed eats but doesn't run. Also, the fly method the penguin cannot fly. However,
I know that a penguin can swim which means I must create a swim method in my Bird Class.
Once I have swim method in my Bird Interface I must implement it in my penguin class. 
But, a penguin can swim but cannot fly nor run.

This means the two methods in the penguin class will be empty(run and fly)
In the ostrich class I have two methods which are empty(fly and swim)
In the parrot class I have two empty methods(run and swim)

We have a problem here with abstraction. 
```

```
So how can we avoid this violation?
Here's where this principle segregation comes into play.
We segregate the methods into different interfaces. I must put 
in the bird interface all the methods that all birds will share.
Then I create an interface for the appropriate property such as:
IRunningBird ISwimmingBird and IFlyingBird.
Then I start to cherry pick/segregate the interfaces.
```

```
The parrot I want him to Implement Bird Interface and FlyingBird Interface
but not the Runner Bird Interface nor the Swimming Bird Interface
```

```
The ostrich I want it to Implement the Running Bird Interface and the Bird Interface
but not the Swimming Bird Interface nor the Flying Bird Interface
```

```
The penguin I want it to Implement the Bird Interface and and Swimming Bird Interface
but not the Running Bird Interface nor the Flying Bird Interface
```

### When To Use
```
Say I have interface that a class cannot implement unlike other classes
then I segregate that class and do not give it the ability to implement the interface.
Remember, the bottom line is multiple specific interfaces that perform a task exactly how
I want it to be done are better than one general interface.
```
