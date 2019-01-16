package com.learn.springbootdemo.main;

import com.learn.springbootdemo.entity.DTO.PersonDTO;
import com.learn.springbootdemo.entity.Person;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.ArrayList;
import java.util.List;

/**
 * created by linzj on 2019/1/16
 **/
public class UtilsMethod {

    @Autowired
    private ModelMapper modelMapper;

    public static void main(String[] args) {


        Person person1 = new Person();
        person1.setName("jianlam");
        person1.setAge(12);
        person1.setSex("男");

        List<Person> list = new ArrayList<>();

        PersonDTO personDTO = new PersonDTO();

    }
}
