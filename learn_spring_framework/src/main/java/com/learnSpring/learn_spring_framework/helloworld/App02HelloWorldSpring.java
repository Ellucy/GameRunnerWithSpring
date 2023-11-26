package com.learnSpring.learn_spring_framework.helloworld;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.Arrays;

public class App02HelloWorldSpring {

    public static void main(String[] args) {

        //Launch a Spring Context

        try (var context = new AnnotationConfigApplicationContext(HelloWorldConfiguration.class)) {

            //Configure the things that we want Spring to manage - @Configuration
            //inside HelloWorldConfiguration class

            //Retrieving beans managed by Spring
            System.out.println(context.getBean("name"));
            System.out.println(context.getBean("age"));

            //toString method is automatically implemented (record)
            System.out.println(context.getBean("person"));
            System.out.println(context.getBean("person2MethodCall"));
            System.out.println(context.getBean("person3Parameters"));

            System.out.println(context.getBean("address2"));
            //provides the same output
            System.out.println("Primary address: " + context.getBean(Address.class));
            System.out.println("Primary person: " + context.getBean(Person.class));

            Arrays.stream(context.getBeanDefinitionNames())
                    .forEach(System.out::println);

            System.out.println(context.getBean("person4Qualifier"));
        }
    }
}
