package indi.spider.spring.framework.entity;

import java.io.Serializable;
import java.util.Objects;

public class User implements Serializable {
    private String userName;

    private int age;

    public User() {

    }

    public User(String userName, int age) {
        this.userName = userName;
        this.age
                = age;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        User user = (User) o;
        return age == user.age &&
                Objects.equals(userName, user.userName);
    }

    @Override
    public int hashCode() {

        return Objects.hash(userName, age);
    }

    @Override
    public String toString() {
        return "User{" +
                "userName='" + userName + '\'' +
                ", age=" + age +
                '}';
    }
}
