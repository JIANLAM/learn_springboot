package com.pattern.factory;

import com.pattern.factory.abstractDemo.AbstractFactory;

/**
 * @Author: linzj
 * @Date: 2019/12/18 13:42
 * @Desciption
 */
public class TestMain {


    /**
     * 开闭原则，对扩展开放，对修改关闭
     * @param args
     */
    public static void main(String[] args) {
        AbstractFactory abstractFactory = new AbstractFactory();
        abstractFactory.createMan().getName();
        abstractFactory.createWomen().getName();
    }
}
