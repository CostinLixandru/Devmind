package com.app;

import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {

    public static void main(String[] args) {

        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

        Task task1 = context.getBean("myTask1", Task.class);

        System.out.println(task1.toString());

        Task task2 = context.getBean("myTask2", Task.class);

        System.out.println(task2.toString());


        context.close();
    }
}
