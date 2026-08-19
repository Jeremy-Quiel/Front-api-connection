package com.nity7.apiconnection.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;


@RestController
@RequestMapping("/api")
public class ApiController {
  @GetMapping("/usuarios")
  public Map<String, Object> getUsuario(@RequestParam(required = true) String name) {

    Map<String, Object> data = new HashMap<>();
    data.put("name", "Hola " + name + "!");
    
    return data;
  }
  
}
