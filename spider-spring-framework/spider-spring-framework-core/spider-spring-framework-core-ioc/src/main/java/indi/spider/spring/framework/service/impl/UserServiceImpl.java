package indi.spider.spring.framework.service.impl;

import indi.spider.spring.framework.entity.User;
import indi.spider.spring.framework.service.UserService;

import java.util.ArrayList;
import java.util.List;

public class UserServiceImpl implements UserService {
    @Override
    public void insert() {
        System.out.println("insert");
    }

    @Override
    public void update() {
        System.out.println("update");
    }

    @Override
    public List<User> list() {
        return new ArrayList<>();
    }

    @Override
    public void delete() {
        System.out.println("delete");
    }

    @Override
    public User findByUserName(String userName) {
        return new User();
    }

    @Override
    public void insert(String userName, int age) {
        System.out.println(new User(userName, age));
        System.out.println("insert operation");
    }
}
