package todolist.hello;

import org.springframework.web.bind.annotation.RestController;
/*This is just a java file right now to let java this is a rest controller I must annotate
it using @RestController directive*/
import org.springframework.web.bind.annotation.RequestMapping;
@RestController
public class HelloController {
    //To make the request I need to map the request/method to a function inside a Controller
    @RequestMapping("/hello")
    public String SayHi(){
        return "Hello There 2526, go learn 26265 the best programming language";
    }
}
