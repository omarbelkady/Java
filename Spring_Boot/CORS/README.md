### CORS In Spring Boot



```java
package com.starter.springboot;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class AppConf implements WebMvcConfigurer {

    @Override
    public void addCorsMappings(CorsRegistry registry) {
        //enabling CORS
        registry.addMapping("/**")
                //setting the allowed origin 
                .allowedOrigins("http://localhost:4200")
                //setting the allowed request Method
                .allowedMethods("GET");
    }
}
```