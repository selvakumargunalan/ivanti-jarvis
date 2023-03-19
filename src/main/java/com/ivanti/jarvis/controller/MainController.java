package com.ivanti.jarvis.controller;

import com.fasterxml.jackson.databind.JsonNode;
import com.ivanti.jarvis.service.MainService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1")
public class MainController {

  @Autowired
  private MainService mainService;

  @GetMapping("/hello")
  public String sayHello(
    @RequestParam(value = "myName", defaultValue = "World")
    String name) {
    return String.format("Hello %s!", name);
  }

  @GetMapping(value = "/field-mappings", produces = MediaType.APPLICATION_JSON_VALUE)
  public JsonNode fetchFieldMapping() {
    return mainService.fetchFieldMapping();
  }

  @GetMapping(value = "/final-mappings", produces = MediaType.APPLICATION_JSON_VALUE)
  public JsonNode fetchFinalMapping() {
    return mainService.fetchFinalMapping();
  }
}
