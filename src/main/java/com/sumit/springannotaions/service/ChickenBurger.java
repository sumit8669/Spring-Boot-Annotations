package com.sumit.springannotaions.service;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
public class ChickenBurger implements Burger {

    public String getChickenTikkaBurger(){
        return "Chicken Tikka Burger !~!";
    }

    @Override
    public String getBurger() {

        return "Chicken Burger!~~!";
    }
}
