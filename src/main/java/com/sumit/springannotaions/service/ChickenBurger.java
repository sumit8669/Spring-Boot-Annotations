package com.sumit.springannotaions.service;

import org.springframework.stereotype.Component;

@Component
public class ChickenBurger implements Burger {

    public String getChickenBurger(){
        return "Chicken Tikka Burger !~!";
    }

    @Override
    public String getBurger() {

        return "Chicken Burger";
    }
}
