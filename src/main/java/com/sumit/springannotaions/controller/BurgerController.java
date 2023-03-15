package com.sumit.springannotaions.controller;

import com.sumit.springannotaions.service.Burger;
import com.sumit.springannotaions.service.ChickenBurger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class BurgerController {

    @Autowired
    private  Burger burger;


    public BurgerController(@Qualifier("chickenBurger") Burger burger){
        this.burger = burger;
    }

//    public String getChickenBurger(){
//        return chickenBurger.getChickenBurger();
//    }


    public String getBurger(){
        return burger.getBurger();
    }
}
