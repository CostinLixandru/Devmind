package com.devmind.firstapp;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class FirstSpringApp {



    public static void main(String args[]){

        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");


        iAnimal myCat = context.getBean("myCat", iAnimal.class);

        iAnimal myDog = context.getBean("myDog", iAnimal.class);

        Mouse myMouse = context.getBean("myMouse", Mouse.class);

        System.out.println(myDog.makeSound());

        System.out.println(myCat.makeSound());

        System.out.println("Culoare soarece: " + myMouse.getMouseColor());
        context.close();
    }
}
