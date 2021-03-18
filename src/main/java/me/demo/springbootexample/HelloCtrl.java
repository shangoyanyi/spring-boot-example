package me.demo.springbootexample;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloCtrl {

  @GetMapping
  public String hello() {
    return "Hello World i'm build in Azure Pipelines!";
  }
}