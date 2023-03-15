package com.sumit.springannotaions;

import com.sumit.springannotaions.controller.BurgerController;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringAnnotationsApplication {

	public static void main(String[] args) {


		var context = SpringApplication.run(SpringAnnotationsApplication.class, args);
		BurgerController br= (BurgerController) context.getBean("burgerController");
		System.out.println(br.getBurger());
	}

}
