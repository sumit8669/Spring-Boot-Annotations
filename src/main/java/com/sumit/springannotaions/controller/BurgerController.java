package com.sumit.springannotaions.controller;

import com.sumit.springannotaions.service.Burger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class BurgerController {


    private  Burger burger;

    @Autowired
    public BurgerController(@Qualifier("chickenBurger")Burger burger){
        this.burger = burger;
    }

//    public String getChickenBurger(){
//        return chickenBurger.getChickenBurger();
//    }


    public String getBurger(){
        return burger.getBurger();
    }
}
