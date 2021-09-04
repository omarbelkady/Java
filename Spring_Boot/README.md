
### How To Create A Spring Boot Application (the best middleware application ever)
 1. install spring tools
 2. create a new project(maven)
	- goto your pom.xml 
	- add spring-boot-starter-parent as your parent within the artifact id
	- add a dependency spring-boot-starter-web
	- make sure java version is > 1.8
 
## Spring Boot 

1. Post ====> Create
2. Get ====> Read
3. Put ====> Update
4. Delete ====> Delete



## Prerequisites
- One of the Java versions
    - <a href="https://www.oracle.com/java/technologies/javase/javase-jdk8-downloads.html">Java SE 8 </a>
    - <a href ="https://www.oracle.com/java/technologies/javase-jdk11-downloads.html">Java SE 11 </a>
- <a href = "https://www.jetbrains.com/idea/download/">IntelliJ</a>
- <a href = "https://www.postman.com/downloads/">Postman</a>
- Use MongoDB as your DB:
    - MongoDB: https://www.mongodb.com/try/download/enterprise
    
## Getting Started
<img src="https://secureservercdn.net/160.153.138.163/pmk.dbe.myftpupload.com/wp-content/uploads/2020/01/Spring-Initializr-start.jpg">

1. Go to https://start.spring.io/
    - Apply the following settings
        - <b>Project</b>: Maven
        - <b>Language</b>: Java
        - <b>Group</b>: com.{project name}
        - <b>Artifact</b>: {NAME}
        - <b>Name</b>: {NAME}
        - <b>Description</b>: Spring Project (Doesn't matter)
        - <b>Package name</b>: com.{project name}
        - <b>Packaging</b>: Jar
        - <b>Java</b>: {Your version of Java installed}
    - Add the following Dependencies:
        - Lombok
        - Spring Web
        - Spring Data JPA

2. Click "Generate"
3. Unzip the download to your working directory
4. Manually add the following dependencies in pom.xml
```xml
<dependency>
    <groupId>org.springframework.boot</groupId>
    <artifactId>spring-boot-starter-validation</artifactId>
    <version>2.3.3.RELEASE</version>
</dependency>

```

## Spring Boot Application Is Composed Of Usually these three layers:
## 3 Layered of Architecture

- Layer 1: Controller/API Layer
    - Holds API Def and Req Body
    - Only One that makes calls to the Service Layer
    - Annotate any Controller Class with the @RestController Annotation
    - This helps SB to identify this class as the API Def class

- Layer 2: Service
    - Business Logic
    - Models the data for the Repository
    - Transmits data from the Controller To The Repository
    - Transmits data from the Repository back to the Controller
    - Annotate any Service Class with the @Service Annotation


- Layer 3: Repository
    - Talks to the DB directly
    - Annotate any Repository Class with the @Repository Annotation
    

### We call the Java Program that has all the Resources for Your API a "Controller"


#### What is a JWT(JSON Web Token)

- a way for an application to transmit information 
- i.e. a way for application A to talk to application B
- very small and self-contained
- very secure

1. very popular when working with APIs for authorization

2. application gives token to a user

3. create the token

4. takes the user information

5. sign the token

6. this signature is digital

- therefore whenever the user needs to access the information 

7. user sends the token as their authorization key

- all a token is for two application to talk to each other

    - i.e. frontend and backend || two backend applications || two applications in general

    - for the purpose of exchanging information

8. Successful credentials provided to the app grants the user a JWT
    - this token holds:
        - my info
        - my permissions
        - etc.

9. JSON Web Token has three parts:
    
    - Header has two fields:
        1. algorithm
        2. type
    - Payload[holds info about the user or entity the token is for]:
        1. name
        2. username
        3. issue date and time
        4. claims i.e. permissions
    - Signature:
        1. to take the signature you take:
            - the encoded header
            - encoded payload
        2. use a secret with the algorithm
        3. take all this good stuff and sign the token
    
    - the full address is encrypted and looks like this:
        - headerkey.payloadkey.signaturekey


#### Example Of User Model

```java
/*
I say that this is a table within a database
and the contstructor takes no args
*/
@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class User{

    //I tell Lombok that this is an id and how I want it to be generated
    @Id
    @GeneratedValue(strategy=AUTO)
    private Long id;
    private String name;
    private String username;
    private String password;
    /*
    I must set up a relationship to manage the roles
    I define the fetch because whenever I fetch all the user
    I want to load ALL the roles of each user
    */
    @ManyToMany(fetch=FetchType.EAGER)
    private Collection<Role> userroles = new ArrayList<>();
}
```

#### Example Of The Role Model

```java
/*
I say that this is a table within a database
and the contstructor takes no args
*/
@Entity
@Data //for getters and setters
@NoArgsConstructor
@AllArgsConstructor
public class Role{
    //I tell Lombok that this is an id and how I want it to be generated
    @Id
    @GeneratedValue(strategy=AUTO)
    private Long id;
    private String name;
 
}
```

#### Part II - Repo

```java
package io.omarbelkady.userservice.repo;

import io.omarbelkady.userservice.domain.User;
import org.springframework.data.jpa.repository.JpaRepository;
/*
in between the left angle bracket and right angle bracket I specify the entity
I want to manage and in the second parameter is type of my primary key
*/
public interface UserRepo extends JpaRepository<User, Long>{

    /*
    I need one method and I want the return to be a User
    SD JPA is smart enough to know to interpret 
    this as a SELECT statement
    */
    User findByUsername(String username)
}
```

```java
//role Repository
package io.omarbelkady.userservice.repo;

import io.omarbelkady.userservice.domain.Role;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RoleRepo extends JpaRepository<Role, Long>{
     Role findByName(String name);
     Role saveTheRole;
}
//24:33 ./2:06:48
```

#### Part III Service

```java
    import io.omarbelkady.userservice.domain.User;
    import io.omarbelkady.userservice.domain.Role;

    /*
    here is where I write a blueprint of all the methods
    that I want to manage all my users
    */
    public interface UserService{
        User saveTheUser(User user);
        Role saveRole(Role role);

        //I need a method that adds a role to a user
        void addRoleToUser(String username, String roleName);

        User getTheUser(String username);

        //Returns a list of all the Users
        List<User>getTheUser();        
    }

```

### Part IV Implementation

```java
    import io.omarbelkady.userservice.service;
    import io.omarbelkady.userservice.domain.Role;
    import io.omarbelkady.userservice.domain.User;
    import io.omarbelkady.userservice.repo.RoleRepo;
    import io.omarbelkady.userservice.repo.UserRepo;
    import lombok.RequiredArgsConstructor;
    import lombok.extern.slf4j.Slf4j;
    import org.springframework.stereotype.Service;
    import org.springframework.transaction.annotation.Transactional;

    import java.util.*;
    
    
    /*
    Since this is a service class I annotate with the 
    service annotation

  
    Since I have many fields defined I must inject them
    in the class that's why I use the RequiredArgsConstructor

    Lombok will now take the two fields I have defined 
    and pass them to my constructor

    Slf4j annotation is used to log everything out to the console

    */

    @Service
    @RequiredArgsConstructor
    @Transactional
    @Slf4j
    public class UserServiceImplementation implements UserService{
        
        /*
        
        two repositories which communicate with JPA directly
        
        */
        private final UserRepo userRepo
        private final RoleRepo roleRepo

        //Creating the loggers
        Logger mylogger = Logger.getLogger(UserServiceImplementation.class.getName());

        @Override
        public User saveTheUser(User user){
            mylogger.info("I am saving a new user {} to the database", user.getName());
            return UserRepo.save(user);
        }

        @Override
        Role saveRole(Role role){
            mylogger.info("I am saving a new role {} to the database", role.getName());
            return roleRepo.save(role);
        }

        @Override
        void addRoleToUser(String username, String roleName){
            mylogger.info("I am adding a new role {} to the user {}", roleName,username);
            //find user by username
            User user = userRepo.findByUsername(username);
            Role role = roleRepo.findByName(roleName);

            user.getRoles().add(role)
        }

        //return a single user from the db
        @Override
        public User getTheUser(String username){
            mylogger.info("Getting the user {} from the database", username);
            return userRepo.findByUsername(username);
        }

        //Return all the users in the db
        @Override
        public List<User>getTheUsers(){
            mylogger.info("Getting All the users", username);
            return userRepo.findAll();            
        };        
    }

```

#### Sample Rest Controller called StudentController
```java
package com.example.demo.student;
import java.util.*;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/v1/student")
public class StudentController
{
    //Using a reference from the StudentService
    private final StudentService studentService;

    //Why Do I need An Autowired Annotation Below Because I want the reference to be injected automatically into the constructor


    //Constructor
    @Autowired
    public StudentController(StudentService studentService){
        this.studentService= studentService;
    }

    //System.out.println("2526 56837 26265 263 3436 7864 263 227243 36557");
    @GetMapping
    public List<Student> getStudents(){
        return studentService.getStudents();
    }
}
```

### I create a Service Called StudentService.java and place the methods there
```java
package com.example.demo.student;
import java.time.LocalDate;
import java.time.Month;
import java.util.List;
//I must tell Spring Boot that this service should be a class that must be instantiated i.e. must be a spring bean

/*Telling spring boot this is a bean and I remove the Component Annotation and tell Spring Boot that I want not a Component but a Service Specifically
@Component

By changing from Component To Service I tell the User that This class is meant to be a service class
*/
@Service
public class StudentService{
    private final StudentRepository studentRepository;

    @Autowired
    public StudentService(StudentRepository studentRepository){
        this.studentRepository=studentRepository;
    }

     public List<Student> getStudents(){
       /* return List.of(
            new Student(
                  1L, "Nelan","ilovecobolfortranandftn@gmail.com",LocalDate.of(2000,Month.FEBRUARY,25)
            )
        );
        */
        return studentRepository.findAll();
   }

   public void addNewStudent(Student student){
       System.out.println(student);
   }
}

```


### I goto my Controller Because I want to Create A Method which will add Data AKA POST I use the PostMapping Annotation
```java
package com.example.demo.student;
import java.util.*;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/v1/student")
public class StudentController
{
    //Using a reference from the StudentService
    private final StudentService studentService;

    //Why Do I need An Autowired Annotation Below Because I want the reference to be injected automatically into the constructor


    //Constructor
    @Autowired
    public StudentController(StudentService studentService){
        this.studentService= studentService;
    }

    /*
    
    System.out.println("2526 56837 26265 263 3436 7864 263 227243 36557");
    i.e. Making a Get Request
    */
    @GetMapping
    public List<Student> getStudents(){
        return studentService.getStudents();
    }



    //Method which will add Students I must use the Post MApping Annotation
    //i.e. Making a Post Request...... for it to work Taking the 
    //RequestBody and mapping it to a student
    @PostMappping
    public void registerNewStudent(@RequestBody Student student){
        //I invoke the service
        studentService.addNewStudent(student);
    }
}

```

### Next I goto my repository
```java
package com.example.demo.student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframwork.stereotype.Repository;

import java.util.Optional;

@Repository
public interface StudentRepository
    extends JpaRepository<Student, Long>{
        //find students by email to transform to an SQL Command : SELECT * from student WHERE email = ilovecobolfortranandftn@gmail.com
        //OR we can use an annotation
        @Query("SELECT s FROM Student s WHERE s.email = ?1")
        Optional<Student> findStudentByEmail(String email);
    }
```

#### Now I can go back to my Service to use the StudentRepository Interface to add the Student
```java
package com.example.demo.student;
import java.time.LocalDate;
import java.time.Month;
import java.util.List;
//I must tell Spring Boot that this service should be a class that must be instantiated i.e. must be a spring bean

/*Telling spring boot this is a bean and I remove the Component Annotation and tell Spring Boot that I want not a Component but a Service Specifically
@Component

By changing from Component To Service I tell the User that This class is meant to be a service class
*/
@Service
public class StudentService{
    private final StudentRepository studentRepository;

    @Autowired
    public StudentService(StudentRepository studentRepository){
        this.studentRepository=studentRepository;
    }

     public List<Student> getStudents(){
       /* return List.of(
            new Student(
                1L, "Nelan","ilovecobolfortranandftn@gmail.com",LocalDate.of(2000,Month.FEBRUARY,25)
            )
        );
        */
        return studentRepository.findAll();
   }

   public void addNewStudent(Student student){
       Optional<Student> studentOptional = studentRepository
            .findStudentByEmail(student.getEmail());
        if(studentOptional.isPresent()){
            throw new IllegalStateException("email taken 968 429 32!");
        }

        //Obviously I can do more complex validation i.e. checking if the email is valid

        //saving the Student
        studentRepository.save(student);
       System.out.println(student);
   }
}

```

### Next I create a UserResource within the api folder

```java
package io.omarbelkady.userservice.api;
import io.omarbelkady.userservice.service.UserService;
import io.omarbelkady.userservice.domain.User;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.*;

/*
I annotate this class with the Rest 
Controller annotation to tell SB that it is a controller*/
@RestController
@RequestMapping("/api/")
@RequiredArgsConstructor
public class UserResource{
    //Now I need to inject the Service within this service
    private final UserService userService;


    //I want it to be a get request
    @GetMapping("/users")
    public ResponseEntity<List<User>>getUsers(){
        return ResponseEntity.ok().body(userService.getUsers());
    }

    //Create a resource on the server i.e. Post Request
    @PostMapping("/user/save")
    public ResponseEntity<User>saveUser(@RequestBody User user){
        return ResponseEntity.created(null).body(userService.saveUser(user));
    }
    //Create a resource on the server to Save a Role
    @PostMapping("/role/save")
    public ResponseEntity<Role>saveRole(@RequestBody Role role){
        return ResponseEntity.ok().body(userService.saveRole(role));
    }
}

```


- For projects using MongoDB
```xml
<dependency>
    <groupId>org.springframework.boot</groupId>
    <artifactId>spring-boot-starter-data-mongodb</artifactId>
</dependency>
```

## File Structure

```bash
com/example/api
com/example/dto
com/example/entity
com/example/repository
com/example/service
com/example/utility
```


## Folder Structure:
```

├── /springboot_starter
	├── /.idea
	├── /.mvn
	├── /docs
	├── .gitignore
	├── /src
		├── /main
		    ├── /java
			    ├── /com.starter.springboot
				    ├── /config ==> holds all your external configuration files 
				    ├── /controller ==> holds all your controllers i.e. those in charge of processing 
					incoming API req, prepare and render a view to be rendered as a response
 				    ├── /dto ==> the one who transmits data 
					 with multiple attrs from cli to serv
   				    ├── /exception
   				    ├── /model ==> holds all your models... which are containers of your app data
				    ├── /repository ==> implementation of all your repository classes i.e. encaps and 
						tells SB how to store, get and search for your data
 				    ├── /security
   				    ├── /service ==> implemenation of all your services classes i.e. business logic
     				└── TravelReservationApplication
		    └── /resources
                ├── /static  ==> holds all your CSS, JS and any images you might have
                ├── /templates ==> used when you want to work with FE
                └── application.properties ==> holds db credentials(url, username, pswd) in the form of key value pairs
	    ├── /test	   	    ==> root directory for any tests you want to run to check everything is okay
	    ├── .gitignore
	    ├── Dockerfile  ==> txt doc that holds all the necessary commands to build an image. Use it to run multiple commands in succession
	    ├── HELP.md
	    ├── LICENSE
	    ├── mvnw
	    ├── mvnw.cmd 
	    ├── pom.xml ==> holds info about your project and tells Maven how to configure and build your project
	    └── README.md ==> Provides relevant information about your project(e.g. what it is? how to run?) 
```


## The application.properties file
- must have the connection url to your DB
- must have the credentials(DB Username and DB PW) to your DB
- make sure to set the spring.jpa.show-sql to true so that Hibernate will generate it

## Database name in your application.properties
- protocol:dbtype::/localhost:portYouWishToRunYourAppOn/PathYouWantToAccess
- PathYouWantToAccess is The Name of Your DB


## Tomcat
- The web server which will be up and running on a specific port. Depending on the selected port, 
- Once I have told SpringBoot the designated port I want it to run on I then go ahead to implement endpoint


## What are two very important dependencies in Spring Boot JPA
- spring-boot-starter-data-jpa
- org.postgresql: allows us to connect to the DB

## Super Important Annotations in Spring Boot Anything with the @ symbol followed by some keyword is used for functionality
- @ftnfb is an annotation used to get the best grade possible at UT

###### API Layer
```java
// Class Based Annotations
@RestController // allows the class to have API routes aka REST Endpoints
@CrossOrigin // allows other programs to consume SpringBoot app
@RequestMapping // root url mapping

// Field Based Annotations
@Autowired // dependency injection

// Method Based Annotations
@GetMapping("/URL") // allows a method to be called when GET request is made w/ '/URL'
@PostMapping("/URL") // allows a method to be called when POST request is made w/ '/URL'
@PutMapping("/URL") // allows a method to be called when PUT request is made w/ '/URL'
@DeleteMapping("/URL") // allows a method to be called when DELETE request is made w/ '/URL'

// Method Parameter Based Annotations
@RequestBody // allows POJO to be parsed as JSON request body
@PathVariable // used for url patterns of *./{pathVar}, method arg name must also be the same
@QueryParam // used for url patterns of ?key=value
```

###### DTO
```java
// Class Based Annotation
@Data // constructor, getters, setters, equals, hashCode, toString 
```

###### Entity Layer
```java
// Class Based
@Data // constructor, getters, setters, equals, hashCode, toString 
@Table("TABLE_NAME") // binds class to SQL table if class/table name is different
@Entity // represents class as SQL table

// Field Based
@Id // primary key
@GeneratedValue(strategy = GenerationType.IDENTITY) // auto increment PK
@Column("COL_NAME") // binds field to DB column if field/column name is different
```

    
###### Repository Layer
   - none
    
###### Service Layer[Responsible for the Business Logic of Your App]
```java
// Class Based
@Service // denotes service layer
@Transactional // allows the class to update DB fields

// Field Based
@Autowired // dependency injection
```

    
###### Utility Layer

ErrorInfo
```java
// Class Based
@Data // constructor, getters, setters, equals, hashCode, toString 
```

ExceptionControllerAdvice
```java
// Class Based
@RestControllerAdvice // allows the app to output errors to user in a useful manner

// Field Based
@Autowired // dependency injection

// Method Based
@ExceptionHandler(value=Exception.class) // allows method to be called when exception is raised
```

LoggingAspect
``` java
// Class Based
@Component // denotes spring bean
@Aspect // used for crosscutting concern

// Method Based
@AfterThrowing(pointcut = "execution(CLASS_NAME)") // will execute after throwing exception
```

## How The Layers Work
- The API Layer talks to the Service Layer and the Service Layer should also talk to the Data Access LAyer
- The Data Access Layer should then communicate back to the API Layer and we continue to make round trips 
- Client==> API Layer ==> Service Layer ==> Data Access Layer ==> API Layer

## MVC Framework In Spring
- M in MVC: Model. The Model is usually a DB. Since everything is an object in Java I use the term POJO(Plain Old Java Object) which is converted to a row in a DB/DB-Schema and I used this to talk to my application/controller/view using a model. A model essentially encapsulates the data which the application uses. The Model in our case is the name of the task I must perform and the description of the task.

- V is MVC: View is responsible for rendering the Model Data. It generates HTML output that the client browser can interpret. The buttons and icons 
are essentially considered the view of the todo list. My view will be JSON which can/can't be interpretted by the browsers.

- C is MVC: Controller is responsible for processing requests and building an appropriate model and passing it to the view for rendering. The 
controler takes in the data from the model and then has the business logic/service within it and passes it to the view for rendering.


### Summary(What Is Happenig Behind The Scenes)
- The Spring Web MVC Framework is designed around a DispatcherServlet Class which handles all the requests&responses(HTTP) for me.

### Workflow
0- I recieve an HTTP Request(GET, POST, etc.) in my case GET 

1- I get the data from the server in my case get all the tasks in my list

2- The dispatcherServlet consults the handler mapping to call the appropriate controller
