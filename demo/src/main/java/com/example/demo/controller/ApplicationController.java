package com.example.demo.controller;

import com.example.demo.entity.Application;
import com.example.demo.repository.ApplicationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.LinkedList;
import java.util.List;

@RestController
@RequestMapping("/application")
public class ApplicationController {
    @Autowired
    private ApplicationRepository applicationRepository;
    @GetMapping
    public List<Application> index(){
        var numbers = new LinkedList<Application>();
        this.applicationRepository.findAll().forEach(numbers::add);
        return numbers;
    }

    @RequestMapping(path = "/{id}", method = RequestMethod.POST)
    public Long post(Application application){
        return this.applicationRepository.save(application).getId();
    }



}
