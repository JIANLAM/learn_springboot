package com.pattern.factory.abstractDemo;

import com.pattern.factory.Human;

/**
 * @Author: linzj
 * @Date: 2019/12/18 13:39
 * @Desciption
 */
public abstract class god {


    /**
     * 制造一个男人
     */
    public abstract Human createMan();


    /**
     * 制造一个女人
     */
    public abstract Human createWomen();
}
