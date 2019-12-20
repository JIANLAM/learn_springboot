package com.pattern.singleton.hungry;

/**
 * @Author: linzj
 * @Date: 2019/12/18 14:13
 * @Desciption 饿汉模式
 *
 * 类加载的时候就初始化了
 */
public class HugrySingleton {

    private static HugrySingleton instance = new HugrySingleton();

    private  HugrySingleton(){

    }

    public static HugrySingleton getInstance(){
        return instance;
    }
}
