package com.sumit.springannotaions.controller;

import com.sumit.springannotaions.service.ChickenBurger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class BurgerController {

    @Autowired
    private final ChickenBurger chickenBurger;


    public BurgerController(ChickenBurger chickenBurger){
        this.chickenBurger = chickenBurger;
    }

    public String getChickenBurger(){
        return chickenBurger.getChickenBurger();
    }


    public String getBurger(){
        return "Chizzy Burger!!";
    }
}
