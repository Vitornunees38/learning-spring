package com.vnun.first_spring_app.controller;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.GetMapping;

// Apis REST são STATELESS -> a cada nova requisição recebe todas as ifos necessárias para realizar a ação
// Apis STATEFULL -> mantêm  o estado de cada cliente no servidor

@RestController  // Indica que a classe é um controller Rest, combinando @Controller e @Responsebody
@RequestMapping("/hello-world")
public class HelloWorldController {
    //post, get, delet, put, patch, options, head

    @GetMapping // Indica que responde a requisições GET /hello-world
    public String helloWorld(){
        return "Hello World";
    }

}
