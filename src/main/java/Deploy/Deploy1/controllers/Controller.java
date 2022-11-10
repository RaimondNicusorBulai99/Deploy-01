package Deploy.Deploy1.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {

    @GetMapping
    public String getProperty(){
        String devName = "Raimond Nicusor Bulai";
        return devName;
    }
}