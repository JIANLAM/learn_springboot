package com.learn.springbootdemo.main;

import com.learn.springbootdemo.entity.DTO.PersonDTO;
import com.learn.springbootdemo.entity.Person;
import org.modelmapper.ModelMapper;
import org.modelmapper.TypeToken;
import org.springframework.beans.factory.annotation.Autowired;

import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.List;

/**
 * created by linzj on 2019/1/16
 **/
public class UtilsMethod {


    public static void main(String[] args) {


        /**
         * modelmap 对集合的映射 -> TypeToken
         */
        Person person1 = new Person();
        person1.setName("jianlam");
        person1.setAge(12);
        person1.setSex("男");

        List<Person> list = new ArrayList<>();
        list.add(person1);

        ModelMapper modelMapper = new ModelMapper();

        List<PersonDTO> map = modelMapper.map(list, new TypeToken<List<PersonDTO>>() {
        }.getType());

        System.out.println(map);

    }
}
