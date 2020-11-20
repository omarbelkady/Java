package todolist.hello;

import org.springframework.web.bind.annotation.RestController;
/*This is just a java file right now to let java this is a rest controller I must annotate
it using @RestController directive*/
import org.springframework.web.bind.annotation.RequestMapping;
@RestController
@RequestMapping("")
public class HelloController {
    //To make the request I need to map the request/method to a function inside a Controller
    @GetMapping("/hello")
    public String SayHi(){
        return "Hello There 6627, go learn sql the best programming language";
    }
}
