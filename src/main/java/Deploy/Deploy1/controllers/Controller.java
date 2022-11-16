package Deploy.Deploy1.controllers;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {
    @Value("${devName}")
    String devName;

    @GetMapping
    public String getProperty(){
        return devName;
    }
}