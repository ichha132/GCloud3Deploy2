package com.example.GcloudPractice3;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.*;

public class HelloWorld {
        @RequestMapping("/hello")
    public String hello()
    {
        return "Hello Ichha :)";
    }

}
