package com.learnSpring.learn_spring_framework.helloworld;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

//new feature introduced in JDK 16
record Person(String name, String gender, Address address) {
}

record Address(String country, String city) {
}

@Configuration
public class HelloWorldConfiguration {

    @Bean
    public String name() {
        return "Eliise";
    }

    @Bean
    public int age() {
        return 13;
    }

    @Bean
    public String name2() {
        return "Alexander";
    }

    @Bean
    public String gender2() {
        return "male";
    }

    @Bean
    public String gender() {
        return "female";
    }

    @Bean
    public Person person() {
         //        person.age();
        return new Person("Eleri", "female", address());
    }

    @Bean
    @Primary
    public Person person2MethodCall() {
        return new Person(name(), gender(), new Address("Baker Street", "London"));
    }

    @Bean
    public Person person3Parameters(String name2, String gender2, Address address3) {
        return new Person(name2, gender2, address3);
    }

    @Bean
    public Person person4Qualifier(String name2, String gender2, @Qualifier("addressQualifier") Address address2) {
        return new Person("Jane", "Austin", address2);
    }

    @Bean(name= "address2")
    @Qualifier("addressQualifier")
    public Address address() {
        return new Address("Estonia", "Pärnu");
    }

    @Bean(name= "address3")
    @Primary
    public Address address1() {
        return new Address("Berlin", "Germany");
    }
}
