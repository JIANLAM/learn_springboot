package com.learn.springbootdemo.entity;

import lombok.Data;

/**
 * created by linzj on 2019/1/16
 **/

@Data
public class Person {

    private String name;
    private int age;
    private String sex;

    public Person(){
    }

    public Person(String name, int age, String sex){
        this.name = name;
        this.age = age;
        this.sex = sex;
    }
}
