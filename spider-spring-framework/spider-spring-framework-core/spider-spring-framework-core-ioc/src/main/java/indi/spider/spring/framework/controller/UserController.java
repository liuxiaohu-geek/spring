package indi.spider.spring.framework.controller;

import indi.spider.spring.framework.entity.User;
import indi.spider.spring.framework.service.UserService;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class UserController {

    private UserService userService;

    private int age;

    private String userName;

    public UserController(){

    }
    public UserController(UserService userService) {
        this.userService = userService;
    }


    public UserController(String userName, int age){
        this.userName = userName;
        this.age = age;
    }

    public void sayHello(){
        User hello = userService.findByUserName("hello");
        System.out.println(hello);
    }

    public void print(){
        System.out.println(userName + ", " + age);
    }

    public static void main(String[] args) {
        //GenericApplicationContext context = new GenericApplicationContext();
        ClassPathXmlApplicationContext classPathXmlApplicationContext = new ClassPathXmlApplicationContext("spring.xml");
        UserController userController = (UserController) classPathXmlApplicationContext.getBean("userController");
        userController.sayHello();
        userController.print();

        UserController userController1 = (UserController) classPathXmlApplicationContext.getBean("userController2");
        userController1.print();


    }
}
