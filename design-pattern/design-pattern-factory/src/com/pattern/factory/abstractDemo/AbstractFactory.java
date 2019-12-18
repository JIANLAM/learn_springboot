package com.pattern.factory.abstractDemo;

import com.pattern.factory.Human;
import com.pattern.factory.Man;
import com.pattern.factory.Women;

/**
 * @Author: linzj
 * @Date: 2019/12/18 12:44
 * @Desciption
 */
public class AbstractFactory extends god{


    @Override
    public Human createMan() {
        return new Man();
    }

    @Override
    public Human createWomen() {
        return new Women();
    }
}
