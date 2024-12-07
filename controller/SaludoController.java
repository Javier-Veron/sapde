package com.sapde.sistAdmPresDocenEsc.controller;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController

public class SaludoController {
    @GetMapping("/hola")
    public String Saludar(){

        return "Hola Mundo";

    }
}
