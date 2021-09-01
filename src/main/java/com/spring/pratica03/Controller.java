package com.spring.pratica03;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDate;

@RestController
public class Controller {

    @GetMapping("/{dia}/{mes}/{ano}")

    public int dataAniversario(@PathVariable int dia, @PathVariable int mes, @PathVariable int ano){
        int idade = LocalDate.now().getYear() - ano;
        return idade;
    }

}
