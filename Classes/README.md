### A class is essentially a data type. Whenever we create an instance of a class we declare it so say I want to declare 10 dog ages i would go and say
### int dogAge1= 3; and say int dogAge2=12; This is inefficient and is a waste of time.
### Within a class we have methods and we have attributes. An attribute is similar to variables in that they hold information for us.
### We want to have 2 attributes for our dog class the Name and the age. Classes allow us to build very large application without having to code every small bit by ourselves. We have a blue print of how sth might look. Say I have a person Class and wanted to describe a specific the person the details are  ### what’s called attributes. If we wanted to build a large scale application we do not want to describe every single person specifically using a bunch of different ### variables. This would be a waste of time. Instead, we create a blueprint of what a person might look like.
### We can say two fields:
## - a name variable
## - a talk method


### The above idea is a structure of a person which is known as a class. To create a new person, all we have to do is instantiate the class. This process is called 
### an object. The class is the blueprint and the object is the specific example. A class allows us to create different entities which are similar in structure. 
### Classes will defined within a file and objects will be defined as variables.
```
Person x = new Person();
```
### x is what’s called an identifier

### A Class is a structure/blue print and object is an instance of the class. The above has a class name Person. Person here, is what's called a custom type
### x is the identifier. When we instantiate we can create n number of objects say: Alan, Waleed, Neha, Michael, Juan. These are all instances which are different from static methods. A static method is attached to a class rather than an instance of a class / an object. When wanting to use a static method of the class unlike an instance method, it has to declare an instance of the class in order for it to use the instance method. A static method can use the method as soon as it wants. We create instances of the class which creates for us branches. 
### These branches are referred to as objects. Anytime we create a method within the class. We create an instance of the class, the method we created is made available for use to us. An instance method is the complete opposite of a static method. An instance method is attached to the instances.
### Say I do this

```

Animal bear = new Animal();
bear.talk();
```

### A static method on the other hand is attached to the class unlike an instance method we do not have to use the class instance to use the instance method. We can do it directly on the class.



### A field is just a variable within a class
The person class has two elements:
Name: This is a field 
talk(): 

### A field is essentially a variable that we can assign a value to. 
### When we instantiate the class into an object we can assign a value to the field name such as “Angela”
```
public class Vars
{
	//Variables outside of a method and within a class are called FIELDS!
	public int testFie=6;

	//So when some make an instance of the class Stupid Program the field testFie
	//Would be available for anyone and it would have a default value of 6.
	
    public class Main 
    { 
      // Instance Variables 
      String name; 
      String major; 
      String year; 

      // Constructor Declaration of Class 
      public Main(String name, String major, String year) 
      { 
          this.name = name; 
          this.major = major; 
          this.year = year; 
      } 

      // method 1 
      public String getName() 
      { 
          return name; 
      } 

      // method 2 
      public String getMajor() 
      { 
          return major; 
      } 

      // method 3 
      public String getYear() 
      { 
          return year; 
      } 

      @Override
      public String toString() 
      { 
          return("Hi my name is "+ this.getName()+ 
                 ".\nMy major is " + 
                 this.getMajor()+", and I am a " + this.getYear());
      } 
  
      public static void main(String[] args) 
      { 
          Main carolina = new Main("carolina","CS", "Senior"); 
          System.out.println(carolina.toString()); 
      }
    }
} 
```

### One of the big three in OOP. There is Encapsulation, Inheritance and Polymorphism.
### Encapsulation is the process by which we hide the inner details of something. This way will enable us to not expose everything to the whole world. Encapsulation takes place a lot when working with class level variables/fields. So we created a variable within the class method not within the method. This  variable will be  accessible all throughout the class. When we instantiate an object of the class. When we work with the variable we are using encapsulation when working with getter and setter methods of that variable. To get the value of the variable we have to go through the getter and this will output the value  back to us in the console. If we want to set the value of the variable we have to go through the setter and it will update the value. Within the methods, we can modify and tweak  it a little bit. Think of a service you are providing to people we can use encapsulation that way we hide the inner  workings and the user will not be able to see it. We can swap the inner workings without affecting the interface.
