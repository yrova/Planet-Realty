package com.yrova.app.controller;

import com.yrova.app.repository.ExoPlanetRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/planet")
public class ExoPlanetController{

    @Autowired
    ExoPlanetRepository exoPlanetRepository;


    


}
