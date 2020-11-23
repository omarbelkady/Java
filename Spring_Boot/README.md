### How To Create A Spring Boot Application (the best middleware application ever)
 1. install spring tools
 2. create a new project(maven)
	- goto your pom.xml 
	- add spring-boot-starter-parent as your parent within the artifact id
	- add a dependency spring-boot-starter-web
	- make sure java version is > 1.8
 
# Spring Boot 

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

## Super Important Annotations in Spring Boot

###### API
```java
// Class Based
@RestController // allows the class to have API routes
@CrossOrigin // allows other programs to consume SpringBoot app
@RequestMapping // root url mapping

// Field Based
@Autowired // dependency injection

// Method Based
@GetMapping("/URL") // allows a method to be called when GET request is made w/ '/URL'
@PostMapping("/URL") // allows a method to be called when POST request is made w/ '/URL'
@PutMapping("/URL") // allows a method to be called when PUT request is made w/ '/URL'
@DeleteMapping("/URL") // allows a method to be called when DELETE request is made w/ '/URL'

// Method Parameter Based
@RequestBody // allows POJO to be parsed as JSON request body
@PathVariable // used for url patterns of *./{pathVar}, method arg name must also be the same
@QueryParam // used for url patterns of ?key=value
```

###### DTO
```java
// Class Based
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
    
###### Service Layer
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


## MVC Framework In Spring
- M in MVC: Model. The Model is usually a DB. Since everything is an object in Java I use the term POJO(Plain Old Java Object) which is converted to a
row in a DB/DB-Schema and I used this to talk to my application/controller/view using a model. A model essentially encapsulates the data which the 
application uses. The Model in our case is the name of the task I must perform and the description of the task.

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
