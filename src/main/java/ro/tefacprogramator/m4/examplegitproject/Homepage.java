package ro.tefacprogramator.m4.examplegitproject;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Homepage {
    
    @GetMapping("/")
    public String home(){
        return "Hello there";
    }
}
