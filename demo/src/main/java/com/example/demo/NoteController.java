package com.example.demo;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.stereotype.Controller;

@Controller    
public class NoteController {
    @GetMapping("/note")
    public String note() {
        return "note";
    }
}
