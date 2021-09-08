### Encapsulation

- One of the 4 pillars of OOP(A,E,I,P):
- I have 3 elements:
    - Class
    - Method
    - Variables
- I wrap the variables and the code implementation which interacts with the methods as one
- Variables within my class cannot be accessed by other classes
- Only the methods of that particular class can access them
- All in all, it is the process by which I group information


#### Good Practice

- Class Variables should always be declared private
- Setter and Getter Methods should be public


#### Example Encapsulating Class

```java
public class EncapsulatingThis{



    private String myFullName;
    private String myIdentifNum;
    private int myAge;


    
    public int getMyAge(){
        return myAge;
    }

    public void setMyAge(int theAge){
        myAge = theAge;
    }

    public String getMyId(){
        return myIdentifNum;
    }

    public void setMyId(String myNewId){
        myIdentifNum = myNewId;
    }


    public String getMyName(){
        return myFullName;
    }

    public void setMyName(String fullName){
        myFullName = fullName;
    }

    //overriding the toString() method  
    @Override
    public String toString()
    {
        return ("Hi my Name is: " + getMyName() + " and I am " + getMyAge() + " and my ID is: " + getMyId()); 
    }  

}
```


#### Main Class

```java
import java.util.*;
public class RunnerClass{
    public static void main(String [] args){
        EncapsulatingThis encapsObj = new EncapsulatingThis();
        encapsObj.setMyName("Omar");
        encapsObj.setMyAge(27);
        encapsObj.setMyId("165X70B15D");
        
        System.out.println(encapsObj.toString());
    }
}
```