package com.wildcodeschool.MyProjectWithSecurity.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldController {

    @GetMapping("/")
    public String hello() {
        return "Welcome to the SHIELD";
    }

    @GetMapping("/avengers/assemble")
    public String assemble() {
        return "Avengers...Assemble";
    }

    @GetMapping("/secret-bases")
    public String base() {
        return "Biarritz, Bordeaux, La Loupe, Lille, Lyon, Marseille, Orléans, Paris, Reims, Strasbourg, Toulouse, Tours, Amsterdam, Berlin, Breuxelles, Bucarest, Lisbonne, Londres, Madrid";
    }
}
