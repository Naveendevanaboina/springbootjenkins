package com.neoteric.springdocker2.springdocker2;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {
    @GetMapping("/dockerdemo")
    public String dockerdemo(){
        return "dockerdemo  with jenkins";
    }
}

