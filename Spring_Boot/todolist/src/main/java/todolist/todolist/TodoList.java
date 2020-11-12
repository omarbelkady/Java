package todolist.todolist;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
/*The annotation below tell the java compiler that it is not a java proect but a spring project */
@SpringBootApplication
public class TodoList{
    public static void main(String [] args)
    {
        //Run the application source is the className
        //SpringApplication.run(source, args);
        SpringApplication.run(TodoList.class, args);
    }
}