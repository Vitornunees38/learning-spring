package com.vnun.first_spring_app.controller;

import com.vnun.first_spring_app.domain.User;
import com.vnun.first_spring_app.service.HelloWorldService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

// Apis REST são STATELESS -> a cada nova requisição recebe todas as ifos necessárias para realizar a ação
// Apis STATEFULL -> mantêm  o estado de cada cliente no servidor

@RestController  // Indica que a classe é um controller Rest, combinando @Controller e @Responsebody
@RequestMapping("/hello-world")
public class HelloWorldController {
    //post, get, delet, put, patch, options, head

    @Autowired // Indica que essa dependencia deve ser injetada automaticamente
    private HelloWorldService helloWorldService;

//    Innjeta "na mão"
//    public HelloWorldController(HelloWorldService helloWorldService) {
//        this.helloWorldService = helloWorldService;
//    }

    @GetMapping // Indica que responde a requisições GET /hello-world
    public String helloWorld(){
        return helloWorldService.helloWorld("Vitor");
    }

//    @PostMapping
//    public String helloWorlPost(@RequestBody User body){
//
//        return "Hello World " + body.getName();
//    }

    @PostMapping("/{id}")
    public String helloWorlPost(@PathVariable("id") String id, @RequestParam(value= "filter", defaultValue = "none") String filter, @RequestBody User body){

        return "Hello World " + body.getName() + id + filter;
    }

}
