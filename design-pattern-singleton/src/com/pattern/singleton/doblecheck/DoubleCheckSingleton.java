package com.pattern.singleton.doblecheck;

/**
 * @Author: linzj
 * @Date: 2019/12/18 14:13
 * @Desciption 双重检查模式
 *
 * 等你需要的时候在给你初始化
 * 加上双重校验
 */
public class DoubleCheckSingleton {

    private static  DoubleCheckSingleton instance = null;

    private DoubleCheckSingleton(){

    }

    public static DoubleCheckSingleton getInstance(){
        if (instance == null){
            synchronized (DoubleCheckSingleton.class){
                if (instance == null){
                    instance = new DoubleCheckSingleton();
                }
            }
        }
         return instance;
    }
}
