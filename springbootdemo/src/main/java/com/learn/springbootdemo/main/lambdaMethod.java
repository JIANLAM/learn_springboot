package com.learn.springbootdemo.main;

import com.learn.springbootdemo.entity.Person;

import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 * @Author: linzj
 * @Date: 2019/4/18 9:05
 * @Desciption
 */

public class lambdaMethod {


    public static void main(String[] args) {

        Person person1 = new Person();
        person1.setName("jianlam");
        person1.setAge(12);
        person1.setSex("男");

        Person person2 = new Person();
        person2.setName("jianlam");
        person2.setAge(10);
        person2.setSex("男");

        List<Person> list = new ArrayList();

        List<Person> list1 = Arrays.asList(new Person("jianlam",12,"男"));


        list.add(person1); list.add(person2);


//        list.forEach(person -> System.out.println(person.getAge()));
//
//
//        //使用流的形式排序  结果大于零降序，小于零升序
//        list.stream().filter(person -> person.getAge()>9).sorted((p1,p2)-> p2.getAge()- p1.getAge()).forEach(person -> System.out.println(person.getName()));
//
//
//        //判断值是否存在
//
//        boolean b = list.stream().allMatch(person -> person.getName().equals("jianlam"));
//
//        if (b){
//            System.out.println("确实存在jianlam");
//        }


        //求年龄的占比
        int sum = list.stream().mapToInt(Person::getAge).sum();

        System.out.println(sum);
        //设置格式
        DecimalFormat format = new DecimalFormat("00.00");


        List<String> stringList = list.stream()
                .mapToInt(Person::getAge)
                .mapToDouble(value -> value/sum * 100)
                .mapToObj(per -> per+"").collect(Collectors.toList());

        stringList.forEach(s -> System.out.println(s));


        String str = "";

        str = str + "-";

        System.out.println(str);

    }
}
