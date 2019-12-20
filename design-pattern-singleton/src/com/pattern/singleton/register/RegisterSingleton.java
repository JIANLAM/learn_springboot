package com.pattern.singleton.register;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/**
 * @Author: linzj
 * @Date: 2019/12/18 15:25
 * @Desciption
 */
public class RegisterSingleton {

    private static Map<String,Object>  map = new ConcurrentHashMap<>();

    public static RegisterSingleton getInstance() throws IllegalAccessException, InstantiationException {
        if (map.get(RegisterSingleton.class.getName()) == null){
            map.put(RegisterSingleton.class.getName(),RegisterSingleton.class.newInstance());
        }
        return RegisterSingleton.class.newInstance();
    }
}
