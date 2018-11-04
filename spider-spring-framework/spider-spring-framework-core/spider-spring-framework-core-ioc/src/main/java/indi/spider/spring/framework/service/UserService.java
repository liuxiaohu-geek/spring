package indi.spider.spring.framework.service;

import indi.spider.spring.framework.entity.User;

import java.util.List;

public interface UserService {

    void insert();

    void update();

    List<User> list();

    void delete();

    User findByUserName(String userName);

    void insert(String userName, int age);


}
