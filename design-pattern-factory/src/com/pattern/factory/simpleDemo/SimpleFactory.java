package com.pattern.factory.simpleDemo;

import com.pattern.factory.Human;
import com.pattern.factory.Man;
import com.pattern.factory.Women;

/**
 * @Author: linzj
 * @Date: 2019/12/18 12:44
 * @Desciption
 */
public class SimpleFactory {

    public Human getHumanByName(String name){
        if (name.equals("man")){
            return new Man();
        }else if(name.equals("women")){
            return new Women();
        }else {
            return null;
        }
    }
}
