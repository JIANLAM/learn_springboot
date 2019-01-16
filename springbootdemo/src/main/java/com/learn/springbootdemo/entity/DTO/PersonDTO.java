package com.learn.springbootdemo.entity.DTO;

import lombok.Data;

import java.util.Date;

/**
 * created by linzj on 2019/1/16
 **/
@Data
public class PersonDTO {

    private String name;
    private int age;
    private String sex;
    private Date brithday;
    private String telephone;
}
