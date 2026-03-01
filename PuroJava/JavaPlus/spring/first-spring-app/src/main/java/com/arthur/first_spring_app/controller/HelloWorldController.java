package com.arthur.first_spring_app.controller;

import com.arthur.first_spring_app.domain.User;
import com.arthur.first_spring_app.service.HelloWorldService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
// o @RestController é uma anotação do Spring que indica que essa classe é um controlador de requisições RESTful. Ele combina as funcionalidades de @Controller e @ResponseBody, permitindo que os métodos da classe retornem diretamente os dados como resposta HTTP, em vez de renderizar uma view.
@RequestMapping("/hello-world")

public class HelloWorldController {
    // post, get, put, delete, patch, option, head

    @Autowired //injetar a dependência do serviço HelloWorldService na classe HelloWorldController. O Spring irá criar uma instância do HelloWorldService e injetá-la automaticamente na variável helloWorldService, permitindo que o controlador utilize os métodos do serviço para processar as requisições.
    private HelloWorldService helloWorldService;

    @GetMapping
    public String helloWorld() {
        return helloWorldService.HelloWorld("Arthur");
    }

    @PostMapping("/{id")
    public String helloWorldPost(@PathVariable("id") String id, @RequestParam(value = "filter", defaultValue = "nenhum") String filter, @RequestBody User body) {
        return "Hello, World " + body.getName() + id;
    }

}
