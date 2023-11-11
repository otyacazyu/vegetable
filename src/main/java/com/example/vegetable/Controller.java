package com.example.vegetable;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class Controller<VegetableName> {
    private final NameMapper nameMapper;


    public  Controller(NameMapper nameMapper){
        this.nameMapper = nameMapper;
    }

    @GetMapping("/vegeyables")
    public  List<VegetableName> names(){

        List names = nameMapper.findAll();
        return names;

    }

}
