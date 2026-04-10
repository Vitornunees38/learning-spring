package com.vnun.first_spring_app.service;

import org.springframework.stereotype.Service;

@Service // Indica que é uma classe de service gerenciada pelo Spring
public class HelloWorldService {

    public String helloWorld(String name){
        return "hello World!" + name;
        
    }

}
