package com.pattern.singleton.lazy;

/**
 * @Author: linzj
 * @Date: 2019/12/18 14:13
 * @Desciption 懒汉模式
 *
 * 等你需要的时候在给你初始化，线程不安全的
 */
public class LazySingleton {

    private static LazySingleton instance;

    private LazySingleton(){

    }

    public static LazySingleton getInstance(){

       if (instance == null){
           instance = new LazySingleton();
       }
       return instance;
    }
}
