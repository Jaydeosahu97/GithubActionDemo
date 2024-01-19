package com.example.demo.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Service
public class DemoService {

    Logger log = LoggerFactory.getLogger(DemoService.class);
    private final List<String> names;
    public DemoService(){
        names = new ArrayList<>();
    }

    public String addName(String name){
        log.info("adding name");
        names.add(name);
        return "Name added successfully";
    }

    public List<String> showNames(){
        log.info("showing name");
        return names;
    }

    public List<String> filterNames(String query){
        log.info("filtering name with query provided");
        return names.stream().filter(name->name.startsWith(query)).toList();
    }
}
