package es.app.front.core;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication()
public class SpringPrimeFacesApplication {

    public static void main(String[] args) {
        ApplicationContext applicationContext = SpringApplication.run(SpringPrimeFacesApplication.class, args);
    }
}


