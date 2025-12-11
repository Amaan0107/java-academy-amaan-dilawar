package com.pluralsight.NorthwindTradersApi;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {
    // this method will respond to http://localhost:8080/
    @RequestMapping(path="/", method= RequestMethod.GET)
    public String index() {
        return "Hello World!";
    }
}
