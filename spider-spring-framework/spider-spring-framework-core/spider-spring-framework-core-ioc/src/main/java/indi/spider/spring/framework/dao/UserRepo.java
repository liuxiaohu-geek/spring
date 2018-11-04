package indi.spider.spring.framework.dao;

import indi.spider.spring.framework.entity.User;

import java.util.List;

public interface UserRepo {
    void insert();

    void update();

    List<User> list();

    void delete();

    User findByUserName(String userName);

    void insert(String userName, int age);
}
