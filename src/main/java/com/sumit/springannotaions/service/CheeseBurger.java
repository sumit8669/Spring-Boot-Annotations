package com.sumit.springannotaions.service;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class CheeseBurger implements Burger {

    @Override
    public String getBurger() {
        return "Paneer Burger!~";
    }
}
