package com.example.springbootsecurity.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by gargg on 03/11/17.
 */
@RestController
@RequestMapping("/rest/v1")
public class MainController {

    @GetMapping("/unsecure/{echo}")
    public String unsecure(@PathVariable String echo){
        return "unsecure: Hello " + echo;
    }

    @GetMapping("/secure/{echo}")
    public String secure(@PathVariable String echo){
        return "secure: Hello " + echo;
    }
}
