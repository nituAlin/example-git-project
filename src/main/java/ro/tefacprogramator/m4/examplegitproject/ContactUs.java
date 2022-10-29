package ro.tefacprogramator.m4.examplegitproject;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ContactUs {
    @GetMapping("/contact-us")
    public String contact(){
        return "Contact us";
    }
    
}