package com.nity7.apiconnection.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.HashMap;
import java.util.Map;



@RestController
@RequestMapping("/api")
public class ApiDosController {
  @GetMapping("/cafe")
  public Map<String, Object> getCafe() {
      Map<String, Object> data = new HashMap<>();
      data.put("cafe", "Expreso");

      return data;
  }
  
}
