package indi.spider.spring.framework.controller;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.beans.ConstructorProperties;

public class AccountController {

    private String userName;
    private int age;


    @ConstructorProperties({"user_name","age"})
    public AccountController(String userName, int age){
        this.userName = userName;
        this.age = age;

    }

    public void print(){
        System.out.println(this.userName + ". " + age);
    }

    public static void main(String[] args) {
        //GenericApplicationContext context = new GenericApplicationContext();
        ClassPathXmlApplicationContext classPathXmlApplicationContext = new ClassPathXmlApplicationContext("spring.xml");
        AccountController accountController = (AccountController) classPathXmlApplicationContext.getBean("accountController");
        accountController.print();

    }
}
