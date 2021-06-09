package com.digitalinnovationone.springboot.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class test {

    //Com a anotação GetMapping o localhost retornará o metodo abaixo   
    @GetMapping("/")
    public String test(){
        return "Funcionando sem erros";
    }
}
