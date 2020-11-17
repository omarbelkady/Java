### Generics

- BEHAVE EXACTLY THE SAME AS TEMPLATES IN C++

#### Generic Class
- A way for the user to implement one class that can handle all types of data

#### Generic Method
- A way for the user to implement a method 


#### Example of A Generic Class
```java
class Main {
  public static void main(String[] args) {

    // initialize generic class
    // with Integer data
    GenericsClass<Integer> intObj = new GenericsClass<>(5);
    System.out.println("Generic Class returns: " + intObj.returnTheData());

    // initialize generic class
    // with String data
    GenericsClass<String> stringObj = new GenericsClass<>("Java Programming");
    System.out.println("Generic Class returns: " + stringObj.returnTheData());
  }
}


class GenericsClass<T> {

  // variable of T type
  private T data;

  public GenericsClass(T data) {
    this.data = data;
  }

  // method that return T type variable
  public T returnTheData() {
    return this.data;
  }
}
```

#### Example Of A Generic Method
```java
class Main {
  public static void main(String[] args) {

    // initialize the class with Integer data
    CallingClass call = new CallingClass();

    // generics method working with String
    call.<String>genericsMethod("LLP Programming is Nelan's Fav");

    // generics method working with integer
    call.<Integer>genericsMethod(25);
  }
}

class CallingClass {

  // creae a generics method
  public <T> void genericsMethod(T data) {
    System.out.println("Generics Method:");
    System.out.println("Data Passed In: " + data);
  }
}
```