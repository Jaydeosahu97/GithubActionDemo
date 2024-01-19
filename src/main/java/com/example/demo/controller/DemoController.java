package com.example.demo.controller;

import com.example.demo.service.DemoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class DemoController {
    @Autowired
    private DemoService demoService;
    @GetMapping
    public String hello(){
        return "Hello World";
    }

    @GetMapping("/{name}")
    public String addName(@PathVariable String name){
        return demoService.addName(name);
    }

    @GetMapping("/show")
    public List<String> showNames(){
        return demoService.showNames();
    }

   @GetMapping("/filter/{q}")
    public List<String> filterNames(@PathVariable String q){
        return demoService.filterNames(q);
   }
}
