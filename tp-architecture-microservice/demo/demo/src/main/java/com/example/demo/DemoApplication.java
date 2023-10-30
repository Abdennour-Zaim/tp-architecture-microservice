package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

@SpringBootApplication
public class DemoApplication {

    public static void main(String[] args) {

        SpringApplication.run(DemoApplication.class, args);
        A a=new A();
        B b=new B();

        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("...");
        A a1 = applicationContext.getBean("A", A.class);
    }
}
